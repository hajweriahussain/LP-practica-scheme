
from schemeVisitor import schemeVisitor

class EvalVisitor(schemeVisitor):

    def __init__(self):
        self.enviroment = {}  

    def visitRoot(self, ctx):
        result = None
        for statement in ctx.statement():
            result = self.visit(statement)
        return result
    
    def visitExpressionStatement(self, ctx):
        return self.visit(ctx.expression())

    def visitDefineVar(self, ctx):
        var_name = ctx.VAR().getText()
        value = self.visit(ctx.expression())
        self.enviroment[var_name] = value
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
            return operands[0] < operands[1]
        elif operator == '>':
            return operands[0] > operands[1]
        elif operator == '<=':
            return operands[0] <= operands[1]
        elif operator == '>=':
            return operands[0] >= operands[1]
        elif operator == '=':
            return operands[0] == operands[1]
        elif operator == '<>':
            return operands[0] != operands[1]
        
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
            condition = self.visit(clause.expression(0))  # Evalúa la condición
            if condition:
                return self.visit(clause.expression(1))  # Evalúa el valor asociado
        raise ValueError("No matching condition found in cond")

    def visitVariable(self, ctx):
        var_name = ctx.VAR().getText()
        if var_name in self.enviroment:
            return self.enviroment[var_name]
        raise NameError(f"Undefined variable: {var_name}")
    
    def visitString(self, ctx):
        return ctx.STRING().getText().strip('"')  

    def visitBool(self, ctx):
        bool_value = ctx.BOOL().getText()
        return bool_value == "#t" 

    def visitNumber(self, ctx):
        return int(ctx.NUM().getText())
    
