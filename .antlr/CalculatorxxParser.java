// Generated from /Users/Preston/Desktop/BC_Antlr/Calculatorxx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorxxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, VAR=14, ID=15, DOUBLE=16, INT=17, 
		COMMENT=18, WS=19;
	public static final int
		RULE_varDef = 0, RULE_exprList = 1, RULE_topExpr = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"varDef", "exprList", "topExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'*'", "'/'", "'+'", "'-'", "'%'", "'^'", "'!'", "'&&'", 
		"'||'", "'('", "')'", "'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "VAR", "ID", "DOUBLE", "INT", "COMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "Calculatorxx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorxxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CalculatorxxParser.VAR, 0); }
		public TerminalNode ID() { return getToken(CalculatorxxParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(VAR);
			setState(9);
			match(ID);
			setState(10);
			match(T__0);
			setState(11);
			expr(0);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			topExpr();
			setState(18);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(14);
					match(T__1);
					setState(15);
					topExpr();
					}
					} 
				}
				setState(20);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(21);
				match(T__1);
				}
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

	public static class TopExprContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((TopExprContext)_localctx).expr = expr(0);
			 System.out.println("result: "+ Integer.toString(((TopExprContext)_localctx).expr.i));
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

	public static class ExprContext extends ParserRuleContext {
		public int i;
		public ExprContext el;
		public Token op;
		public ExprContext e;
		public Token INT;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(CalculatorxxParser.INT, 0); }
		public TerminalNode ID() { return getToken(CalculatorxxParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(28);
				((ExprContext)_localctx).op = match(T__8);
				setState(29);
				((ExprContext)_localctx).e = expr(6);
				 if (((ExprContext)_localctx).e.i == 0) ((ExprContext)_localctx).i =  1; else ((ExprContext)_localctx).i =  0; 
				}
				break;
			case INT:
				{
				setState(32);
				((ExprContext)_localctx).INT = match(INT);
				 ((ExprContext)_localctx).i = Integer.parseInt((((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null)); 
				}
				break;
			case ID:
				{
				setState(34);
				match(ID);
				}
				break;
			case T__11:
				{
				setState(35);
				match(T__11);
				setState(36);
				((ExprContext)_localctx).e = expr(0);
				setState(37);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(41);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(42);
						((ExprContext)_localctx).op = match(T__2);
						setState(43);
						((ExprContext)_localctx).er = expr(13);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i*((ExprContext)_localctx).er.i; 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(47);
						((ExprContext)_localctx).op = match(T__3);
						setState(48);
						((ExprContext)_localctx).er = expr(12);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i/((ExprContext)_localctx).er.i; 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(52);
						((ExprContext)_localctx).op = match(T__4);
						setState(53);
						((ExprContext)_localctx).er = expr(11);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i+((ExprContext)_localctx).er.i; 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(57);
						((ExprContext)_localctx).op = match(T__5);
						setState(58);
						((ExprContext)_localctx).er = expr(10);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i-((ExprContext)_localctx).er.i; 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(62);
						((ExprContext)_localctx).op = match(T__6);
						setState(63);
						((ExprContext)_localctx).er = expr(9);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i%((ExprContext)_localctx).er.i; 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67);
						((ExprContext)_localctx).op = match(T__7);
						setState(68);
						((ExprContext)_localctx).er = expr(8);
						 ((ExprContext)_localctx).i = (int)Math.pow(((ExprContext)_localctx).el.i, ((ExprContext)_localctx).er.i);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(72);
						((ExprContext)_localctx).op = match(T__9);
						setState(73);
						((ExprContext)_localctx).er = expr(6);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i&((ExprContext)_localctx).er.i;
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(77);
						((ExprContext)_localctx).op = match(T__10);
						setState(78);
						((ExprContext)_localctx).er = expr(5);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i|((ExprContext)_localctx).er.i;
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\23\n\3\f\3\16\3"+
		"\26\13\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5*\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3"+
		"\5\2\3\b\6\2\4\6\b\2\2\2a\2\n\3\2\2\2\4\17\3\2\2\2\6\32\3\2\2\2\b)\3\2"+
		"\2\2\n\13\7\20\2\2\13\f\7\21\2\2\f\r\7\3\2\2\r\16\5\b\5\2\16\3\3\2\2\2"+
		"\17\24\5\6\4\2\20\21\7\4\2\2\21\23\5\6\4\2\22\20\3\2\2\2\23\26\3\2\2\2"+
		"\24\22\3\2\2\2\24\25\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\27\31\7\4\2\2"+
		"\30\27\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\33\5\b\5\2\33\34\b\4\1\2"+
		"\34\7\3\2\2\2\35\36\b\5\1\2\36\37\7\13\2\2\37 \5\b\5\b !\b\5\1\2!*\3\2"+
		"\2\2\"#\7\23\2\2#*\b\5\1\2$*\7\21\2\2%&\7\16\2\2&\'\5\b\5\2\'(\7\17\2"+
		"\2(*\3\2\2\2)\35\3\2\2\2)\"\3\2\2\2)$\3\2\2\2)%\3\2\2\2*U\3\2\2\2+,\f"+
		"\16\2\2,-\7\5\2\2-.\5\b\5\17./\b\5\1\2/T\3\2\2\2\60\61\f\r\2\2\61\62\7"+
		"\6\2\2\62\63\5\b\5\16\63\64\b\5\1\2\64T\3\2\2\2\65\66\f\f\2\2\66\67\7"+
		"\7\2\2\678\5\b\5\r89\b\5\1\29T\3\2\2\2:;\f\13\2\2;<\7\b\2\2<=\5\b\5\f"+
		"=>\b\5\1\2>T\3\2\2\2?@\f\n\2\2@A\7\t\2\2AB\5\b\5\13BC\b\5\1\2CT\3\2\2"+
		"\2DE\f\t\2\2EF\7\n\2\2FG\5\b\5\nGH\b\5\1\2HT\3\2\2\2IJ\f\7\2\2JK\7\f\2"+
		"\2KL\5\b\5\bLM\b\5\1\2MT\3\2\2\2NO\f\6\2\2OP\7\r\2\2PQ\5\b\5\7QR\b\5\1"+
		"\2RT\3\2\2\2S+\3\2\2\2S\60\3\2\2\2S\65\3\2\2\2S:\3\2\2\2S?\3\2\2\2SD\3"+
		"\2\2\2SI\3\2\2\2SN\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WU"+
		"\3\2\2\2\7\24\30)SU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}