// Generated from /home/hajweriahussain/UNI/Q5/LP/lp-practica-scheme/scheme.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class schemeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, DEFINE=3, VAR=4, NUM=5, OPERATOR=6, WS=7;
	public static final int
		RULE_root = 0, RULE_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'define'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "DEFINE", "VAR", "NUM", "OPERATOR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "scheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public schemeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(schemeParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50L) != 0)) {
				{
				{
				setState(4);
				expression();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExpressionContext {
		public TerminalNode VAR() { return getToken(schemeParser.VAR, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode OPERATOR() { return getToken(schemeParser.OPERATOR, 0); }
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OpExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExpressionContext {
		public TerminalNode NUM() { return getToken(schemeParser.NUM, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineVarContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode DEFINE() { return getToken(schemeParser.DEFINE, 0); }
		public TerminalNode VAR() { return getToken(schemeParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public DefineVarContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineFunctionContext extends ExpressionContext {
		public List<TerminalNode> LPAREN() { return getTokens(schemeParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(schemeParser.LPAREN, i);
		}
		public TerminalNode DEFINE() { return getToken(schemeParser.DEFINE, 0); }
		public List<TerminalNode> VAR() { return getTokens(schemeParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(schemeParser.VAR, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(schemeParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(schemeParser.RPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefineFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode VAR() { return getToken(schemeParser.VAR, 0); }
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DefineVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(LPAREN);
				setState(13);
				match(DEFINE);
				setState(14);
				match(VAR);
				setState(15);
				expression();
				setState(16);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new DefineFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(LPAREN);
				setState(19);
				match(DEFINE);
				setState(20);
				match(LPAREN);
				setState(21);
				match(VAR);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(22);
					match(VAR);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				match(RPAREN);
				setState(29);
				expression();
				setState(30);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new OpExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(LPAREN);
				setState(33);
				match(OPERATOR);
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					expression();
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50L) != 0) );
				setState(39);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				match(LPAREN);
				setState(42);
				match(VAR);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50L) != 0)) {
					{
					{
					setState(43);
					expression();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(VAR);
				}
				break;
			case 6:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(NUM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00077\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0005\u0000\u0006\b\u0000\n\u0000\f\u0000\t\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001$\b\u0001\u000b\u0001\f\u0001%\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001"+
		"\u0000\u0000\u0002\u0000\u0002\u0000\u0000=\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u00024\u0001\u0000\u0000\u0000\u0004\u0006\u0003\u0002\u0001\u0000"+
		"\u0005\u0004\u0001\u0000\u0000\u0000\u0006\t\u0001\u0000\u0000\u0000\u0007"+
		"\u0005\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b\n\u0001"+
		"\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\n\u000b\u0005\u0000"+
		"\u0000\u0001\u000b\u0001\u0001\u0000\u0000\u0000\f\r\u0005\u0001\u0000"+
		"\u0000\r\u000e\u0005\u0003\u0000\u0000\u000e\u000f\u0005\u0004\u0000\u0000"+
		"\u000f\u0010\u0003\u0002\u0001\u0000\u0010\u0011\u0005\u0002\u0000\u0000"+
		"\u00115\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013"+
		"\u0014\u0005\u0003\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015"+
		"\u0019\u0005\u0004\u0000\u0000\u0016\u0018\u0005\u0004\u0000\u0000\u0017"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u0002\u0000\u0000\u001d\u001e\u0003\u0002\u0001\u0000\u001e"+
		"\u001f\u0005\u0002\u0000\u0000\u001f5\u0001\u0000\u0000\u0000 !\u0005"+
		"\u0001\u0000\u0000!#\u0005\u0006\u0000\u0000\"$\u0003\u0002\u0001\u0000"+
		"#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u0002"+
		"\u0000\u0000(5\u0001\u0000\u0000\u0000)*\u0005\u0001\u0000\u0000*.\u0005"+
		"\u0004\u0000\u0000+-\u0003\u0002\u0001\u0000,+\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000015\u0005\u0002"+
		"\u0000\u000025\u0005\u0004\u0000\u000035\u0005\u0005\u0000\u00004\f\u0001"+
		"\u0000\u0000\u00004\u0012\u0001\u0000\u0000\u00004 \u0001\u0000\u0000"+
		"\u00004)\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000043\u0001\u0000"+
		"\u0000\u00005\u0003\u0001\u0000\u0000\u0000\u0005\u0007\u0019%.4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}