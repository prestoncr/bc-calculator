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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, VAR=24, ID=25, 
		DOUBLE=26, INT=27, COMMENT=28, WS=29;
	public static final int
		RULE_varDef = 0, RULE_printList = 1, RULE_print = 2, RULE_exprList = 3, 
		RULE_topExpr = 4, RULE_exprD = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"varDef", "printList", "print", "exprList", "topExpr", "exprD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'read()'", "'print'", "','", "';'", "'-'", "'++'", "'--'", 
			"'^'", "'sqrt'", "'('", "')'", "'s'", "'c'", "'e'", "'l'", "'*'", "'/'", 
			"'+'", "'%'", "'!'", "'&&'", "'||'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"VAR", "ID", "DOUBLE", "INT", "COMMENT", "WS"
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
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				((VarDefContext)_localctx).ID = match(ID);
				setState(13);
				match(T__0);
				setState(14);
				((VarDefContext)_localctx).exprD = exprD(0);
				addVariable((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null), ((VarDefContext)_localctx).exprD.i);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				((VarDefContext)_localctx).ID = match(ID);
				setState(18);
				match(T__0);
				setState(19);
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

	public static class PrintListContext extends ParserRuleContext {
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public PrintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPrintList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPrintList(this);
		}
	}

	public final PrintListContext printList() throws RecognitionException {
		PrintListContext _localctx = new PrintListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_printList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__2);
			setState(24);
			print();
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(25);
					match(T__3);
					setState(26);
					print();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class PrintContext extends ParserRuleContext {
		public ExprDContext exprD;
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((PrintContext)_localctx).exprD = exprD(0);
			System.out.print(Double.toString(((PrintContext)_localctx).exprD.i)+ " ");
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
		enterRule(_localctx, 6, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			topExpr();
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					match(T__4);
					setState(37);
					topExpr();
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(43);
				match(T__4);
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
		public PrintListContext printList() {
			return getRuleContext(PrintListContext.class,0);
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
		enterRule(_localctx, 8, RULE_topExpr);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((TopExprContext)_localctx).exprD = exprD(0);
				 System.out.println("result: "+ Double.toString(((TopExprContext)_localctx).exprD.i));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				varDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				printList();
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exprD, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(54);
				((ExprDContext)_localctx).ID = match(ID);
				((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				{
				setState(56);
				((ExprDContext)_localctx).op = match(T__5);
				setState(57);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(22);
				 ((ExprDContext)_localctx).i = ((-1)*(((ExprDContext)_localctx).e.i));
				}
				break;
			case 3:
				{
				setState(60);
				((ExprDContext)_localctx).op = match(T__6);
				setState(61);
				((ExprDContext)_localctx).ID = match(ID);
				double temp = getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)) + 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); 
				}
				break;
			case 4:
				{
				setState(63);
				((ExprDContext)_localctx).ID = match(ID);
				setState(64);
				((ExprDContext)_localctx).op = match(T__6);
				((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); double temp = _localctx.i + 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);
				}
				break;
			case 5:
				{
				setState(66);
				((ExprDContext)_localctx).op = match(T__7);
				setState(67);
				((ExprDContext)_localctx).ID = match(ID);
				double temp = getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)) - 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); 
				}
				break;
			case 6:
				{
				setState(69);
				((ExprDContext)_localctx).ID = match(ID);
				setState(70);
				((ExprDContext)_localctx).op = match(T__7);
				((ExprDContext)_localctx).i =  getVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null)); double temp = _localctx.i - 1.0; replaceVariable((((ExprDContext)_localctx).ID!=null?((ExprDContext)_localctx).ID.getText():null), temp);
				}
				break;
			case 7:
				{
				setState(72);
				((ExprDContext)_localctx).op = match(T__9);
				setState(73);
				match(T__10);
				setState(74);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(75);
				match(T__11);
				 ((ExprDContext)_localctx).i = Math.sqrt(((ExprDContext)_localctx).e.i);
				}
				break;
			case 8:
				{
				setState(78);
				((ExprDContext)_localctx).op = match(T__12);
				setState(79);
				match(T__10);
				setState(80);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(81);
				match(T__11);
				 ((ExprDContext)_localctx).i = Math.sin(((ExprDContext)_localctx).e.i);
				}
				break;
			case 9:
				{
				setState(84);
				((ExprDContext)_localctx).op = match(T__13);
				setState(85);
				match(T__10);
				setState(86);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(87);
				match(T__11);
				 ((ExprDContext)_localctx).i = Math.cos(((ExprDContext)_localctx).e.i);
				}
				break;
			case 10:
				{
				setState(90);
				((ExprDContext)_localctx).op = match(T__14);
				setState(91);
				match(T__10);
				setState(92);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(93);
				match(T__11);
				 ((ExprDContext)_localctx).i = Math.exp(((ExprDContext)_localctx).e.i);
				}
				break;
			case 11:
				{
				setState(96);
				((ExprDContext)_localctx).op = match(T__15);
				setState(97);
				match(T__10);
				setState(98);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(99);
				match(T__11);
				 ((ExprDContext)_localctx).i = Math.log(((ExprDContext)_localctx).e.i);
				}
				break;
			case 12:
				{
				setState(102);
				((ExprDContext)_localctx).op = match(T__20);
				setState(103);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(6);
				if (((ExprDContext)_localctx).e.i == 0.0) ((ExprDContext)_localctx).i =  1.0; else ((ExprDContext)_localctx).i =  0.0;
				}
				break;
			case 13:
				{
				setState(106);
				((ExprDContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprDContext)_localctx).i = Double.parseDouble((((ExprDContext)_localctx).DOUBLE!=null?((ExprDContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case 14:
				{
				setState(108);
				((ExprDContext)_localctx).INT = match(INT);
				((ExprDContext)_localctx).i = (double)Integer.parseInt((((ExprDContext)_localctx).INT!=null?((ExprDContext)_localctx).INT.getText():null));
				}
				break;
			case 15:
				{
				setState(110);
				match(T__10);
				setState(111);
				((ExprDContext)_localctx).e = ((ExprDContext)_localctx).exprD = exprD(0);
				setState(112);
				match(T__11);
				((ExprDContext)_localctx).i =  ((ExprDContext)_localctx).exprD.i;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(117);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(118);
						((ExprDContext)_localctx).op = match(T__8);
						setState(119);
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
						setState(122);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(123);
						((ExprDContext)_localctx).op = match(T__16);
						setState(124);
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
						setState(127);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(128);
						((ExprDContext)_localctx).op = match(T__17);
						setState(129);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(11);
						 if(((ExprDContext)_localctx).er.i == 0.0){System.out.println("Runtime error: divde by zero");System.exit(1);}else {((ExprDContext)_localctx).i = ((ExprDContext)_localctx).el.i/((ExprDContext)_localctx).er.i;}; 
						}
						break;
					case 4:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(132);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(133);
						((ExprDContext)_localctx).op = match(T__18);
						setState(134);
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
						setState(137);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(138);
						((ExprDContext)_localctx).op = match(T__5);
						setState(139);
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
						setState(142);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(143);
						((ExprDContext)_localctx).op = match(T__19);
						setState(144);
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
						setState(147);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(148);
						((ExprDContext)_localctx).op = match(T__21);
						setState(149);
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
						setState(152);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(153);
						((ExprDContext)_localctx).op = match(T__22);
						setState(154);
						((ExprDContext)_localctx).er = ((ExprDContext)_localctx).exprD = exprD(5);
						if(((ExprDContext)_localctx).el.i != 0.0 || ((ExprDContext)_localctx).er.i !=0.0) ((ExprDContext)_localctx).i =  1.0; else ((ExprDContext)_localctx).i =  0.0; 
						}
						break;
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 5:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\30\n\2\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\7\5)\n\5\f\5\16\5,\13\5\3\5\5\5/\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\66\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7v\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u00a0\n\7\f\7\16\7\u00a3\13\7\3\7\3\37\3\f\b\2\4\6\b"+
		"\n\f\2\2\2\u00ba\2\27\3\2\2\2\4\31\3\2\2\2\6\"\3\2\2\2\b%\3\2\2\2\n\65"+
		"\3\2\2\2\fu\3\2\2\2\16\17\7\33\2\2\17\20\7\3\2\2\20\21\5\f\7\2\21\22\b"+
		"\2\1\2\22\30\3\2\2\2\23\24\7\33\2\2\24\25\7\3\2\2\25\26\7\4\2\2\26\30"+
		"\b\2\1\2\27\16\3\2\2\2\27\23\3\2\2\2\30\3\3\2\2\2\31\32\7\5\2\2\32\37"+
		"\5\6\4\2\33\34\7\6\2\2\34\36\5\6\4\2\35\33\3\2\2\2\36!\3\2\2\2\37 \3\2"+
		"\2\2\37\35\3\2\2\2 \5\3\2\2\2!\37\3\2\2\2\"#\5\f\7\2#$\b\4\1\2$\7\3\2"+
		"\2\2%*\5\n\6\2&\'\7\7\2\2\')\5\n\6\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3"+
		"\2\2\2+.\3\2\2\2,*\3\2\2\2-/\7\7\2\2.-\3\2\2\2./\3\2\2\2/\t\3\2\2\2\60"+
		"\61\5\f\7\2\61\62\b\6\1\2\62\66\3\2\2\2\63\66\5\2\2\2\64\66\5\4\3\2\65"+
		"\60\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\13\3\2\2\2\678\b\7\1\289\7"+
		"\33\2\29v\b\7\1\2:;\7\b\2\2;<\5\f\7\30<=\b\7\1\2=v\3\2\2\2>?\7\t\2\2?"+
		"@\7\33\2\2@v\b\7\1\2AB\7\33\2\2BC\7\t\2\2Cv\b\7\1\2DE\7\n\2\2EF\7\33\2"+
		"\2Fv\b\7\1\2GH\7\33\2\2HI\7\n\2\2Iv\b\7\1\2JK\7\f\2\2KL\7\r\2\2LM\5\f"+
		"\7\2MN\7\16\2\2NO\b\7\1\2Ov\3\2\2\2PQ\7\17\2\2QR\7\r\2\2RS\5\f\7\2ST\7"+
		"\16\2\2TU\b\7\1\2Uv\3\2\2\2VW\7\20\2\2WX\7\r\2\2XY\5\f\7\2YZ\7\16\2\2"+
		"Z[\b\7\1\2[v\3\2\2\2\\]\7\21\2\2]^\7\r\2\2^_\5\f\7\2_`\7\16\2\2`a\b\7"+
		"\1\2av\3\2\2\2bc\7\22\2\2cd\7\r\2\2de\5\f\7\2ef\7\16\2\2fg\b\7\1\2gv\3"+
		"\2\2\2hi\7\27\2\2ij\5\f\7\bjk\b\7\1\2kv\3\2\2\2lm\7\34\2\2mv\b\7\1\2n"+
		"o\7\35\2\2ov\b\7\1\2pq\7\r\2\2qr\5\f\7\2rs\7\16\2\2st\b\7\1\2tv\3\2\2"+
		"\2u\67\3\2\2\2u:\3\2\2\2u>\3\2\2\2uA\3\2\2\2uD\3\2\2\2uG\3\2\2\2uJ\3\2"+
		"\2\2uP\3\2\2\2uV\3\2\2\2u\\\3\2\2\2ub\3\2\2\2uh\3\2\2\2ul\3\2\2\2un\3"+
		"\2\2\2up\3\2\2\2v\u00a1\3\2\2\2wx\f\23\2\2xy\7\13\2\2yz\5\f\7\24z{\b\7"+
		"\1\2{\u00a0\3\2\2\2|}\f\r\2\2}~\7\23\2\2~\177\5\f\7\16\177\u0080\b\7\1"+
		"\2\u0080\u00a0\3\2\2\2\u0081\u0082\f\f\2\2\u0082\u0083\7\24\2\2\u0083"+
		"\u0084\5\f\7\r\u0084\u0085\b\7\1\2\u0085\u00a0\3\2\2\2\u0086\u0087\f\13"+
		"\2\2\u0087\u0088\7\25\2\2\u0088\u0089\5\f\7\f\u0089\u008a\b\7\1\2\u008a"+
		"\u00a0\3\2\2\2\u008b\u008c\f\n\2\2\u008c\u008d\7\b\2\2\u008d\u008e\5\f"+
		"\7\13\u008e\u008f\b\7\1\2\u008f\u00a0\3\2\2\2\u0090\u0091\f\t\2\2\u0091"+
		"\u0092\7\26\2\2\u0092\u0093\5\f\7\n\u0093\u0094\b\7\1\2\u0094\u00a0\3"+
		"\2\2\2\u0095\u0096\f\7\2\2\u0096\u0097\7\30\2\2\u0097\u0098\5\f\7\b\u0098"+
		"\u0099\b\7\1\2\u0099\u00a0\3\2\2\2\u009a\u009b\f\6\2\2\u009b\u009c\7\31"+
		"\2\2\u009c\u009d\5\f\7\7\u009d\u009e\b\7\1\2\u009e\u00a0\3\2\2\2\u009f"+
		"w\3\2\2\2\u009f|\3\2\2\2\u009f\u0081\3\2\2\2\u009f\u0086\3\2\2\2\u009f"+
		"\u008b\3\2\2\2\u009f\u0090\3\2\2\2\u009f\u0095\3\2\2\2\u009f\u009a\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\r\3\2\2\2\u00a3\u00a1\3\2\2\2\n\27\37*.\65u\u009f\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}