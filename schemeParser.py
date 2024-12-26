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
        4,1,7,55,2,0,7,0,2,1,7,1,1,0,5,0,6,8,0,10,0,12,0,9,9,0,1,0,1,0,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,5,1,24,8,1,10,1,12,1,27,
        9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,1,36,8,1,11,1,12,1,37,1,1,1,1,
        1,1,1,1,1,1,5,1,45,8,1,10,1,12,1,48,9,1,1,1,1,1,1,1,3,1,53,8,1,1,
        1,0,0,2,0,2,0,0,61,0,7,1,0,0,0,2,52,1,0,0,0,4,6,3,2,1,0,5,4,1,0,
        0,0,6,9,1,0,0,0,7,5,1,0,0,0,7,8,1,0,0,0,8,10,1,0,0,0,9,7,1,0,0,0,
        10,11,5,0,0,1,11,1,1,0,0,0,12,13,5,1,0,0,13,14,5,3,0,0,14,15,5,4,
        0,0,15,16,3,2,1,0,16,17,5,2,0,0,17,53,1,0,0,0,18,19,5,1,0,0,19,20,
        5,3,0,0,20,21,5,1,0,0,21,25,5,4,0,0,22,24,5,4,0,0,23,22,1,0,0,0,
        24,27,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,0,26,28,1,0,0,0,27,25,1,
        0,0,0,28,29,5,2,0,0,29,30,3,2,1,0,30,31,5,2,0,0,31,53,1,0,0,0,32,
        33,5,1,0,0,33,35,5,6,0,0,34,36,3,2,1,0,35,34,1,0,0,0,36,37,1,0,0,
        0,37,35,1,0,0,0,37,38,1,0,0,0,38,39,1,0,0,0,39,40,5,2,0,0,40,53,
        1,0,0,0,41,42,5,1,0,0,42,46,5,4,0,0,43,45,3,2,1,0,44,43,1,0,0,0,
        45,48,1,0,0,0,46,44,1,0,0,0,46,47,1,0,0,0,47,49,1,0,0,0,48,46,1,
        0,0,0,49,53,5,2,0,0,50,53,5,4,0,0,51,53,5,5,0,0,52,12,1,0,0,0,52,
        18,1,0,0,0,52,32,1,0,0,0,52,41,1,0,0,0,52,50,1,0,0,0,52,51,1,0,0,
        0,53,3,1,0,0,0,5,7,25,37,46,52
    ]

class schemeParser ( Parser ):

    grammarFileName = "scheme.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'define'" ]

    symbolicNames = [ "<INVALID>", "LPAREN", "RPAREN", "DEFINE", "VAR", 
                      "NUM", "OPERATOR", "WS" ]

    RULE_root = 0
    RULE_expression = 1

    ruleNames =  [ "root", "expression" ]

    EOF = Token.EOF
    LPAREN=1
    RPAREN=2
    DEFINE=3
    VAR=4
    NUM=5
    OPERATOR=6
    WS=7

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

        def EOF(self):
            return self.getToken(schemeParser.EOF, 0)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExpressionContext,i)


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
            self.state = 7
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 50) != 0):
                self.state = 4
                self.expression()
                self.state = 9
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 10
            self.match(schemeParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return schemeParser.RULE_expression

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class VariableContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def VAR(self):
            return self.getToken(schemeParser.VAR, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariable" ):
                return visitor.visitVariable(self)
            else:
                return visitor.visitChildren(self)


    class OpExpressionContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LPAREN(self):
            return self.getToken(schemeParser.LPAREN, 0)
        def OPERATOR(self):
            return self.getToken(schemeParser.OPERATOR, 0)
        def RPAREN(self):
            return self.getToken(schemeParser.RPAREN, 0)
        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExpressionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpExpression" ):
                return visitor.visitOpExpression(self)
            else:
                return visitor.visitChildren(self)


    class NumberContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUM(self):
            return self.getToken(schemeParser.NUM, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNumber" ):
                return visitor.visitNumber(self)
            else:
                return visitor.visitChildren(self)


    class DefineVarContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LPAREN(self):
            return self.getToken(schemeParser.LPAREN, 0)
        def DEFINE(self):
            return self.getToken(schemeParser.DEFINE, 0)
        def VAR(self):
            return self.getToken(schemeParser.VAR, 0)
        def expression(self):
            return self.getTypedRuleContext(schemeParser.ExpressionContext,0)

        def RPAREN(self):
            return self.getToken(schemeParser.RPAREN, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDefineVar" ):
                return visitor.visitDefineVar(self)
            else:
                return visitor.visitChildren(self)


    class DefineFunctionContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LPAREN(self, i:int=None):
            if i is None:
                return self.getTokens(schemeParser.LPAREN)
            else:
                return self.getToken(schemeParser.LPAREN, i)
        def DEFINE(self):
            return self.getToken(schemeParser.DEFINE, 0)
        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(schemeParser.VAR)
            else:
                return self.getToken(schemeParser.VAR, i)
        def RPAREN(self, i:int=None):
            if i is None:
                return self.getTokens(schemeParser.RPAREN)
            else:
                return self.getToken(schemeParser.RPAREN, i)
        def expression(self):
            return self.getTypedRuleContext(schemeParser.ExpressionContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDefineFunction" ):
                return visitor.visitDefineFunction(self)
            else:
                return visitor.visitChildren(self)


    class FunctionCallContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LPAREN(self):
            return self.getToken(schemeParser.LPAREN, 0)
        def VAR(self):
            return self.getToken(schemeParser.VAR, 0)
        def RPAREN(self):
            return self.getToken(schemeParser.RPAREN, 0)
        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExpressionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionCall" ):
                return visitor.visitFunctionCall(self)
            else:
                return visitor.visitChildren(self)



    def expression(self):

        localctx = schemeParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.state = 52
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                localctx = schemeParser.DefineVarContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 12
                self.match(schemeParser.LPAREN)
                self.state = 13
                self.match(schemeParser.DEFINE)
                self.state = 14
                self.match(schemeParser.VAR)
                self.state = 15
                self.expression()
                self.state = 16
                self.match(schemeParser.RPAREN)
                pass

            elif la_ == 2:
                localctx = schemeParser.DefineFunctionContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 18
                self.match(schemeParser.LPAREN)
                self.state = 19
                self.match(schemeParser.DEFINE)
                self.state = 20
                self.match(schemeParser.LPAREN)
                self.state = 21
                self.match(schemeParser.VAR)
                self.state = 25
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==4:
                    self.state = 22
                    self.match(schemeParser.VAR)
                    self.state = 27
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 28
                self.match(schemeParser.RPAREN)
                self.state = 29
                self.expression()
                self.state = 30
                self.match(schemeParser.RPAREN)
                pass

            elif la_ == 3:
                localctx = schemeParser.OpExpressionContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 32
                self.match(schemeParser.LPAREN)
                self.state = 33
                self.match(schemeParser.OPERATOR)
                self.state = 35 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 34
                    self.expression()
                    self.state = 37 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 50) != 0)):
                        break

                self.state = 39
                self.match(schemeParser.RPAREN)
                pass

            elif la_ == 4:
                localctx = schemeParser.FunctionCallContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 41
                self.match(schemeParser.LPAREN)
                self.state = 42
                self.match(schemeParser.VAR)
                self.state = 46
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 50) != 0):
                    self.state = 43
                    self.expression()
                    self.state = 48
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 49
                self.match(schemeParser.RPAREN)
                pass

            elif la_ == 5:
                localctx = schemeParser.VariableContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 50
                self.match(schemeParser.VAR)
                pass

            elif la_ == 6:
                localctx = schemeParser.NumberContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 51
                self.match(schemeParser.NUM)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





