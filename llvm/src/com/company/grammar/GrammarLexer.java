package com.company.grammar;// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, READINT=4, READREAL=5, READSTRING=6, PRINT=7, 
		TOINT=8, TOREAL=9, ID=10, REAL=11, INT=12, STRING=13, ADD=14, MULT=15, 
		NEWLINE=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "READINT", "READREAL", "READSTRING", "PRINT", 
			"TOINT", "TOREAL", "ID", "REAL", "INT", "STRING", "ADD", "MULT", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'readi'", "'readr'", "'reads'", "'print'", 
			"'(int)'", "'(real)'", null, null, null, null, "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "READINT", "READREAL", "READSTRING", "PRINT", 
			"TOINT", "TOREAL", "ID", "REAL", "INT", "STRING", "ADD", "MULT", "NEWLINE", 
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13R\n\13\r\13\16\13S\3\f\6\fW"+
		"\n\f\r\f\16\fX\3\f\3\f\6\f]\n\f\r\f\16\f^\3\r\6\rb\n\r\r\r\16\rc\3\16"+
		"\3\16\7\16h\n\16\f\16\16\16k\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\5\21t\n\21\3\21\3\21\3\22\6\22y\n\22\r\22\16\22z\3\22\3\22\2\2\23\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\5\4\2C\\c|\4\2$$^^\4\2\13\13\"\"\2\u0084\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5"+
		"\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13\61\3\2\2\2\r\67\3\2\2\2\17=\3\2\2"+
		"\2\21C\3\2\2\2\23I\3\2\2\2\25Q\3\2\2\2\27V\3\2\2\2\31a\3\2\2\2\33e\3\2"+
		"\2\2\35n\3\2\2\2\37p\3\2\2\2!s\3\2\2\2#x\3\2\2\2%&\7?\2\2&\4\3\2\2\2\'"+
		"(\7*\2\2(\6\3\2\2\2)*\7+\2\2*\b\3\2\2\2+,\7t\2\2,-\7g\2\2-.\7c\2\2./\7"+
		"f\2\2/\60\7k\2\2\60\n\3\2\2\2\61\62\7t\2\2\62\63\7g\2\2\63\64\7c\2\2\64"+
		"\65\7f\2\2\65\66\7t\2\2\66\f\3\2\2\2\678\7t\2\289\7g\2\29:\7c\2\2:;\7"+
		"f\2\2;<\7u\2\2<\16\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7k\2\2@A\7p\2\2AB\7v\2"+
		"\2B\20\3\2\2\2CD\7*\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2GH\7+\2\2H\22\3\2\2"+
		"\2IJ\7*\2\2JK\7t\2\2KL\7g\2\2LM\7c\2\2MN\7n\2\2NO\7+\2\2O\24\3\2\2\2P"+
		"R\t\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\26\3\2\2\2UW\4\62;"+
		"\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\7\60\2\2[]\4\62"+
		";\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\30\3\2\2\2`b\4\62;\2a`"+
		"\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\32\3\2\2\2ei\7$\2\2fh\n\3\2\2"+
		"gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7$\2\2"+
		"m\34\3\2\2\2no\7-\2\2o\36\3\2\2\2pq\7,\2\2q \3\2\2\2rt\7\17\2\2sr\3\2"+
		"\2\2st\3\2\2\2tu\3\2\2\2uv\7\f\2\2v\"\3\2\2\2wy\t\4\2\2xw\3\2\2\2yz\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\22\2\2}$\3\2\2\2\n\2SX^cisz\3"+
		"\3\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}