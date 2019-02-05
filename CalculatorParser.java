// Generated from Calculator.g4 by ANTLR 4.7.2

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, VAR=22, ID=23, DOUBLE=24, INT=25, 
		COMMENT=26, WS=27;
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
			null, "'='", "'read()'", "';'", "'-'", "'++'", "'--'", "'^'", "'sqrt'", 
			"'('", "')'", "'s'", "'c'", "'e'", "'l'", "'*'", "'/'", "'+'", "'%'", 
			"'!'", "'&&'", "'||'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "VAR", "ID", 
			"DOUBLE", "INT", "COMMENT", "WS"
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
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				((VarDefContext)_localctx).ID = match(ID);
				setState(14);
				match(T__0);
				setState(15);
				match(T__1);
				Scanner scanny = new Scanner(System.in); addVariable((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null), scanny.nextDouble());
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
			setState(19);
			topExpr();
			setState(24);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					match(T__2);
					setState(21);
					topExpr();
					}
					} 
				}
				setState(26);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(27);
				match(T__2);
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
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				((TopExprContext)_localctx).exprD = exprD(0);
				 System.out.println("result: "+ Double.toString(((TopExprContext)_localctx).exprD.i));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(37);
				((ExprDContext)_localctx).ID = match(ID);
				((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				{
				setState(39);
				((ExprDContext)_localctx).op = match(T__3);
				setState(40);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(22);
				 ((ExprDContext)_localctx).i = ((-1)*(((ExprDContext)_localctx).e.i));
				}
				break;
			case 3:
				{
				setState(43);
				((ExprDContext)_localctx).op = match(T__4);
				setState(44);
				((ExprDContext)_localctx).ID = match(ID);
				double temp = getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)) + 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); 
				}
				break;
			case 4:
				{
				setState(46);
				((ExprDContext)_localctx).ID = match(ID);
				setState(47);
				((ExprDContext)_localctx).op = match(T__4);
				((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); double temp = _localctx.i + 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);
				}
				break;
			case 5:
				{
				setState(49);
				((ExprDContext)_localctx).op = match(T__5);
				setState(50);
				((ExprDContext)_localctx).ID = match(ID);
				double temp = getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)) - 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); 
				}
				break;
			case 6:
				{
				setState(52);
				((ExprDContext)_localctx).ID = match(ID);
				setState(53);
				((ExprDContext)_localctx).op = match(T__5);
				((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); double temp = _localctx.i - 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);
				}
				break;
			case 7:
				{
				setState(55);
				((ExprDContext)_localctx).op = match(T__7);
				setState(56);
				match(T__8);
				setState(57);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(58);
				match(T__9);
				 ((ExprDContext)_localctx).i = Math.sqrt(((ExprDContext)_localctx).e.i);
				}
				break;
			case 8:
				{
				setState(61);
				((ExprDContext)_localctx).op = match(T__10);
				setState(62);
				match(T__8);
				setState(63);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(64);
				match(T__9);
				 ((ExprDContext)_localctx).i = Math.sin(((ExprDContext)_localctx).e.i);
				}
				break;
			case 9:
				{
				setState(67);
				((ExprDContext)_localctx).op = match(T__11);
				setState(68);
				match(T__8);
				setState(69);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(70);
				match(T__9);
				 ((ExprDContext)_localctx).i = Math.cos(((ExprDContext)_localctx).e.i);
				}
				break;
			case 10:
				{
				setState(73);
				((ExprDContext)_localctx).op = match(T__12);
				setState(74);
				match(T__8);
				setState(75);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(76);
				match(T__9);
				 ((ExprDContext)_localctx).i = Math.exp(((ExprDContext)_localctx).e.i);
				}
				break;
			case 11:
				{
				setState(79);
				((ExprDContext)_localctx).op = match(T__13);
				setState(80);
				match(T__8);
				setState(81);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(82);
				match(T__9);
				 ((ExprDContext)_localctx).i = Math.log(((ExprDContext)_localctx).e.i);
				}
				break;
			case 12:
				{
				setState(85);
				((ExprDContext)_localctx).op = match(T__18);
				setState(86);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(6);
				if (((ExprDContext)_localctx).e.i == 0.0) ((ExprDContext)_localctx).i =  1.0; else ((ExprDContext)_localctx).i =  0.0;
				}
				break;
			case 13:
				{
				setState(89);
				((ExprDContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprDContext)_localctx).i = Double.parseDouble((((ExprDContext)_localctx).DOUBLE!=null?((ExprDContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case 14:
				{
				setState(91);
				((ExprDContext)_localctx).INT = match(INT);
				((ExprDContext)_localctx).i = (double)Integer.parseInt((((ExprDContext)_localctx).INT!=null?((ExprDContext)_localctx).INT.getText():null));
				}
				break;
			case 15:
				{
				setState(93);
				match(T__8);
				setState(94);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(95);
				match(T__9);
				((ExprDContext)_localctx).i =  ((ExprDContext)_localctx).exprD.i;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(100);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(101);
						((ExprDContext)_localctx).op = match(T__6);
						setState(102);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(18);
						 ((ExprDContext)_localctx).i = Math.pow(((ExprDContext)_localctx).el.i, ((ExprDContext)_localctx).er.i);
						}
						break;
					case 2:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(105);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(106);
						((ExprDContext)_localctx).op = match(T__14);
						setState(107);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(12);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i*((ExprDContext)_localctx).er.i; 
						}
						break;
					case 3:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(110);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(111);
						((ExprDContext)_localctx).op = match(T__15);
						setState(112);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(11);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i/((ExprDContext)_localctx).er.i; 
						}
						break;
					case 4:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(115);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(116);
						((ExprDContext)_localctx).op = match(T__16);
						setState(117);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(10);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i+((ExprDContext)_localctx).er.i; 
						}
						break;
					case 5:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(120);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(121);
						((ExprDContext)_localctx).op = match(T__3);
						setState(122);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(9);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i-((ExprDContext)_localctx).er.i; 
						}
						break;
					case 6:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(125);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(126);
						((ExprDContext)_localctx).op = match(T__17);
						setState(127);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(8);
						 ((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i%((ExprDContext)_localctx).er.i; 
						}
						break;
					case 7:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(130);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(131);
						((ExprDContext)_localctx).op = match(T__19);
						setState(132);
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
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						((ExprDContext)_localctx).op = match(T__20);
						setState(137);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(5);
						if(((ExprDContext)_localctx).el.i != 0.0 || ((ExprDContext)_localctx).er.i !=0.0) ((ExprDContext)_localctx).i =  1.0; else ((ExprDContext)_localctx).i =  0.0; 
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			return precpred(_ctx, 17);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\24\n"+
		"\2\3\3\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\5\3\37\n\3\3\4\3\4\3\4"+
		"\3\4\5\4%\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5e\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\u008f\n\5\f\5\16\5\u0092\13\5\3\5\2\3\b\6\2\4\6\b\2\2"+
		"\2\u00a9\2\23\3\2\2\2\4\25\3\2\2\2\6$\3\2\2\2\bd\3\2\2\2\n\13\7\31\2\2"+
		"\13\f\7\3\2\2\f\r\5\b\5\2\r\16\b\2\1\2\16\24\3\2\2\2\17\20\7\31\2\2\20"+
		"\21\7\3\2\2\21\22\7\4\2\2\22\24\b\2\1\2\23\n\3\2\2\2\23\17\3\2\2\2\24"+
		"\3\3\2\2\2\25\32\5\6\4\2\26\27\7\5\2\2\27\31\5\6\4\2\30\26\3\2\2\2\31"+
		"\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\35"+
		"\37\7\5\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2\2 !\5\b\5\2!\"\b\4"+
		"\1\2\"%\3\2\2\2#%\5\2\2\2$ \3\2\2\2$#\3\2\2\2%\7\3\2\2\2&\'\b\5\1\2\'"+
		"(\7\31\2\2(e\b\5\1\2)*\7\6\2\2*+\5\b\5\30+,\b\5\1\2,e\3\2\2\2-.\7\7\2"+
		"\2./\7\31\2\2/e\b\5\1\2\60\61\7\31\2\2\61\62\7\7\2\2\62e\b\5\1\2\63\64"+
		"\7\b\2\2\64\65\7\31\2\2\65e\b\5\1\2\66\67\7\31\2\2\678\7\b\2\28e\b\5\1"+
		"\29:\7\n\2\2:;\7\13\2\2;<\5\b\5\2<=\7\f\2\2=>\b\5\1\2>e\3\2\2\2?@\7\r"+
		"\2\2@A\7\13\2\2AB\5\b\5\2BC\7\f\2\2CD\b\5\1\2De\3\2\2\2EF\7\16\2\2FG\7"+
		"\13\2\2GH\5\b\5\2HI\7\f\2\2IJ\b\5\1\2Je\3\2\2\2KL\7\17\2\2LM\7\13\2\2"+
		"MN\5\b\5\2NO\7\f\2\2OP\b\5\1\2Pe\3\2\2\2QR\7\20\2\2RS\7\13\2\2ST\5\b\5"+
		"\2TU\7\f\2\2UV\b\5\1\2Ve\3\2\2\2WX\7\25\2\2XY\5\b\5\bYZ\b\5\1\2Ze\3\2"+
		"\2\2[\\\7\32\2\2\\e\b\5\1\2]^\7\33\2\2^e\b\5\1\2_`\7\13\2\2`a\5\b\5\2"+
		"ab\7\f\2\2bc\b\5\1\2ce\3\2\2\2d&\3\2\2\2d)\3\2\2\2d-\3\2\2\2d\60\3\2\2"+
		"\2d\63\3\2\2\2d\66\3\2\2\2d9\3\2\2\2d?\3\2\2\2dE\3\2\2\2dK\3\2\2\2dQ\3"+
		"\2\2\2dW\3\2\2\2d[\3\2\2\2d]\3\2\2\2d_\3\2\2\2e\u0090\3\2\2\2fg\f\23\2"+
		"\2gh\7\t\2\2hi\5\b\5\24ij\b\5\1\2j\u008f\3\2\2\2kl\f\r\2\2lm\7\21\2\2"+
		"mn\5\b\5\16no\b\5\1\2o\u008f\3\2\2\2pq\f\f\2\2qr\7\22\2\2rs\5\b\5\rst"+
		"\b\5\1\2t\u008f\3\2\2\2uv\f\13\2\2vw\7\23\2\2wx\5\b\5\fxy\b\5\1\2y\u008f"+
		"\3\2\2\2z{\f\n\2\2{|\7\6\2\2|}\5\b\5\13}~\b\5\1\2~\u008f\3\2\2\2\177\u0080"+
		"\f\t\2\2\u0080\u0081\7\24\2\2\u0081\u0082\5\b\5\n\u0082\u0083\b\5\1\2"+
		"\u0083\u008f\3\2\2\2\u0084\u0085\f\7\2\2\u0085\u0086\7\26\2\2\u0086\u0087"+
		"\5\b\5\b\u0087\u0088\b\5\1\2\u0088\u008f\3\2\2\2\u0089\u008a\f\6\2\2\u008a"+
		"\u008b\7\27\2\2\u008b\u008c\5\b\5\7\u008c\u008d\b\5\1\2\u008d\u008f\3"+
		"\2\2\2\u008ef\3\2\2\2\u008ek\3\2\2\2\u008ep\3\2\2\2\u008eu\3\2\2\2\u008e"+
		"z\3\2\2\2\u008e\177\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0089\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\t\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\t\23\32\36$d\u008e\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}