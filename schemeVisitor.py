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


    # Visit a parse tree produced by schemeParser#ExpressionStatement.
    def visitExpressionStatement(self, ctx:schemeParser.ExpressionStatementContext):
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


    # Visit a parse tree produced by schemeParser#IfExpression.
    def visitIfExpression(self, ctx:schemeParser.IfExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#CondExpression.
    def visitCondExpression(self, ctx:schemeParser.CondExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#CarFunction.
    def visitCarFunction(self, ctx:schemeParser.CarFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#CdrFunction.
    def visitCdrFunction(self, ctx:schemeParser.CdrFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#ConsFunction.
    def visitConsFunction(self, ctx:schemeParser.ConsFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#NullFunction.
    def visitNullFunction(self, ctx:schemeParser.NullFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#ListLiteral.
    def visitListLiteral(self, ctx:schemeParser.ListLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#LetExpression.
    def visitLetExpression(self, ctx:schemeParser.LetExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#AndExpression.
    def visitAndExpression(self, ctx:schemeParser.AndExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#OrExpression.
    def visitOrExpression(self, ctx:schemeParser.OrExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#NotExpression.
    def visitNotExpression(self, ctx:schemeParser.NotExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Variable.
    def visitVariable(self, ctx:schemeParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#String.
    def visitString(self, ctx:schemeParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Bool.
    def visitBool(self, ctx:schemeParser.BoolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Number.
    def visitNumber(self, ctx:schemeParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Cond.
    def visitCond(self, ctx:schemeParser.CondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#LetBinding.
    def visitLetBinding(self, ctx:schemeParser.LetBindingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#operation.
    def visitOperation(self, ctx:schemeParser.OperationContext):
        return self.visitChildren(ctx)



del schemeParser