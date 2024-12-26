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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, LPAREN=11, RPAREN=12, DEFINE=13, IF=14, BOOL=15, COND=16, VAR=17, 
		NUM=18, STRING=19, WS=20;
	public static final int
		RULE_root = 0, RULE_statement = 1, RULE_expression = 2, RULE_condClause = 3, 
		RULE_operation = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "statement", "expression", "condClause", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'='", 
			"'<>'", "'('", "')'", "'define'", "'if'", null, "'cond'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "LPAREN", 
			"RPAREN", "DEFINE", "IF", "BOOL", "COND", "VAR", "NUM", "STRING", "WS"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 952320L) != 0)) {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineVarContext extends StatementContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode DEFINE() { return getToken(schemeParser.DEFINE, 0); }
		public TerminalNode VAR() { return getToken(schemeParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public DefineVarContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineFunctionContext extends StatementContext {
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
		public DefineFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				expression();
				}
				break;
			case 2:
				_localctx = new DefineVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(LPAREN);
				setState(20);
				match(DEFINE);
				setState(21);
				match(VAR);
				setState(22);
				expression();
				setState(23);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new DefineFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(LPAREN);
				setState(26);
				match(DEFINE);
				setState(27);
				match(LPAREN);
				setState(28);
				match(VAR);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(29);
					match(VAR);
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35);
				match(RPAREN);
				setState(36);
				expression();
				setState(37);
				match(RPAREN);
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
	public static class IfExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode IF() { return getToken(schemeParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public IfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExpressionContext {
		public TerminalNode VAR() { return getToken(schemeParser.VAR, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
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
	public static class BoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(schemeParser.BOOL, 0); }
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode COND() { return getToken(schemeParser.COND, 0); }
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public List<CondClauseContext> condClause() {
			return getRuleContexts(CondClauseContext.class);
		}
		public CondClauseContext condClause(int i) {
			return getRuleContext(CondClauseContext.class,i);
		}
		public CondExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(schemeParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new OpExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(LPAREN);
				setState(42);
				operation();
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					expression();
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 952320L) != 0) );
				setState(48);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(LPAREN);
				setState(51);
				match(VAR);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 952320L) != 0)) {
					{
					{
					setState(52);
					expression();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new IfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(LPAREN);
				setState(60);
				match(IF);
				setState(61);
				expression();
				setState(62);
				expression();
				setState(63);
				expression();
				setState(64);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new CondExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(LPAREN);
				setState(67);
				match(COND);
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68);
					condClause();
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(73);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(VAR);
				}
				break;
			case 6:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				match(STRING);
				}
				break;
			case 7:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				match(BOOL);
				}
				break;
			case 8:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondClauseContext extends ParserRuleContext {
		public CondClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condClause; }
	 
		public CondClauseContext() { }
		public void copyFrom(CondClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends CondClauseContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public CondContext(CondClauseContext ctx) { copyFrom(ctx); }
	}

	public final CondClauseContext condClause() throws RecognitionException {
		CondClauseContext _localctx = new CondClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condClause);
		try {
			_localctx = new CondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LPAREN);
			setState(82);
			expression();
			setState(83);
			expression();
			setState(84);
			match(RPAREN);
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
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2046L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0014Y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002-\b\u0002\u000b\u0002\f\u0002"+
		".\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"6\b\u0002\n\u0002\f\u00029\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002F\b\u0002\u000b\u0002\f\u0002G\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002P\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0001\u0001\u0000\u0001\na\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000"+
		"\u0006Q\u0001\u0000\u0000\u0000\bV\u0001\u0000\u0000\u0000\n\f\u0003\u0002"+
		"\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000"+
		"\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000"+
		"\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012"+
		"(\u0003\u0004\u0002\u0000\u0013\u0014\u0005\u000b\u0000\u0000\u0014\u0015"+
		"\u0005\r\u0000\u0000\u0015\u0016\u0005\u0011\u0000\u0000\u0016\u0017\u0003"+
		"\u0004\u0002\u0000\u0017\u0018\u0005\f\u0000\u0000\u0018(\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005\u000b\u0000\u0000\u001a\u001b\u0005\r\u0000"+
		"\u0000\u001b\u001c\u0005\u000b\u0000\u0000\u001c \u0005\u0011\u0000\u0000"+
		"\u001d\u001f\u0005\u0011\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#$\u0005\f\u0000\u0000$%\u0003\u0004\u0002\u0000%&\u0005\f\u0000\u0000"+
		"&(\u0001\u0000\u0000\u0000\'\u0012\u0001\u0000\u0000\u0000\'\u0013\u0001"+
		"\u0000\u0000\u0000\'\u0019\u0001\u0000\u0000\u0000(\u0003\u0001\u0000"+
		"\u0000\u0000)*\u0005\u000b\u0000\u0000*,\u0003\b\u0004\u0000+-\u0003\u0004"+
		"\u0002\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0005\f\u0000\u00001P\u0001\u0000\u0000\u000023\u0005\u000b\u0000\u0000"+
		"37\u0005\u0011\u0000\u000046\u0003\u0004\u0002\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:P\u0005"+
		"\f\u0000\u0000;<\u0005\u000b\u0000\u0000<=\u0005\u000e\u0000\u0000=>\u0003"+
		"\u0004\u0002\u0000>?\u0003\u0004\u0002\u0000?@\u0003\u0004\u0002\u0000"+
		"@A\u0005\f\u0000\u0000AP\u0001\u0000\u0000\u0000BC\u0005\u000b\u0000\u0000"+
		"CE\u0005\u0010\u0000\u0000DF\u0003\u0006\u0003\u0000ED\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0005\f\u0000\u0000JP\u0001\u0000"+
		"\u0000\u0000KP\u0005\u0011\u0000\u0000LP\u0005\u0013\u0000\u0000MP\u0005"+
		"\u000f\u0000\u0000NP\u0005\u0012\u0000\u0000O)\u0001\u0000\u0000\u0000"+
		"O2\u0001\u0000\u0000\u0000O;\u0001\u0000\u0000\u0000OB\u0001\u0000\u0000"+
		"\u0000OK\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0005\u0001\u0000\u0000\u0000"+
		"QR\u0005\u000b\u0000\u0000RS\u0003\u0004\u0002\u0000ST\u0003\u0004\u0002"+
		"\u0000TU\u0005\f\u0000\u0000U\u0007\u0001\u0000\u0000\u0000VW\u0007\u0000"+
		"\u0000\u0000W\t\u0001\u0000\u0000\u0000\u0007\r \'.7GO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}