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


    # Visit a parse tree produced by schemeParser#expressioBasiques.
    def visitExpressioBasiques(self, ctx:schemeParser.ExpressioBasiquesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#expressioBasica.
    def visitExpressioBasica(self, ctx:schemeParser.ExpressioBasicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#expressio.
    def visitExpressio(self, ctx:schemeParser.ExpressioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Suma.
    def visitSuma(self, ctx:schemeParser.SumaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Resta.
    def visitResta(self, ctx:schemeParser.RestaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Multiplicacio.
    def visitMultiplicacio(self, ctx:schemeParser.MultiplicacioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#Divisio.
    def visitDivisio(self, ctx:schemeParser.DivisioContext):
        return self.visitChildren(ctx)



del schemeParser