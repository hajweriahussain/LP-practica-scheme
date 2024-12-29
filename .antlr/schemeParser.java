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
		T__9=10, LPAREN=11, RPAREN=12, DEFINE=13, IF=14, BOOL=15, AND=16, OR=17, 
		NOT=18, COND=19, CAR=20, CDR=21, CONS=22, NULL=23, LET=24, QUOTE=25, VAR=26, 
		NUM=27, STRING=28, COMMENT=29, WS=30;
	public static final int
		RULE_root = 0, RULE_statement = 1, RULE_expression = 2, RULE_condClause = 3, 
		RULE_letPair = 4, RULE_operation = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "statement", "expression", "condClause", "letPair", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'='", 
			"'<>'", "'('", "')'", "'define'", "'if'", null, "'and'", "'or'", "'not'", 
			"'cond'", "'car'", "'cdr'", "'cons'", "'null?'", "'let'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "LPAREN", 
			"RPAREN", "DEFINE", "IF", "BOOL", "AND", "OR", "NOT", "COND", "CAR", 
			"CDR", "CONS", "NULL", "LET", "QUOTE", "VAR", "NUM", "STRING", "COMMENT", 
			"WS"
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
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503351296L) != 0)) {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				expression();
				}
				break;
			case 2:
				_localctx = new DefineVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(LPAREN);
				setState(22);
				match(DEFINE);
				setState(23);
				match(VAR);
				setState(24);
				expression();
				setState(25);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new DefineFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(LPAREN);
				setState(28);
				match(DEFINE);
				setState(29);
				match(LPAREN);
				setState(30);
				match(VAR);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(31);
					match(VAR);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(RPAREN);
				setState(38);
				expression();
				setState(39);
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
	public static class CdrFunctionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode CDR() { return getToken(schemeParser.CDR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public CdrFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode NOT() { return getToken(schemeParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(schemeParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode OR() { return getToken(schemeParser.OR, 0); }
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ExpressionContext {
		public TerminalNode QUOTE() { return getToken(schemeParser.QUOTE, 0); }
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode AND() { return getToken(schemeParser.AND, 0); }
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class NullFunctionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode NULL() { return getToken(schemeParser.NULL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public NullFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(schemeParser.BOOL, 0); }
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsFunctionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode CONS() { return getToken(schemeParser.CONS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public ConsFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetExpressionContext extends ExpressionContext {
		public List<TerminalNode> LPAREN() { return getTokens(schemeParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(schemeParser.LPAREN, i);
		}
		public TerminalNode LET() { return getToken(schemeParser.LET, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(schemeParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(schemeParser.RPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<LetPairContext> letPair() {
			return getRuleContexts(LetPairContext.class);
		}
		public LetPairContext letPair(int i) {
			return getRuleContext(LetPairContext.class,i);
		}
		public LetExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class CarFunctionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode CAR() { return getToken(schemeParser.CAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public CarFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new OpExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(LPAREN);
				setState(44);
				operation();
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					expression();
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 503351296L) != 0) );
				setState(50);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(LPAREN);
				setState(53);
				match(VAR);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503351296L) != 0)) {
					{
					{
					setState(54);
					expression();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new IfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(LPAREN);
				setState(62);
				match(IF);
				setState(63);
				expression();
				setState(64);
				expression();
				setState(65);
				expression();
				setState(66);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new CondExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(LPAREN);
				setState(69);
				match(COND);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					condClause();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(75);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new CondExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(LPAREN);
				setState(78);
				match(COND);
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					condClause();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(84);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new CarFunctionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(LPAREN);
				setState(87);
				match(CAR);
				setState(88);
				expression();
				setState(89);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new CdrFunctionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(LPAREN);
				setState(92);
				match(CDR);
				setState(93);
				expression();
				setState(94);
				match(RPAREN);
				}
				break;
			case 8:
				_localctx = new ConsFunctionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				match(LPAREN);
				setState(97);
				match(CONS);
				setState(98);
				expression();
				setState(99);
				expression();
				setState(100);
				match(RPAREN);
				}
				break;
			case 9:
				_localctx = new NullFunctionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				match(LPAREN);
				setState(103);
				match(NULL);
				setState(104);
				expression();
				setState(105);
				match(RPAREN);
				}
				break;
			case 10:
				_localctx = new ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(107);
				match(QUOTE);
				setState(108);
				match(LPAREN);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503351296L) != 0)) {
					{
					{
					setState(109);
					expression();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(RPAREN);
				}
				break;
			case 11:
				_localctx = new LetExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(116);
				match(LPAREN);
				setState(117);
				match(LET);
				setState(118);
				match(LPAREN);
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(119);
					letPair();
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(124);
				match(RPAREN);
				setState(125);
				expression();
				setState(126);
				match(RPAREN);
				}
				break;
			case 12:
				_localctx = new AndExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(128);
				match(LPAREN);
				setState(129);
				match(AND);
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					expression();
					}
					}
					setState(133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 503351296L) != 0) );
				setState(135);
				match(RPAREN);
				}
				break;
			case 13:
				_localctx = new OrExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(137);
				match(LPAREN);
				setState(138);
				match(OR);
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					expression();
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 503351296L) != 0) );
				setState(144);
				match(RPAREN);
				}
				break;
			case 14:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(146);
				match(LPAREN);
				setState(147);
				match(NOT);
				setState(148);
				expression();
				setState(149);
				match(RPAREN);
				}
				break;
			case 15:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(151);
				match(VAR);
				}
				break;
			case 16:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(152);
				match(STRING);
				}
				break;
			case 17:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(153);
				match(BOOL);
				}
				break;
			case 18:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(154);
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
			setState(157);
			match(LPAREN);
			setState(158);
			expression();
			setState(159);
			expression();
			setState(160);
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
	public static class LetPairContext extends ParserRuleContext {
		public LetPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letPair; }
	 
		public LetPairContext() { }
		public void copyFrom(LetPairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetBindingContext extends LetPairContext {
		public TerminalNode LPAREN() { return getToken(schemeParser.LPAREN, 0); }
		public TerminalNode VAR() { return getToken(schemeParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(schemeParser.RPAREN, 0); }
		public LetBindingContext(LetPairContext ctx) { copyFrom(ctx); }
	}

	public final LetPairContext letPair() throws RecognitionException {
		LetPairContext _localctx = new LetPairContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letPair);
		try {
			_localctx = new LetBindingContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LPAREN);
			setState(163);
			match(VAR);
			setState(164);
			expression();
			setState(165);
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
		enterRule(_localctx, 10, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		"\u0004\u0001\u001e\u00aa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000"+
		"\f\u0000\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001"+
		"\n\u0001\f\u0001$\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001*\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"/\b\u0002\u000b\u0002\f\u00020\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u00028\b\u0002\n\u0002\f\u0002;\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002H\b"+
		"\u0002\u000b\u0002\f\u0002I\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002Q\b\u0002\u000b\u0002\f\u0002R\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002o\b\u0002\n\u0002\f\u0002r\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002y\b\u0002"+
		"\u000b\u0002\f\u0002z\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0084\b\u0002\u000b\u0002"+
		"\f\u0002\u0085\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u008d\b\u0002\u000b\u0002\f\u0002\u008e\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u009c\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0001\u0001"+
		"\u0000\u0001\n\u00c0\u0000\u000f\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u0004\u009b\u0001\u0000\u0000\u0000\u0006\u009d\u0001"+
		"\u0000\u0000\u0000\b\u00a2\u0001\u0000\u0000\u0000\n\u00a7\u0001\u0000"+
		"\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000"+
		"\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0001\u0000\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011"+
		"\u000f\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0000\u0000\u0001\u0013"+
		"\u0001\u0001\u0000\u0000\u0000\u0014*\u0003\u0004\u0002\u0000\u0015\u0016"+
		"\u0005\u000b\u0000\u0000\u0016\u0017\u0005\r\u0000\u0000\u0017\u0018\u0005"+
		"\u001a\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005"+
		"\f\u0000\u0000\u001a*\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u000b"+
		"\u0000\u0000\u001c\u001d\u0005\r\u0000\u0000\u001d\u001e\u0005\u000b\u0000"+
		"\u0000\u001e\"\u0005\u001a\u0000\u0000\u001f!\u0005\u001a\u0000\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000%&\u0005\f\u0000\u0000&\'\u0003\u0004\u0002\u0000\'"+
		"(\u0005\f\u0000\u0000(*\u0001\u0000\u0000\u0000)\u0014\u0001\u0000\u0000"+
		"\u0000)\u0015\u0001\u0000\u0000\u0000)\u001b\u0001\u0000\u0000\u0000*"+
		"\u0003\u0001\u0000\u0000\u0000+,\u0005\u000b\u0000\u0000,.\u0003\n\u0005"+
		"\u0000-/\u0003\u0004\u0002\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000023\u0005\f\u0000\u00003\u009c\u0001\u0000\u0000\u0000"+
		"45\u0005\u000b\u0000\u000059\u0005\u001a\u0000\u000068\u0003\u0004\u0002"+
		"\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000<\u009c\u0005\f\u0000\u0000=>\u0005\u000b\u0000\u0000"+
		">?\u0005\u000e\u0000\u0000?@\u0003\u0004\u0002\u0000@A\u0003\u0004\u0002"+
		"\u0000AB\u0003\u0004\u0002\u0000BC\u0005\f\u0000\u0000C\u009c\u0001\u0000"+
		"\u0000\u0000DE\u0005\u000b\u0000\u0000EG\u0005\u0013\u0000\u0000FH\u0003"+
		"\u0006\u0003\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KL\u0005\f\u0000\u0000L\u009c\u0001\u0000\u0000\u0000MN\u0005\u000b"+
		"\u0000\u0000NP\u0005\u0013\u0000\u0000OQ\u0003\u0006\u0003\u0000PO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005\f\u0000\u0000"+
		"U\u009c\u0001\u0000\u0000\u0000VW\u0005\u000b\u0000\u0000WX\u0005\u0014"+
		"\u0000\u0000XY\u0003\u0004\u0002\u0000YZ\u0005\f\u0000\u0000Z\u009c\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u000b\u0000\u0000\\]\u0005\u0015\u0000\u0000"+
		"]^\u0003\u0004\u0002\u0000^_\u0005\f\u0000\u0000_\u009c\u0001\u0000\u0000"+
		"\u0000`a\u0005\u000b\u0000\u0000ab\u0005\u0016\u0000\u0000bc\u0003\u0004"+
		"\u0002\u0000cd\u0003\u0004\u0002\u0000de\u0005\f\u0000\u0000e\u009c\u0001"+
		"\u0000\u0000\u0000fg\u0005\u000b\u0000\u0000gh\u0005\u0017\u0000\u0000"+
		"hi\u0003\u0004\u0002\u0000ij\u0005\f\u0000\u0000j\u009c\u0001\u0000\u0000"+
		"\u0000kl\u0005\u0019\u0000\u0000lp\u0005\u000b\u0000\u0000mo\u0003\u0004"+
		"\u0002\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000s\u009c\u0005\f\u0000\u0000tu\u0005\u000b\u0000"+
		"\u0000uv\u0005\u0018\u0000\u0000vx\u0005\u000b\u0000\u0000wy\u0003\b\u0004"+
		"\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005"+
		"\f\u0000\u0000}~\u0003\u0004\u0002\u0000~\u007f\u0005\f\u0000\u0000\u007f"+
		"\u009c\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081"+
		"\u0083\u0005\u0010\u0000\u0000\u0082\u0084\u0003\u0004\u0002\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005\f\u0000\u0000\u0088\u009c"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u000b\u0000\u0000\u008a\u008c"+
		"\u0005\u0011\u0000\u0000\u008b\u008d\u0003\u0004\u0002\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u009c\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u000b\u0000\u0000\u0093\u0094\u0005"+
		"\u0012\u0000\u0000\u0094\u0095\u0003\u0004\u0002\u0000\u0095\u0096\u0005"+
		"\f\u0000\u0000\u0096\u009c\u0001\u0000\u0000\u0000\u0097\u009c\u0005\u001a"+
		"\u0000\u0000\u0098\u009c\u0005\u001c\u0000\u0000\u0099\u009c\u0005\u000f"+
		"\u0000\u0000\u009a\u009c\u0005\u001b\u0000\u0000\u009b+\u0001\u0000\u0000"+
		"\u0000\u009b4\u0001\u0000\u0000\u0000\u009b=\u0001\u0000\u0000\u0000\u009b"+
		"D\u0001\u0000\u0000\u0000\u009bM\u0001\u0000\u0000\u0000\u009bV\u0001"+
		"\u0000\u0000\u0000\u009b[\u0001\u0000\u0000\u0000\u009b`\u0001\u0000\u0000"+
		"\u0000\u009bf\u0001\u0000\u0000\u0000\u009bk\u0001\u0000\u0000\u0000\u009b"+
		"t\u0001\u0000\u0000\u0000\u009b\u0080\u0001\u0000\u0000\u0000\u009b\u0089"+
		"\u0001\u0000\u0000\u0000\u009b\u0092\u0001\u0000\u0000\u0000\u009b\u0097"+
		"\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u0005"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u000b\u0000\u0000\u009e\u009f"+
		"\u0003\u0004\u0002\u0000\u009f\u00a0\u0003\u0004\u0002\u0000\u00a0\u00a1"+
		"\u0005\f\u0000\u0000\u00a1\u0007\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\u000b\u0000\u0000\u00a3\u00a4\u0005\u001a\u0000\u0000\u00a4\u00a5\u0003"+
		"\u0004\u0002\u0000\u00a5\u00a6\u0005\f\u0000\u0000\u00a6\t\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0007\u0000\u0000\u0000\u00a8\u000b\u0001\u0000"+
		"\u0000\u0000\f\u000f\")09IRpz\u0085\u008e\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}