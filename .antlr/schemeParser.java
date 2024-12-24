// Generated from /home/hajweriahussain/UNI/Q5/LP/PRACTICA/scheme.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, WS=8;
	public static final int
		RULE_root = 0, RULE_expressionsBasiques = 1, RULE_expressioBasica = 2, 
		RULE_expressio = 3, RULE_operador = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expressionsBasiques", "expressioBasica", "expressio", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUM", "WS"
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
		public List<ExpressionsBasiquesContext> expressionsBasiques() {
			return getRuleContexts(ExpressionsBasiquesContext.class);
		}
		public ExpressionsBasiquesContext expressionsBasiques(int i) {
			return getRuleContext(ExpressionsBasiquesContext.class,i);
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(10);
				expressionsBasiques();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class ExpressionsBasiquesContext extends ParserRuleContext {
		public ExpressionsBasiquesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsBasiques; }
	 
		public ExpressionsBasiquesContext() { }
		public void copyFrom(ExpressionsBasiquesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressioBasiquesContext extends ExpressionsBasiquesContext {
		public ExpressioBasicaContext expressioBasica() {
			return getRuleContext(ExpressioBasicaContext.class,0);
		}
		public ExpressioBasiquesContext(ExpressionsBasiquesContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionsBasiquesContext expressionsBasiques() throws RecognitionException {
		ExpressionsBasiquesContext _localctx = new ExpressionsBasiquesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressionsBasiques);
		try {
			_localctx = new ExpressioBasiquesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			expressioBasica();
			setState(18);
			match(T__1);
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
	public static class ExpressioBasicaContext extends ParserRuleContext {
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public ExpressioBasicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressioBasica; }
	}

	public final ExpressioBasicaContext expressioBasica() throws RecognitionException {
		ExpressioBasicaContext _localctx = new ExpressioBasicaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressioBasica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250L) != 0)) {
				{
				{
				setState(20);
				expressio();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class ExpressioContext extends ParserRuleContext {
		public ExpressionsBasiquesContext expressionsBasiques() {
			return getRuleContext(ExpressionsBasiquesContext.class,0);
		}
		public TerminalNode NUM() { return getToken(schemeParser.NUM, 0); }
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ExpressioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressio; }
	}

	public final ExpressioContext expressio() throws RecognitionException {
		ExpressioContext _localctx = new ExpressioContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressio);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				expressionsBasiques();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(NUM);
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				operador();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	 
		public OperadorContext() { }
		public void copyFrom(OperadorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaContext extends OperadorContext {
		public SumaContext(OperadorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisioContext extends OperadorContext {
		public DivisioContext(OperadorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacioContext extends OperadorContext {
		public MultiplicacioContext(OperadorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestaContext extends OperadorContext {
		public RestaContext(OperadorContext ctx) { copyFrom(ctx); }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operador);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new SumaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new RestaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new MultiplicacioContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new DivisioContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\b&\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002\u0016\b\u0002"+
		"\n\u0002\f\u0002\u0019\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u001e\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004$\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0000\'\u0000\r\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000"+
		"\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000\u0006\u001d\u0001\u0000"+
		"\u0000\u0000\b#\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b"+
		"\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000"+
		"\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0001\u0000"+
		"\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0005\u0002\u0000"+
		"\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0006\u0003"+
		"\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u0005\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u001a\u001e\u0003\u0002\u0001\u0000\u001b\u001e\u0005\u0007\u0000"+
		"\u0000\u001c\u001e\u0003\b\u0004\u0000\u001d\u001a\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u0007\u0001\u0000\u0000\u0000\u001f$\u0005\u0003\u0000\u0000 $"+
		"\u0005\u0004\u0000\u0000!$\u0005\u0005\u0000\u0000\"$\u0005\u0006\u0000"+
		"\u0000#\u001f\u0001\u0000\u0000\u0000# \u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\t\u0001\u0000\u0000\u0000"+
		"\u0004\r\u0017\u001d#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}