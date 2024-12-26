from schemeVisitor import schemeVisitor

class schemeTreeVisitor(schemeVisitor):
    def visitRoot(self, ctx):
        [expression] = list(ctx.getChildren())
        print(self.visit(expression))

    def visitAddition(self, ctx):
        [operation, expression1, expression2] = list(ctx.getChildren())
        return self.visit(expressio1) + self.visit(expressio2)
        
    def visitNumberExpression(self, ctx):
        [number] = list(ctx.getChildren())
        return int(number.getText())
