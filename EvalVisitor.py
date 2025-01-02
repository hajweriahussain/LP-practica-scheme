from schemeVisitor import schemeVisitor

class EvalVisitor(schemeVisitor):

    def __init__(self):
        self.enviroment = {}  

    # def visitRoot(self, ctx):
    #     results = []
    #     for statement in ctx.statement():
    #         result = self.visit(statement)
    #         if result is not None:
    #             print(result) 
    #             results.append(result)
    #     # return results
    
    def visitRoot(self, ctx):
        for statement in ctx.statement():
            result = self.visit(statement)  # Evalúa cada declaración
            if result is not None:  # Si hay un resultado, imprímelo
                if isinstance(result, list):  # Si es una lista, formatearla como Scheme
                    print(self.format_list(result))
                else:
                    print(result)
    
    def visitExpressionStatement(self, ctx):
        return self.visit(ctx.expression())

    def visitDefineVar(self, ctx):
        # print("Evaluando una definición de variable...")
        var_name = ctx.VAR().getText()
        value = self.visit(ctx.expression())
        self.enviroment[var_name] = value
        print(f"Variable definida: {var_name} = {value}")
        # print(f"Entorno actual: {self.enviroment}")
        return None


    def visitDefineFunction(self, ctx):
        # print("Evaluando una definición de función...")
        func_name = ctx.VAR(0).getText()  # Nombre de la función
        params = [param.getText() for param in ctx.VAR()[1:]]  # Parámetros
        body = ctx.expression()  # Uso de la nueva regla "expressions"
        print(f"Función detectada: {func_name}, con parámetros: {params}")
        self.enviroment[func_name] = (params, body)
        # print(f"Entorno actualizado con función {func_name}: {self.enviroment}")
        return None

    
    def visitOpExpression(self, ctx):
        operator = ctx.operation().getText()
        operands = [self.visit(expr) for expr in ctx.expression()]
        
        if operator == '+':
            return operands[0] + operands[1]
        elif operator == '-':
            return operands[0] - operands[1]
        elif operator == '*':
            return operands[0] * operands[1]
        elif operator == '/':
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
            raise ValueError(f"Unsupported operator: {operator}")
        
    def visitFunctionCall(self, ctx):
        func_name = ctx.VAR().getText()
        if func_name not in self.enviroment:
            raise NameError(f"Undefined function: {func_name}")

        params, body = self.enviroment[func_name]
        args = [self.visit(arg) for arg in ctx.expression()]

        if len(args) != len(params):
            raise ValueError(f"Function '{func_name}' expected {len(params)} arguments but got {len(args)}")

        original_env = self.enviroment.copy()
        for param, arg in zip(params, args):
            self.enviroment[param] = arg

        result = None
        if isinstance(body, list):  # Si el cuerpo es una lista de expresiones
            for expr in body:
                result = self.visit(expr)  # Evalúa cada expresión
        else:
            result = self.visit(body)  # Evalúa una única expresión

        self.enviroment = original_env
        return result

    
    def visitIfExpression(self, ctx):
        condition = self.visit(ctx.expression(0))  
        if condition == '#t':  
            return self.visit(ctx.expression(1))  
        else:  
            return self.visit(ctx.expression(2)) 
        
    def visitCondExpression(self, ctx):
        for clause in ctx.condClause():
            # Obtener la condición literal
            condition_text = clause.expression(0).getText()
            # print(f"Evaluando cláusula con condición: {condition_text}")

            # Si la condición es "else", procesarla directamente
            if condition_text == "else":
                # print("Cláusula 'else' encontrada. Evaluando cuerpo asociado...")
                result = self.visit(clause.expression(1))
                # print(f"Resultado de cláusula 'else': {result}")
                return result

            # Evaluar la condición normalmente
            condition = self.visit(clause.expression(0))
            # print(f"Resultado de la condición: {condition}")
            if condition == "#t":  # Compara explícitamente con "#t"
                result = self.visit(clause.expression(1))
                # print(f"Condición verdadera. Resultado: {result}")
                return result

        # Si ninguna condición es verdadera, lanzar un error
        raise ValueError("No matching condition found in cond")
    
    def visitListLiteral(self, ctx):
        return [self.visit(expr) for expr in ctx.expression()]
    
    def format_list(self, scheme_list):
        """Convierte una lista de Python a una representación Scheme."""
        if not scheme_list:  # Lista vacía
            return "'()"
        return "'(" + " ".join(map(str, scheme_list)) + ")"

    def visitCarFunction(self, ctx):
        lst = self.visit(ctx.expression())
        # print(f"Evaluando car, lista recibida: {lst}")
        if not isinstance(lst, list) or not lst: 
            raise ValueError("car expects a non-empty list")
        result = lst[0]
        # print(f"Resultado de car: {result}")
        return result

    def visitCdrFunction(self, ctx):
        lst = self.visit(ctx.expression())
        # print(f"Evaluando cdr, lista recibida: {lst}")
        if not isinstance(lst, list) or not lst:
            raise ValueError("cdr expects a non-empty list")
        result = lst[1:]
        # print(f"Resultado de cdr: {result}")
        return result

    def visitConsFunction(self, ctx):
        element = self.visit(ctx.expression(0))
        lst = self.visit(ctx.expression(1))
        # print(f"Evaluando cons, elemento: {element}, lista: {lst}")
        if not isinstance(lst, list):
            raise ValueError("cons expects a list as the second argument")
        result = [element] + lst
        # print(f"Resultado de cons: {result}")
        return result

    def visitNullFunction(self, ctx):
        lst = self.visit(ctx.expression())
        # print(f"Evaluando null?, lista recibida: {lst}")
        if not lst:  # Si la lista es vacía
            # print("Resultado de null?: #t (lista vacía)")
            return "#t"
        # print("Resultado de null?: #f (lista no vacía)")
        return "#f"
    
    # def visitLetExpression(self, ctx):
    #     # Crea un entorno temporal
    #     print("Evaluando una expresión LET...")
    #     original_env = self.enviroment.copy()
    #     print(f"Entorno antes del LET: {original_env}")
    #     for pair in ctx.letPair():
    #         var_name = pair.VAR().getText()
    #         value = self.visit(pair.expression())
    #         print(f"Variable local definida en LET: {var_name} = {value}")
    #         self.enviroment[var_name] = value

    #     # Evalúa la expresión principal
    #     print(f"Entorno durante la evaluación del cuerpo del LET: {self.enviroment}")
    #     result = self.visit(ctx.expression())
    #     print(f"Resultado del cuerpo del LET: {result}")

    #     # Restaura el entorno original
    #     self.enviroment = original_env
    #     print(f"Entorno restaurado después del LET: {self.enviroment}")
    #     return result

    def visitLetExpression(self, ctx):
        # Crea un entorno temporal
        # print("Evaluando una expresión LET...")
        original_env = self.enviroment.copy()
        # print(f"Entorno antes del LET: {original_env}")
        
        # Definir las variables del let en el entorno temporal
        for pair in ctx.letPair():
            var_name = pair.VAR().getText()
            value = self.visit(pair.expression())
            print(f"Variable local definida en LET: {var_name} = {value}")
            self.enviroment[var_name] = value

        # Evalúa todas las expresiones en el cuerpo del let
        # print(f"Entorno durante la evaluación del cuerpo del LET: {self.enviroment}")
        result = None
        if hasattr(ctx, "expression"):
            for expr in ctx.expression():
                result = self.visit(expr)
                # print(f"Resultado de la expresión dentro del LET: {result}")
        else:
            result = self.visit(ctx.expression())
            # print(f"Resultado de la única expresión dentro del LET: {result}")
        
        # Restaura el entorno original
        self.enviroment = original_env
        # print(f"Entorno restaurado después del LET: {self.enviroment}")
        return result

    
    def visitAndExpression(self, ctx):
        for expr in ctx.expression():
            if self.visit(expr) == "#f":  # Si algún argumento es falso, retorna #f
                return "#f"
        return "#t"  # Todos los argumentos son verdaderos

    def visitOrExpression(self, ctx):
        for expr in ctx.expression():
            if self.visit(expr) == "#t":  # Si algún argumento es verdadero, retorna #t
                return "#t"
        return "#f"  # Todos los argumentos son falsos

    def visitNotExpression(self, ctx):
        value = self.visit(ctx.expression())
        return "#f" if value == "#t" else "#t"  # Invierte el valor booleano
    
    def visitDisplayFunction(self, ctx):
        value = self.visit(ctx.expression())  # Evalúa la expresión a mostrar
        if isinstance(value, list):  # Si es una lista, usa el formato Scheme
            print(self.format_list(value), end=' ')
        else:
            print(value, end=' ')  # Otros valores se imprimen directamente con espacio
        return None

    def visitNewlineFunction(self, ctx):
        print()  # Imprime una nueva línea
        return None

    def visitReadFunction(self, ctx):
        try:
            user_input = input("Esperando entrada del usuario para READ...\n").strip()
            # Detecta si la entrada parece ser una lista Scheme
            if user_input.startswith("'(") and user_input.endswith(")"):
                # Convierte de formato Scheme a una lista de Python
                user_input = user_input[2:-1]  # Elimina "'(" y ")"
                elements = user_input.split()  # Divide los elementos por espacios
                # Convierte elementos numéricos y deja los otros como cadenas
                parsed_list = [
                    int(el) if el.isdigit() else el for el in elements
                ]
                return parsed_list
            # Intenta convertir a número si no es una lista
            if user_input.isdigit():
                return int(user_input)
            try:
                return float(user_input)
            except ValueError:
                return user_input  # Devuelve el texto si no es un número ni lista
        except EOFError:
            raise ValueError("No input provided")


    
    def visitModExpression(self, ctx):
        # Evalúa los operandos
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        # Verifica que ambos operandos sean números
        if not isinstance(left, (int, float)) or not isinstance(right, (int, float)):
            raise ValueError(f"mod requiere dos números, pero recibió: {left}, {right}")

        # Calcula el módulo
        result = left % right
        # print(f"Calculando mod({left}, {right}) = {result}")  # Depuración
        return result

    def visitVariable(self, ctx):
        var_name = ctx.VAR().getText()
        if var_name in self.enviroment:
            return self.enviroment[var_name]
        raise NameError(f"Undefined variable: {var_name}")
    
    def visitString(self, ctx):
        return ctx.STRING().getText().strip('"')  

    def visitBool(self, ctx):
        return ctx.BOOL().getText()  # Devuelve directamente #t o #f

    def visitNumber(self, ctx):
        return int(ctx.NUM().getText())
    
