// Generated from /home/walterjtv/Escritorio/Assignatures/Q6/CL/sessio2/Calc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IF=2, THEN=3, ELSE=4, ENDIF=5, WHILE=6, EQ=7, NEQ=8, LE=9, GE=10, 
		LESS=11, GRT=12, LPAR=13, RPAR=14, MUL=15, ADD=16, SUB=17, MOD=18, DIV=19, 
		ABS=20, MIN=21, MAX=22, COMMA=23, FACTORIAL=24, MYSTERY=25, ID=26, INT=27, 
		NEWLINE=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "IF", "THEN", "ELSE", "ENDIF", "WHILE", "EQ", "NEQ", "LE", "GE", 
			"LESS", "GRT", "LPAR", "RPAR", "MUL", "ADD", "SUB", "MOD", "DIV", "ABS", 
			"MIN", "MAX", "COMMA", "FACTORIAL", "MYSTERY", "ID", "INT", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'if'", "'then'", "'else'", "'endif'", "'while'", "'=='", 
			"'!='", "'<='", "'>='", "'<'", "'>'", "'('", "')'", "'*'", "'+'", "'-'", 
			"'%'", "'/'", "'abs'", "'min'", "'max'", "','", "'!'", "'mistery'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IF", "THEN", "ELSE", "ENDIF", "WHILE", "EQ", "NEQ", "LE", 
			"GE", "LESS", "GRT", "LPAR", "RPAR", "MUL", "ADD", "SUB", "MOD", "DIV", 
			"ABS", "MIN", "MAX", "COMMA", "FACTORIAL", "MYSTERY", "ID", "INT", "NEWLINE", 
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\6\33\u0090\n\33\r\33\16\33\u0091\3\34\6\34\u0095\n\34\r\34\16\34"+
		"\u0096\3\35\5\35\u009a\n\35\3\35\3\35\3\36\6\36\u009f\n\36\r\36\16\36"+
		"\u00a0\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"\2\u00a7\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\3=\3\2\2\2\5?\3\2\2\2\7B\3\2\2\2\tG\3\2\2\2\13L\3\2\2\2\rR\3\2\2"+
		"\2\17X\3\2\2\2\21[\3\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27d\3\2\2\2\31f\3\2"+
		"\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2"+
		"\'t\3\2\2\2)v\3\2\2\2+z\3\2\2\2-~\3\2\2\2/\u0082\3\2\2\2\61\u0084\3\2"+
		"\2\2\63\u0086\3\2\2\2\65\u008f\3\2\2\2\67\u0094\3\2\2\29\u0099\3\2\2\2"+
		";\u009e\3\2\2\2=>\7?\2\2>\4\3\2\2\2?@\7k\2\2@A\7h\2\2A\6\3\2\2\2BC\7v"+
		"\2\2CD\7j\2\2DE\7g\2\2EF\7p\2\2F\b\3\2\2\2GH\7g\2\2HI\7n\2\2IJ\7u\2\2"+
		"JK\7g\2\2K\n\3\2\2\2LM\7g\2\2MN\7p\2\2NO\7f\2\2OP\7k\2\2PQ\7h\2\2Q\f\3"+
		"\2\2\2RS\7y\2\2ST\7j\2\2TU\7k\2\2UV\7n\2\2VW\7g\2\2W\16\3\2\2\2XY\7?\2"+
		"\2YZ\7?\2\2Z\20\3\2\2\2[\\\7#\2\2\\]\7?\2\2]\22\3\2\2\2^_\7>\2\2_`\7?"+
		"\2\2`\24\3\2\2\2ab\7@\2\2bc\7?\2\2c\26\3\2\2\2de\7>\2\2e\30\3\2\2\2fg"+
		"\7@\2\2g\32\3\2\2\2hi\7*\2\2i\34\3\2\2\2jk\7+\2\2k\36\3\2\2\2lm\7,\2\2"+
		"m \3\2\2\2no\7-\2\2o\"\3\2\2\2pq\7/\2\2q$\3\2\2\2rs\7\'\2\2s&\3\2\2\2"+
		"tu\7\61\2\2u(\3\2\2\2vw\7c\2\2wx\7d\2\2xy\7u\2\2y*\3\2\2\2z{\7o\2\2{|"+
		"\7k\2\2|}\7p\2\2},\3\2\2\2~\177\7o\2\2\177\u0080\7c\2\2\u0080\u0081\7"+
		"z\2\2\u0081.\3\2\2\2\u0082\u0083\7.\2\2\u0083\60\3\2\2\2\u0084\u0085\7"+
		"#\2\2\u0085\62\3\2\2\2\u0086\u0087\7o\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7{\2\2\u008d\64\3\2\2\2\u008e\u0090\t\2\2\2\u008f\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\66"+
		"\3\2\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u00978\3\2\2\2\u0098\u009a\7\17\2\2"+
		"\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\7\f\2\2\u009c:\3\2\2\2\u009d\u009f\t\4\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\b\36\2\2\u00a3<\3\2\2\2\7\2\u0091\u0096\u0099\u00a0\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}