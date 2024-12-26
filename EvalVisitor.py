
from schemeVisitor import schemeVisitor

class EvalVisitor(schemeVisitor):

    def __init__(self):
        self.enviroment = {}  

    def visitRoot(self, ctx):
        result = None
        for expr in ctx.expression():
            result = self.visit(expr)  
        return result
    
    def visitOp(self, ctx):
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
    

    def visitDefineVar(self, ctx):
        var_name = ctx.VAR().getText()
        value = self.visit(ctx.expression())
        self.enviroment[var_name] = value
        return None
    
    def visitVariable(self, ctx):
        var_name = ctx.VAR().getText()
        if var_name in self.enviroment:
            return self.enviroment[var_name]
        raise NameError(f"Undefined variable: {var_name}")

    def visitNumber(self, ctx):
        return int(ctx.NUM().getText())
