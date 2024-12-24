# Generated from scheme.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,8,38,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,5,0,12,8,0,
        10,0,12,0,15,9,0,1,1,1,1,1,1,1,1,1,2,5,2,22,8,2,10,2,12,2,25,9,2,
        1,3,1,3,1,3,3,3,30,8,3,1,4,1,4,1,4,1,4,3,4,36,8,4,1,4,0,0,5,0,2,
        4,6,8,0,0,39,0,13,1,0,0,0,2,16,1,0,0,0,4,23,1,0,0,0,6,29,1,0,0,0,
        8,35,1,0,0,0,10,12,3,2,1,0,11,10,1,0,0,0,12,15,1,0,0,0,13,11,1,0,
        0,0,13,14,1,0,0,0,14,1,1,0,0,0,15,13,1,0,0,0,16,17,5,1,0,0,17,18,
        3,4,2,0,18,19,5,2,0,0,19,3,1,0,0,0,20,22,3,6,3,0,21,20,1,0,0,0,22,
        25,1,0,0,0,23,21,1,0,0,0,23,24,1,0,0,0,24,5,1,0,0,0,25,23,1,0,0,
        0,26,30,3,2,1,0,27,30,5,7,0,0,28,30,3,8,4,0,29,26,1,0,0,0,29,27,
        1,0,0,0,29,28,1,0,0,0,30,7,1,0,0,0,31,36,5,3,0,0,32,36,5,4,0,0,33,
        36,5,5,0,0,34,36,5,6,0,0,35,31,1,0,0,0,35,32,1,0,0,0,35,33,1,0,0,
        0,35,34,1,0,0,0,36,9,1,0,0,0,4,13,23,29,35
    ]

class schemeParser ( Parser ):

    grammarFileName = "scheme.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'+'", "'-'", "'*'", "'/'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "NUM", "WS" ]

    RULE_root = 0
    RULE_expressionsBasiques = 1
    RULE_expressioBasica = 2
    RULE_expressio = 3
    RULE_operador = 4

    ruleNames =  [ "root", "expressionsBasiques", "expressioBasica", "expressio", 
                   "operador" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    NUM=7
    WS=8

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressionsBasiques(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExpressionsBasiquesContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExpressionsBasiquesContext,i)


        def getRuleIndex(self):
            return schemeParser.RULE_root

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRoot" ):
                return visitor.visitRoot(self)
            else:
                return visitor.visitChildren(self)




    def root(self):

        localctx = schemeParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==1:
                self.state = 10
                self.expressionsBasiques()
                self.state = 15
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionsBasiquesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return schemeParser.RULE_expressionsBasiques

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class ExpressioBasiquesContext(ExpressionsBasiquesContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExpressionsBasiquesContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expressioBasica(self):
            return self.getTypedRuleContext(schemeParser.ExpressioBasicaContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressioBasiques" ):
                return visitor.visitExpressioBasiques(self)
            else:
                return visitor.visitChildren(self)



    def expressionsBasiques(self):

        localctx = schemeParser.ExpressionsBasiquesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expressionsBasiques)
        try:
            localctx = schemeParser.ExpressioBasiquesContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 16
            self.match(schemeParser.T__0)
            self.state = 17
            self.expressioBasica()
            self.state = 18
            self.match(schemeParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressioBasicaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressio(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExpressioContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExpressioContext,i)


        def getRuleIndex(self):
            return schemeParser.RULE_expressioBasica

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressioBasica" ):
                return visitor.visitExpressioBasica(self)
            else:
                return visitor.visitChildren(self)




    def expressioBasica(self):

        localctx = schemeParser.ExpressioBasicaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_expressioBasica)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 250) != 0):
                self.state = 20
                self.expressio()
                self.state = 25
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressioContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressionsBasiques(self):
            return self.getTypedRuleContext(schemeParser.ExpressionsBasiquesContext,0)


        def NUM(self):
            return self.getToken(schemeParser.NUM, 0)

        def operador(self):
            return self.getTypedRuleContext(schemeParser.OperadorContext,0)


        def getRuleIndex(self):
            return schemeParser.RULE_expressio

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressio" ):
                return visitor.visitExpressio(self)
            else:
                return visitor.visitChildren(self)




    def expressio(self):

        localctx = schemeParser.ExpressioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_expressio)
        try:
            self.state = 29
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 26
                self.expressionsBasiques()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 2)
                self.state = 27
                self.match(schemeParser.NUM)
                pass
            elif token in [3, 4, 5, 6]:
                self.enterOuterAlt(localctx, 3)
                self.state = 28
                self.operador()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OperadorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return schemeParser.RULE_operador

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class SumaContext(OperadorContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.OperadorContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSuma" ):
                return visitor.visitSuma(self)
            else:
                return visitor.visitChildren(self)


    class DivisioContext(OperadorContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.OperadorContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDivisio" ):
                return visitor.visitDivisio(self)
            else:
                return visitor.visitChildren(self)


    class MultiplicacioContext(OperadorContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.OperadorContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMultiplicacio" ):
                return visitor.visitMultiplicacio(self)
            else:
                return visitor.visitChildren(self)


    class RestaContext(OperadorContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.OperadorContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitResta" ):
                return visitor.visitResta(self)
            else:
                return visitor.visitChildren(self)



    def operador(self):

        localctx = schemeParser.OperadorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_operador)
        try:
            self.state = 35
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [3]:
                localctx = schemeParser.SumaContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 31
                self.match(schemeParser.T__2)
                pass
            elif token in [4]:
                localctx = schemeParser.RestaContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 32
                self.match(schemeParser.T__3)
                pass
            elif token in [5]:
                localctx = schemeParser.MultiplicacioContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 33
                self.match(schemeParser.T__4)
                pass
            elif token in [6]:
                localctx = schemeParser.DivisioContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 34
                self.match(schemeParser.T__5)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





