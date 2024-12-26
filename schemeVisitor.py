# Generated from scheme.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .schemeParser import schemeParser
else:
    from schemeParser import schemeParser

# This class defines a complete generic visitor for a parse tree produced by schemeParser.

class schemeVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by schemeParser#root.
    def visitRoot(self, ctx:schemeParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#DefineVar.
    def visitDefineVar(self, ctx:schemeParser.DefineVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#DefineFunction.
    def visitDefineFunction(self, ctx:schemeParser.DefineFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#OpExpression.
    def visitOpExpression(self, ctx:schemeParser.OpExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#FunctionCall.
    def visitFunctionCall(self, ctx:schemeParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Variable.
    def visitVariable(self, ctx:schemeParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Number.
    def visitNumber(self, ctx:schemeParser.NumberContext):
        return self.visitChildren(ctx)



del schemeParser