from schemeVisitor import schemeVisitor

class EvalVisitor(schemeVisitor):

    def __init__(self):
        self.enviroment = {}  

    def visitRoot(self, ctx):
        results = []
        for statement in ctx.statement():
            result = self.visit(statement)
            print(result) 
            if result is not None:
                results.append(result)
        # return results
    
    def visitExpressionStatement(self, ctx):
        return self.visit(ctx.expression())

    def visitDefineVar(self, ctx):
        var_name = ctx.VAR().getText()
        value = self.visit(ctx.expression())
        self.enviroment[var_name] = value
        print(f"Variable definida: {var_name} = {value}")  # Depuración opcional
        return None  

    def visitDefineFunction(self, ctx):
        func_name = ctx.VAR(0).getText()
        params = [param.getText() for param in ctx.VAR()[1:]]
        body = ctx.expression()
        self.enviroment[func_name] = (params, body)
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
        result = self.visit(body)
        self.enviroment = original_env  
        return result
    
    def visitIfExpression(self, ctx):
        condition = self.visit(ctx.expression(0))  
        if condition:  
            return self.visit(ctx.expression(1))  
        else:  
            return self.visit(ctx.expression(2)) 
        
    def visitCondExpression(self, ctx):
        for clause in ctx.condClause():
            condition = self.visit(clause.expression(0))  
            if condition:
                return self.visit(clause.expression(1))  
        raise ValueError("No matching condition found in cond")
    
    def visitListLiteral(self, ctx):
        return [self.visit(expr) for expr in ctx.expression()]
    

    def visitCarFunction(self, ctx):
        lst = self.visit(ctx.expression()) 
        if not isinstance(lst, list) or not lst: 
            raise ValueError("car expects a non-empty list")
        return lst[0] 


    def visitCdrFunction(self, ctx):
        lst = self.visit(ctx.expression())
        if not isinstance(lst, list) or not lst:
            raise ValueError("cdr expects a non-empty list")
        return lst[1:]

    def visitConsFunction(self, ctx):
        element = self.visit(ctx.expression(0))
        lst = self.visit(ctx.expression(1))
        if not isinstance(lst, list):
            raise ValueError("cons expects a list as the second argument")
        return [element] + lst

    def visitNullFunction(self, ctx):
        lst = self.visit(ctx.expression())
        return lst == []
    
    def visitLetExpression(self, ctx):
        # Crea un entorno temporal
        original_env = self.enviroment.copy()
        for pair in ctx.letPair():
            var_name = pair.VAR().getText()  # Nombre de la variable
            value = self.visit(pair.expression())  # Valor de la expresión
            self.enviroment[var_name] = value  # Guarda en el entorno temporal
        
        # Evalúa la expresión con el entorno temporal
        result = self.visit(ctx.expression())
        
        # Restaura el entorno original
        self.enviroment = original_env
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
    
