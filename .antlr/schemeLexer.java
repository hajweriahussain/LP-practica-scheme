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
		T__9=10, LPAREN=11, RPAREN=12, DEFINE=13, IF=14, BOOL=15, COND=16, VAR=17, 
		NUM=18, STRING=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "LPAREN", "RPAREN", "DEFINE", "IF", "BOOL", "COND", "VAR", "NUM", 
			"STRING", "WS"
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
		"\u0004\u0000\u0014u\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000eS\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\\\b\u0010\n\u0010\f\u0010_\t\u0010\u0001\u0011\u0004\u0011"+
		"b\b\u0011\u000b\u0011\f\u0011c\u0001\u0012\u0001\u0012\u0005\u0012h\b"+
		"\u0012\n\u0012\f\u0012k\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004"+
		"\u0013p\b\u0013\u000b\u0013\f\u0013q\u0001\u0013\u0001\u0013\u0000\u0000"+
		"\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0005"+
		"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\n\n\r"+
		"\r\"\"\u0003\u0000\t\n\r\r  y\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-"+
		"\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000"+
		"\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000"+
		"\u000f8\u0001\u0000\u0000\u0000\u0011;\u0001\u0000\u0000\u0000\u0013="+
		"\u0001\u0000\u0000\u0000\u0015@\u0001\u0000\u0000\u0000\u0017B\u0001\u0000"+
		"\u0000\u0000\u0019D\u0001\u0000\u0000\u0000\u001bK\u0001\u0000\u0000\u0000"+
		"\u001dR\u0001\u0000\u0000\u0000\u001fT\u0001\u0000\u0000\u0000!Y\u0001"+
		"\u0000\u0000\u0000#a\u0001\u0000\u0000\u0000%e\u0001\u0000\u0000\u0000"+
		"\'o\u0001\u0000\u0000\u0000)*\u0005+\u0000\u0000*\u0002\u0001\u0000\u0000"+
		"\u0000+,\u0005-\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005*\u0000"+
		"\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005/\u0000\u00000\b\u0001\u0000"+
		"\u0000\u000012\u0005<\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005>"+
		"\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005<\u0000\u000067\u0005="+
		"\u0000\u00007\u000e\u0001\u0000\u0000\u000089\u0005>\u0000\u00009:\u0005"+
		"=\u0000\u0000:\u0010\u0001\u0000\u0000\u0000;<\u0005=\u0000\u0000<\u0012"+
		"\u0001\u0000\u0000\u0000=>\u0005<\u0000\u0000>?\u0005>\u0000\u0000?\u0014"+
		"\u0001\u0000\u0000\u0000@A\u0005(\u0000\u0000A\u0016\u0001\u0000\u0000"+
		"\u0000BC\u0005)\u0000\u0000C\u0018\u0001\u0000\u0000\u0000DE\u0005d\u0000"+
		"\u0000EF\u0005e\u0000\u0000FG\u0005f\u0000\u0000GH\u0005i\u0000\u0000"+
		"HI\u0005n\u0000\u0000IJ\u0005e\u0000\u0000J\u001a\u0001\u0000\u0000\u0000"+
		"KL\u0005i\u0000\u0000LM\u0005f\u0000\u0000M\u001c\u0001\u0000\u0000\u0000"+
		"NO\u0005#\u0000\u0000OS\u0005t\u0000\u0000PQ\u0005#\u0000\u0000QS\u0005"+
		"f\u0000\u0000RN\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S\u001e"+
		"\u0001\u0000\u0000\u0000TU\u0005c\u0000\u0000UV\u0005o\u0000\u0000VW\u0005"+
		"n\u0000\u0000WX\u0005d\u0000\u0000X \u0001\u0000\u0000\u0000Y]\u0007\u0000"+
		"\u0000\u0000Z\\\u0007\u0001\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\"\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0007\u0002\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000d$\u0001\u0000\u0000\u0000ei\u0005"+
		"\"\u0000\u0000fh\b\u0003\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\"\u0000\u0000"+
		"m&\u0001\u0000\u0000\u0000np\u0007\u0004\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0006\u0013\u0000\u0000t(\u0001"+
		"\u0000\u0000\u0000\u0006\u0000R]ciq\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}