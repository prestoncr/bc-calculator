// Generated from /Users/Preston/Desktop/BC_Antlr/Calculator.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, VAR=16, ID=17, 
		DOUBLE=18, INT=19, COMMENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "VAR", "ID", "DOUBLE", 
		"INT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'%'", 
		"'^'", "'!'", "'&&'", "'||'", "'('", "')'", "'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "VAR", "ID", "DOUBLE", "INT", "COMMENT", "WS"
	};
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\6\22U\n\22\r\22\16\22V\3\23\5\23Z\n\23\3\23\6\23]\n\23\r\23\16\23"+
		"^\3\23\3\23\6\23c\n\23\r\23\16\23d\3\24\5\24h\n\24\3\24\6\24k\n\24\r\24"+
		"\16\24l\3\25\3\25\3\25\3\25\7\25s\n\25\f\25\16\25v\13\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\6\26~\n\26\r\26\16\26\177\3\26\3\26\2\2\27\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27\3\2\6\5\2C\\aac|\3\2//\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5"+
		"/\3\2\2\2\7\61\3\2\2\2\t\64\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2"+
		"\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33H\3\2"+
		"\2\2\35K\3\2\2\2\37M\3\2\2\2!O\3\2\2\2#T\3\2\2\2%Y\3\2\2\2\'g\3\2\2\2"+
		")n\3\2\2\2+}\3\2\2\2-.\7?\2\2.\4\3\2\2\2/\60\7=\2\2\60\6\3\2\2\2\61\62"+
		"\7-\2\2\62\63\7-\2\2\63\b\3\2\2\2\64\65\7/\2\2\65\66\7/\2\2\66\n\3\2\2"+
		"\2\678\7,\2\28\f\3\2\2\29:\7\61\2\2:\16\3\2\2\2;<\7-\2\2<\20\3\2\2\2="+
		">\7/\2\2>\22\3\2\2\2?@\7\'\2\2@\24\3\2\2\2AB\7`\2\2B\26\3\2\2\2CD\7#\2"+
		"\2D\30\3\2\2\2EF\7(\2\2FG\7(\2\2G\32\3\2\2\2HI\7~\2\2IJ\7~\2\2J\34\3\2"+
		"\2\2KL\7*\2\2L\36\3\2\2\2MN\7+\2\2N \3\2\2\2OP\7x\2\2PQ\7c\2\2QR\7t\2"+
		"\2R\"\3\2\2\2SU\t\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W$\3\2"+
		"\2\2XZ\t\3\2\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\t\4\2\2\\[\3\2\2\2]^\3"+
		"\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\13\2\2\2ac\t\4\2\2ba\3\2\2\2c"+
		"d\3\2\2\2db\3\2\2\2de\3\2\2\2e&\3\2\2\2fh\t\3\2\2gf\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m(\3\2\2\2"+
		"no\7\61\2\2op\7,\2\2pt\3\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2"+
		"\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7,\2\2xy\7\61\2\2yz\3\2\2\2z{\b\25"+
		"\2\2{*\3\2\2\2|~\t\5\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\26\2\2\u0082,\3\2\2\2\13\2"+
		"VY^dglt\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}