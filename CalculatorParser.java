// Generated from Calculator.g4 by ANTLR 4.7.2

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, VAR=16, ID=17, 
		DOUBLE=18, INT=19, COMMENT=20, WS=21;
	public static final int
		RULE_varDef = 0, RULE_exprList = 1, RULE_topExpr = 2, RULE_exprD = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"varDef", "exprList", "topExpr", "exprD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'%'", 
			"'^'", "'!'", "'&&'", "'||'", "'('", "')'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "VAR", "ID", "DOUBLE", "INT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private Map<String, Double> variables = new HashMap<String, Double>();
	private void addVariable(String varname, double x1)
	        {variables.put(varname, x1);}
	private double getVariable(String varname)
	        {return variables.get(varname);}
	private void replaceVariable(String varname, double x2)
	        {variables.replace(varname, x2);}

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class VarDefContext extends ParserRuleContext {
		public Token ID;
		public ExprDContext exprD;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((VarDefContext)_localctx).ID = match(ID);
			setState(9);
			match(T__0);
			setState(10);
			((VarDefContext)_localctx).exprD = exprD(0);
			addVariable((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null), ((VarDefContext)_localctx).exprD.i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExprList(this);
		}
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
		public ExprDContext exprD;
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitTopExpr(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topExpr);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				((TopExprContext)_localctx).exprD = exprD(0);
				 System.out.println("result: "+ Double.toString(((TopExprContext)_localctx).exprD.i));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				varDef();
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

	public static class ExprDContext extends ParserRuleContext {
		public double i;
		public ExprDContext el;
		public Token ID;
		public Token op;
		public ExprDContext e;
		public ExprDContext exprD;
		public Token DOUBLE;
		public Token INT;
		public ExprDContext er;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public ExprDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExprD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExprD(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		return exprD(0);
	}

	private ExprDContext exprD(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprDContext _localctx = new ExprDContext(_ctx, _parentState);
		ExprDContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exprD, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(31);
				((ExprDContext)_localctx).ID = match(ID);
				((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				{
				setState(33);
				((ExprDContext)_localctx).op = match(T__2);
				setState(34);
				((ExprDContext)_localctx).ID = match(ID);
				double temp = getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)) + 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); 
				}
				break;
			case 3:
				{
				setState(36);
				((ExprDContext)_localctx).ID = match(ID);
				setState(37);
				((ExprDContext)_localctx).op = match(T__2);
				((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); double temp = _localctx.i + 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);
				}
				break;
			case 4:
				{
				setState(39);
				((ExprDContext)_localctx).op = match(T__3);
				setState(40);
				((ExprDContext)_localctx).ID = match(ID);
				double temp = getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)) - 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); 
				}
				break;
			case 5:
				{
				setState(42);
				((ExprDContext)_localctx).ID = match(ID);
				setState(43);
				((ExprDContext)_localctx).op = match(T__3);
				((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); double temp = _localctx.i - 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);
				}
				break;
			case 6:
				{
				setState(45);
				((ExprDContext)_localctx).op = match(T__10);
				setState(46);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(6);
				if (((ExprDContext)_localctx).e.i == 0.0) ((ExprDContext)_localctx).i =  1.0; else ((ExprDContext)_localctx).i =  0.0;
				}
				break;
			case 7:
				{
				setState(49);
				((ExprDContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprDContext)_localctx).i = Double.parseDouble((((ExprDContext)_localctx).DOUBLE!=null?((ExprDContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case 8:
				{
				setState(51);
				((ExprDContext)_localctx).INT = match(INT);
				((ExprDContext)_localctx).i = (double)Integer.parseInt((((ExprDContext)_localctx).INT!=null?((ExprDContext)_localctx).INT.getText():null));
				}
				break;
			case 9:
				{
				setState(53);
				match(T__13);
				setState(54);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(55);
				match(T__14);
				((ExprDContext)_localctx).i =  ((ExprDContext)_localctx).exprD.i;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(60);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(61);
						((ExprDContext)_localctx).op = match(T__4);
						setState(62);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(13);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i*((ExprDContext)_localctx).er.i; 
						}
						break;
					case 2:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(65);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(66);
						((ExprDContext)_localctx).op = match(T__5);
						setState(67);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(12);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i/((ExprDContext)_localctx).er.i; 
						}
						break;
					case 3:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(70);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(71);
						((ExprDContext)_localctx).op = match(T__6);
						setState(72);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(11);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i+((ExprDContext)_localctx).er.i; 
						}
						break;
					case 4:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(75);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(76);
						((ExprDContext)_localctx).op = match(T__7);
						setState(77);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(10);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i-((ExprDContext)_localctx).er.i; 
						}
						break;
					case 5:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(80);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(81);
						((ExprDContext)_localctx).op = match(T__8);
						setState(82);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(9);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i%((ExprDContext)_localctx).er.i; 
						}
						break;
					case 6:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(85);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(86);
						((ExprDContext)_localctx).op = match(T__9);
						setState(87);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(8);
						 ((ExprDContext)_localctx).i = Math.pow(((ExprDContext)_localctx).el.i, ((ExprDContext)_localctx).er.i);
						}
						break;
					case 7:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(90);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
						((ExprDContext)_localctx).op = match(T__11);
						setState(92);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(6);
						if(((ExprDContext)_localctx).el.i != 0.0 && ((ExprDContext)_localctx).er.i !=0.0) ((ExprDContext)_localctx).i =  1.0; else ((ExprDContext)_localctx).i =  0.0; 
						}
						break;
					case 8:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(95);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(96);
						((ExprDContext)_localctx).op = match(T__12);
						setState(97);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(5);
						if(((ExprDContext)_localctx).el.i != 0.0 || ((ExprDContext)_localctx).er.i !=0.0) ((ExprDContext)_localctx).i =  1.0; else ((ExprDContext)_localctx).i =  0.0; 
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			return exprD_sempred((ExprDContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprD_sempred(ExprDContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\23\n\3\f\3\16\3"+
		"\26\13\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5"+
		"j\13\5\3\5\2\3\b\6\2\4\6\b\2\2\2z\2\n\3\2\2\2\4\17\3\2\2\2\6\36\3\2\2"+
		"\2\b<\3\2\2\2\n\13\7\23\2\2\13\f\7\3\2\2\f\r\5\b\5\2\r\16\b\2\1\2\16\3"+
		"\3\2\2\2\17\24\5\6\4\2\20\21\7\4\2\2\21\23\5\6\4\2\22\20\3\2\2\2\23\26"+
		"\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\27\31"+
		"\7\4\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\33\5\b\5\2\33\34"+
		"\b\4\1\2\34\37\3\2\2\2\35\37\5\2\2\2\36\32\3\2\2\2\36\35\3\2\2\2\37\7"+
		"\3\2\2\2 !\b\5\1\2!\"\7\23\2\2\"=\b\5\1\2#$\7\5\2\2$%\7\23\2\2%=\b\5\1"+
		"\2&\'\7\23\2\2\'(\7\5\2\2(=\b\5\1\2)*\7\6\2\2*+\7\23\2\2+=\b\5\1\2,-\7"+
		"\23\2\2-.\7\6\2\2.=\b\5\1\2/\60\7\r\2\2\60\61\5\b\5\b\61\62\b\5\1\2\62"+
		"=\3\2\2\2\63\64\7\24\2\2\64=\b\5\1\2\65\66\7\25\2\2\66=\b\5\1\2\678\7"+
		"\20\2\289\5\b\5\29:\7\21\2\2:;\b\5\1\2;=\3\2\2\2< \3\2\2\2<#\3\2\2\2<"+
		"&\3\2\2\2<)\3\2\2\2<,\3\2\2\2</\3\2\2\2<\63\3\2\2\2<\65\3\2\2\2<\67\3"+
		"\2\2\2=h\3\2\2\2>?\f\16\2\2?@\7\7\2\2@A\5\b\5\17AB\b\5\1\2Bg\3\2\2\2C"+
		"D\f\r\2\2DE\7\b\2\2EF\5\b\5\16FG\b\5\1\2Gg\3\2\2\2HI\f\f\2\2IJ\7\t\2\2"+
		"JK\5\b\5\rKL\b\5\1\2Lg\3\2\2\2MN\f\13\2\2NO\7\n\2\2OP\5\b\5\fPQ\b\5\1"+
		"\2Qg\3\2\2\2RS\f\n\2\2ST\7\13\2\2TU\5\b\5\13UV\b\5\1\2Vg\3\2\2\2WX\f\t"+
		"\2\2XY\7\f\2\2YZ\5\b\5\nZ[\b\5\1\2[g\3\2\2\2\\]\f\7\2\2]^\7\16\2\2^_\5"+
		"\b\5\b_`\b\5\1\2`g\3\2\2\2ab\f\6\2\2bc\7\17\2\2cd\5\b\5\7de\b\5\1\2eg"+
		"\3\2\2\2f>\3\2\2\2fC\3\2\2\2fH\3\2\2\2fM\3\2\2\2fR\3\2\2\2fW\3\2\2\2f"+
		"\\\3\2\2\2fa\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\t\3\2\2\2jh\3\2\2"+
		"\2\b\24\30\36<fh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}