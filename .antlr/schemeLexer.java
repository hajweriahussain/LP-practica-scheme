// Generated from /home/hajweriahussain/UNI/Q5/LP/lp-practica-scheme/scheme.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class schemeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, LPAREN=11, RPAREN=12, DEFINE=13, IF=14, BOOL=15, COND=16, CAR=17, 
		CDR=18, CONS=19, NULL=20, QUOTE=21, VAR=22, NUM=23, STRING=24, COMMENT=25, 
		WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "LPAREN", "RPAREN", "DEFINE", "IF", "BOOL", "COND", "CAR", "CDR", 
			"CONS", "NULL", "QUOTE", "VAR", "NUM", "STRING", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'='", 
			"'<>'", "'('", "')'", "'define'", "'if'", null, "'cond'", "'car'", "'cdr'", 
			"'cons'", "'null?'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "LPAREN", 
			"RPAREN", "DEFINE", "IF", "BOOL", "COND", "CAR", "CDR", "CONS", "NULL", 
			"QUOTE", "VAR", "NUM", "STRING", "COMMENT", "WS"
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


	public schemeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "scheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e_\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015}\b\u0015\n\u0015"+
		"\f\u0015\u0080\t\u0015\u0001\u0016\u0004\u0016\u0083\b\u0016\u000b\u0016"+
		"\f\u0016\u0084\u0001\u0017\u0001\u0017\u0005\u0017\u0089\b\u0017\n\u0017"+
		"\f\u0017\u008c\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0092\b\u0018\n\u0018\f\u0018\u0095\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0004\u0019\u009a\b\u0019\u000b\u0019\f\u0019\u009b"+
		"\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001"+
		"\u0000\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003"+
		"\u0000\n\n\r\r\"\"\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u00a4\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000"+
		"\u00059\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t=\u0001"+
		"\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000"+
		"\u0000\u000fD\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013"+
		"I\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017N\u0001"+
		"\u0000\u0000\u0000\u0019P\u0001\u0000\u0000\u0000\u001bW\u0001\u0000\u0000"+
		"\u0000\u001d^\u0001\u0000\u0000\u0000\u001f`\u0001\u0000\u0000\u0000!"+
		"e\u0001\u0000\u0000\u0000#i\u0001\u0000\u0000\u0000%m\u0001\u0000\u0000"+
		"\u0000\'r\u0001\u0000\u0000\u0000)x\u0001\u0000\u0000\u0000+z\u0001\u0000"+
		"\u0000\u0000-\u0082\u0001\u0000\u0000\u0000/\u0086\u0001\u0000\u0000\u0000"+
		"1\u008f\u0001\u0000\u0000\u00003\u0099\u0001\u0000\u0000\u000056\u0005"+
		"+\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005-\u0000\u00008\u0004"+
		"\u0001\u0000\u0000\u00009:\u0005*\u0000\u0000:\u0006\u0001\u0000\u0000"+
		"\u0000;<\u0005/\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005<\u0000"+
		"\u0000>\n\u0001\u0000\u0000\u0000?@\u0005>\u0000\u0000@\f\u0001\u0000"+
		"\u0000\u0000AB\u0005<\u0000\u0000BC\u0005=\u0000\u0000C\u000e\u0001\u0000"+
		"\u0000\u0000DE\u0005>\u0000\u0000EF\u0005=\u0000\u0000F\u0010\u0001\u0000"+
		"\u0000\u0000GH\u0005=\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IJ\u0005"+
		"<\u0000\u0000JK\u0005>\u0000\u0000K\u0014\u0001\u0000\u0000\u0000LM\u0005"+
		"(\u0000\u0000M\u0016\u0001\u0000\u0000\u0000NO\u0005)\u0000\u0000O\u0018"+
		"\u0001\u0000\u0000\u0000PQ\u0005d\u0000\u0000QR\u0005e\u0000\u0000RS\u0005"+
		"f\u0000\u0000ST\u0005i\u0000\u0000TU\u0005n\u0000\u0000UV\u0005e\u0000"+
		"\u0000V\u001a\u0001\u0000\u0000\u0000WX\u0005i\u0000\u0000XY\u0005f\u0000"+
		"\u0000Y\u001c\u0001\u0000\u0000\u0000Z[\u0005#\u0000\u0000[_\u0005t\u0000"+
		"\u0000\\]\u0005#\u0000\u0000]_\u0005f\u0000\u0000^Z\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_\u001e\u0001\u0000\u0000\u0000`a\u0005"+
		"c\u0000\u0000ab\u0005o\u0000\u0000bc\u0005n\u0000\u0000cd\u0005d\u0000"+
		"\u0000d \u0001\u0000\u0000\u0000ef\u0005c\u0000\u0000fg\u0005a\u0000\u0000"+
		"gh\u0005r\u0000\u0000h\"\u0001\u0000\u0000\u0000ij\u0005c\u0000\u0000"+
		"jk\u0005d\u0000\u0000kl\u0005r\u0000\u0000l$\u0001\u0000\u0000\u0000m"+
		"n\u0005c\u0000\u0000no\u0005o\u0000\u0000op\u0005n\u0000\u0000pq\u0005"+
		"s\u0000\u0000q&\u0001\u0000\u0000\u0000rs\u0005n\u0000\u0000st\u0005u"+
		"\u0000\u0000tu\u0005l\u0000\u0000uv\u0005l\u0000\u0000vw\u0005?\u0000"+
		"\u0000w(\u0001\u0000\u0000\u0000xy\u0005\'\u0000\u0000y*\u0001\u0000\u0000"+
		"\u0000z~\u0007\u0000\u0000\u0000{}\u0007\u0001\u0000\u0000|{\u0001\u0000"+
		"\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f,\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0007\u0002\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085.\u0001"+
		"\u0000\u0000\u0000\u0086\u008a\u0005\"\u0000\u0000\u0087\u0089\b\u0003"+
		"\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005\"\u0000\u0000\u008e0\u0001\u0000\u0000"+
		"\u0000\u008f\u0093\u0005;\u0000\u0000\u0090\u0092\b\u0004\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0006\u0018\u0000\u0000\u00972\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0007\u0005\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0006\u0019\u0000\u0000\u009e4\u0001\u0000\u0000\u0000\u0007\u0000"+
		"^~\u0084\u008a\u0093\u009b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}