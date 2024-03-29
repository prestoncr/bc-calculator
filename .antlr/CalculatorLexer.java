// Generated from /Users/Preston/Desktop/BC_Antlr/Calculator.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, VAR=24, ID=25, 
		DOUBLE=26, INT=27, COMMENT=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "VAR", "ID", "DOUBLE", 
		"INT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'read()'", "'print'", "','", "';'", "'-'", "'++'", "'--'", 
		"'^'", "'sqrt('", "')'", "'s('", "'c('", "'e('", "'l('", "'*'", "'/'", 
		"'+'", "'%'", "'!'", "'&&'", "'||'", "'('", "'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"VAR", "ID", "DOUBLE", "INT", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00b4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\6\32\u0086\n\32\r\32\16\32\u0087\3\33"+
		"\5\33\u008b\n\33\3\33\6\33\u008e\n\33\r\33\16\33\u008f\3\33\3\33\6\33"+
		"\u0094\n\33\r\33\16\33\u0095\3\34\5\34\u0099\n\34\3\34\6\34\u009c\n\34"+
		"\r\34\16\34\u009d\3\35\3\35\3\35\3\35\7\35\u00a4\n\35\f\35\16\35\u00a7"+
		"\13\35\3\35\3\35\3\35\3\35\3\35\3\36\6\36\u00af\n\36\r\36\16\36\u00b0"+
		"\3\36\3\36\3\u00a5\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37\3\2\6\5\2C\\aac|\3\2//\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7F\3\2\2\2\tL\3\2\2\2\13N\3\2"+
		"\2\2\rP\3\2\2\2\17R\3\2\2\2\21U\3\2\2\2\23X\3\2\2\2\25Z\3\2\2\2\27`\3"+
		"\2\2\2\31b\3\2\2\2\33e\3\2\2\2\35h\3\2\2\2\37k\3\2\2\2!n\3\2\2\2#p\3\2"+
		"\2\2%r\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+x\3\2\2\2-{\3\2\2\2/~\3\2\2\2\61\u0080"+
		"\3\2\2\2\63\u0085\3\2\2\2\65\u008a\3\2\2\2\67\u0098\3\2\2\29\u009f\3\2"+
		"\2\2;\u00ae\3\2\2\2=>\7?\2\2>\4\3\2\2\2?@\7t\2\2@A\7g\2\2AB\7c\2\2BC\7"+
		"f\2\2CD\7*\2\2DE\7+\2\2E\6\3\2\2\2FG\7r\2\2GH\7t\2\2HI\7k\2\2IJ\7p\2\2"+
		"JK\7v\2\2K\b\3\2\2\2LM\7.\2\2M\n\3\2\2\2NO\7=\2\2O\f\3\2\2\2PQ\7/\2\2"+
		"Q\16\3\2\2\2RS\7-\2\2ST\7-\2\2T\20\3\2\2\2UV\7/\2\2VW\7/\2\2W\22\3\2\2"+
		"\2XY\7`\2\2Y\24\3\2\2\2Z[\7u\2\2[\\\7s\2\2\\]\7t\2\2]^\7v\2\2^_\7*\2\2"+
		"_\26\3\2\2\2`a\7+\2\2a\30\3\2\2\2bc\7u\2\2cd\7*\2\2d\32\3\2\2\2ef\7e\2"+
		"\2fg\7*\2\2g\34\3\2\2\2hi\7g\2\2ij\7*\2\2j\36\3\2\2\2kl\7n\2\2lm\7*\2"+
		"\2m \3\2\2\2no\7,\2\2o\"\3\2\2\2pq\7\61\2\2q$\3\2\2\2rs\7-\2\2s&\3\2\2"+
		"\2tu\7\'\2\2u(\3\2\2\2vw\7#\2\2w*\3\2\2\2xy\7(\2\2yz\7(\2\2z,\3\2\2\2"+
		"{|\7~\2\2|}\7~\2\2}.\3\2\2\2~\177\7*\2\2\177\60\3\2\2\2\u0080\u0081\7"+
		"x\2\2\u0081\u0082\7c\2\2\u0082\u0083\7t\2\2\u0083\62\3\2\2\2\u0084\u0086"+
		"\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\64\3\2\2\2\u0089\u008b\t\3\2\2\u008a\u0089\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e\t\4\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\7\60\2\2\u0092\u0094\t\4\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\66\3\2\2\2\u0097\u0099\t\3\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2"+
		"\2\u0099\u009b\3\2\2\2\u009a\u009c\t\4\2\2\u009b\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e8\3\2\2\2\u009f"+
		"\u00a0\7\61\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13"+
		"\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7,"+
		"\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\35\2\2\u00ac"+
		":\3\2\2\2\u00ad\u00af\t\5\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3"+
		"\b\36\2\2\u00b3<\3\2\2\2\13\2\u0087\u008a\u008f\u0095\u0098\u009d\u00a5"+
		"\u00b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}