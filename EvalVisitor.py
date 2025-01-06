from schemeVisitor import schemeVisitor

class EvalVisitor(schemeVisitor):

    def __init__(self):
        # Inicialitza l'entorn d'execució com un diccionari buit.
        self.enviroment = {}

    def visitRoot(self, ctx):
        # Avalua cada declaració dins del node arrel i mostra el resultat.
        for statement in ctx.statement():
            result = self.visit(statement)
            if result is not None:
                if isinstance(result, list):
                    print(self.format_list(result))
                else:
                    print(result)

    def visitExpressionStatement(self, ctx):
        # Avalua una expressió i en retorna el resultat.
        return self.visit(ctx.expression())

    def visitDefineVar(self, ctx):
        # Defineix una variable i assigna el seu valor a l'entorn.
        var_name = ctx.VAR().getText()
        value = self.visit(ctx.expression())
        self.enviroment[var_name] = value
        return None

    def visitDefineFunction(self, ctx):
        # Defineix una funció amb paràmetres i cos, i l'afegeix a l'entorn.
        func_name = ctx.VAR(0).getText()
        params = [param.getText() for param in ctx.VAR()[1:]]
        body = ctx.expression()
        self.enviroment[func_name] = (params, body)
        return None

    def visitOpExpression(self, ctx):
        # Avalua operacions matemàtiques i comparacions entre operands.
        operator = ctx.operation().getText()
        operands = [self.visit(expr) for expr in ctx.expression()]

        if operator == '+':
            return operands[0] + operands[1]
        elif operator == '-':
            return operands[0] - operands[1]
        elif operator == '*':
            return operands[0] * operands[1]
        elif operator == '/':
            if operands[1] == 0:
                raise ValueError("Error: Divisió per zero no permesa")
            return operands[0] / operands[1]
        elif operator == '<':
            return "#t" if operands[0] < operands[1] else "#f"
        elif operator == '>':
            return "#t" if operands[0] > operands[1] else "#f"
        elif operator == '<=':
            return "#t" if operands[0] <= operands[1] else "#f"
        elif operator == '>=':
            return "#t" if operands[0] >= operands[1] else "#f"
        elif operator == '=':
            return "#t" if operands[0] == operands[1] else "#f"
        elif operator == '<>':
            return "#t" if operands[0] != operands[1] else "#f"
        else:
            raise ValueError(f"Operador no suportat: {operator}")

    def visitFunctionCall(self, ctx):
        # Avalua la crida d'una funció amb els arguments proporcionats.
        func_name = ctx.VAR().getText()
        if func_name not in self.enviroment:
            raise NameError(f"Funció no definida: {func_name}")

        params, body = self.enviroment[func_name]
        args = [self.visit(arg) for arg in ctx.expression()]

        if len(args) != len(params):
            raise ValueError(f"La funció '{func_name}' esperava {len(params)} arguments, però se n'han proporcionat {len(args)}")

        original_env = self.enviroment.copy()
        for param, arg in zip(params, args):
            self.enviroment[param] = arg

        result = None
        if isinstance(body, list):
            for expr in body:
                result = self.visit(expr)
        else:
            result = self.visit(body)

        self.enviroment = original_env
        return result

    def visitIfExpression(self, ctx):
        # Avalua una expressió condicional "if" i retorna el resultat.
        condition = self.visit(ctx.expression(0))
        if condition == "#t":
            return self.visit(ctx.expression(1))
        else:
            return self.visit(ctx.expression(2))

    def visitCondExpression(self, ctx):
        # Avalua una expressió "cond" i retorna el resultat del primer cas veritable.
        for clause in ctx.condClause():
            condition = self.visit(clause.expression(0))
            if condition == "#t":
                return self.visit(clause.expression(1))
        raise ValueError("No s'ha trobat cap condició coincident en cond")

    def visitListLiteral(self, ctx):
        # Crea i retorna una llista a partir de les expressions proporcionades.
        return [self.visit(expr) for expr in ctx.expression()]

    def format_list(self, scheme_list):
        # Converteix una llista de Python al format de representació de Scheme.
        if not scheme_list:
            return "'()"
        return "'(" + " ".join(map(str, scheme_list)) + ")"

    def visitCarFunction(self, ctx):
        # Retorna el primer element d'una llista (car).
        lst = self.visit(ctx.expression())
        if not isinstance(lst, list) or not lst:
            raise ValueError("car espera una llista no buida")
        return lst[0]

    def visitCdrFunction(self, ctx):
        # Retorna la llista sense el primer element (cdr).
        lst = self.visit(ctx.expression())
        if not isinstance(lst, list) or not lst:
            raise ValueError("cdr espera una llista no buida")
        return lst[1:]

    def visitConsFunction(self, ctx):
        # Afegeix un element al principi d'una llista (cons).
        element = self.visit(ctx.expression(0))
        lst = self.visit(ctx.expression(1))
        if not isinstance(lst, list):
            raise ValueError("cons espera una llista com a segon argument")
        return [element] + lst

    def visitNullFunction(self, ctx):
        # Verifica si una llista és buida (null?).
        lst = self.visit(ctx.expression())
        return "#t" if not lst else "#f"

    def visitLetExpression(self, ctx):
        # Avalua una expressió LET, definint variables locals temporals.
        original_env = self.enviroment.copy()
        for pair in ctx.letPair():
            var_name = pair.VAR().getText()
            value = self.visit(pair.expression())
            self.enviroment[var_name] = value

        result = None
        if hasattr(ctx, "expression"):
            for expr in ctx.expression():
                result = self.visit(expr)
        else:
            result = self.visit(ctx.expression())

        self.enviroment = original_env
        return result

    def visitAndExpression(self, ctx):
        # Avalua una expressió lògica "and" i retorna el resultat.
        for expr in ctx.expression():
            if self.visit(expr) == "#f":
                return "#f"
        return "#t"

    def visitOrExpression(self, ctx):
        # Avalua una expressió lògica "or" i retorna el resultat.
        for expr in ctx.expression():
            if self.visit(expr) == "#t":
                return "#t"
        return "#f"

    def visitNotExpression(self, ctx):
        # Avalua una expressió lògica "not" i retorna el resultat.
        value = self.visit(ctx.expression())
        return "#f" if value == "#t" else "#t"

    def visitDisplayFunction(self, ctx):
        # Mostra el resultat d'una expressió a la terminal.
        value = self.visit(ctx.expression())
        if isinstance(value, list):
            print(self.format_list(value), end=' ')
        else:
            print(value, end=' ')
        return None

    def visitNewlineFunction(self, ctx):
        # Genera un salt de línia a la terminal.
        print()
        return None

    def visitReadFunction(self, ctx):
        # Llegeix una entrada de l'usuari, detectant llistes i nombres.
        try:
            user_input = input()
            if user_input.startswith("'(") and user_input.endswith(")"):
                user_input = user_input[2:-1]
                elements = user_input.split()
                parsed_list = [
                    int(el) if el.isdigit() else el for el in elements
                ]
                return parsed_list
            if user_input.isdigit():
                return int(user_input)
            try:
                return float(user_input)
            except ValueError:
                return user_input
        except EOFError:
            raise ValueError("No s'ha proporcionat cap entrada")

    def visitModExpression(self, ctx):
        # Avalua una operació de mòdul entre dos enters.
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        if not isinstance(left, int) or not isinstance(right, int):
            raise ValueError("Error: mod requereix dos nombres enters")

        if right == 0:
            raise ValueError("Error: Mòdul per zero no permès")

        return left % right

    def visitVariable(self, ctx):
        # Retorna el valor d'una variable definida a l'entorn.
        var_name = ctx.VAR().getText()
        if var_name in self.enviroment:
            return self.enviroment[var_name]
        raise NameError(f"Variable no definida: {var_name}")

    def visitString(self, ctx):
        # Retorna el valor d'una cadena literal.
        return ctx.STRING().getText().strip('"')

    def visitBool(self, ctx):
        # Retorna el valor d'un booleà (#t o #f).
        return ctx.BOOL().getText()

    def visitNumber(self, ctx):
        # Retorna el valor d'un nombre enter.
        return int(ctx.NUM().getText())
