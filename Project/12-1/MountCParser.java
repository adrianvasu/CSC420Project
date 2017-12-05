// Generated from MountC.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MountCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, LPAREN=3, RPAREN=4, COMMA=5, QUEST=6, COLON=7, SCOLON=8, 
		GETS=9, PLUS=10, MINUS=11, RETURN=12, NUM=13, ID=14, C=15, WS=16;
	public static final int
		RULE_program = 0, RULE_fun_def_list = 1, RULE_fun_def = 2, RULE_id_list = 3, 
		RULE_id_list_tail = 4, RULE_expr_list = 5, RULE_expr_list_tail = 6, RULE_expr = 7, 
		RULE_thenPart = 8, RULE_elsePart = 9, RULE_expr_tail = 10, RULE_term = 11, 
		RULE_term_tail = 12, RULE_arg_list = 13, RULE_arg_list_tail = 14, RULE_op = 15;
	public static final String[] ruleNames = {
		"program", "fun_def_list", "fun_def", "id_list", "id_list_tail", "expr_list", 
		"expr_list_tail", "expr", "thenPart", "elsePart", "expr_tail", "term", 
		"term_tail", "arg_list", "arg_list_tail", "op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "','", "'?'", "':'", "';'", "'='", "'+'", 
		"'-'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LBRACE", "RBRACE", "LPAREN", "RPAREN", "COMMA", "QUEST", "COLON", 
		"SCOLON", "GETS", "PLUS", "MINUS", "RETURN", "NUM", "ID", "C", "WS"
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
	public String getGrammarFileName() { return "MountC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MountCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Fun_def_listContext fun_def_list() {
			return getRuleContext(Fun_def_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			fun_def_list();
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

	public static class Fun_def_listContext extends ParserRuleContext {
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Fun_def_listContext fun_def_list() {
			return getRuleContext(Fun_def_listContext.class,0);
		}
		public Fun_def_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterFun_def_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitFun_def_list(this);
		}
	}

	public final Fun_def_listContext fun_def_list() throws RecognitionException {
		Fun_def_listContext _localctx = new Fun_def_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun_def_list);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				fun_def();
				setState(35);
				fun_def_list();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Fun_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MountCParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MountCParser.LPAREN, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MountCParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MountCParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(MountCParser.RETURN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(MountCParser.SCOLON, 0); }
		public TerminalNode RBRACE() { return getToken(MountCParser.RBRACE, 0); }
		public Fun_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterFun_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitFun_def(this);
		}
	}

	public final Fun_defContext fun_def() throws RecognitionException {
		Fun_defContext _localctx = new Fun_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fun_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ID);
			setState(41);
			match(LPAREN);
			setState(42);
			id_list();
			setState(43);
			match(RPAREN);
			setState(44);
			match(LBRACE);
			setState(45);
			match(RETURN);
			setState(46);
			expr_list();
			setState(47);
			match(SCOLON);
			setState(48);
			match(RBRACE);
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MountCParser.ID, 0); }
		public Id_list_tailContext id_list_tail() {
			return getRuleContext(Id_list_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id_list);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(ID);
				setState(51);
				id_list_tail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Id_list_tailContext extends ParserRuleContext {
		public Id_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list_tail; }
	 
		public Id_list_tailContext() { }
		public void copyFrom(Id_list_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterContext extends Id_list_tailContext {
		public TerminalNode COMMA() { return getToken(MountCParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(MountCParser.ID, 0); }
		public Id_list_tailContext id_list_tail() {
			return getRuleContext(Id_list_tailContext.class,0);
		}
		public ParameterContext(Id_list_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitParameter(this);
		}
	}
	public static class Epsilon1Context extends Id_list_tailContext {
		public Epsilon1Context(Id_list_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterEpsilon1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitEpsilon1(this);
		}
	}

	public final Id_list_tailContext id_list_tail() throws RecognitionException {
		Id_list_tailContext _localctx = new Id_list_tailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id_list_tail);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new ParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(COMMA);
				setState(56);
				match(ID);
				setState(57);
				id_list_tail();
				}
				break;
			case RPAREN:
				_localctx = new Epsilon1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Expr_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			expr(0);
			setState(62);
			expr_list_tail();
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

	public static class Expr_list_tailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MountCParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterExpr_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitExpr_list_tail(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr_list_tail);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(COMMA);
				setState(65);
				expr(0);
				setState(66);
				expr_list_tail();
				}
				break;
			case RPAREN:
			case SCOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public int ifID;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.ifID = ctx.ifID;
		}
	}
	public static class TermExprContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_tailContext expr_tail() {
			return getRuleContext(Expr_tailContext.class,0);
		}
		public TermExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitTermExpr(this);
		}
	}
	public static class IfExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ThenPartContext thenPart() {
			return getRuleContext(ThenPartContext.class,0);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitIfExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(MountCParser.LPAREN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MountCParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitParenExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case ID:
				{
				_localctx = new TermExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				term();
				setState(73);
				expr_tail();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(LPAREN);
				setState(76);
				expr_list();
				setState(77);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IfExprContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(81);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(82);
					thenPart();
					setState(83);
					expr(0);
					setState(84);
					elsePart();
					setState(85);
					expr(4);
					}
					} 
				}
				setState(91);
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

	public static class ThenPartContext extends ParserRuleContext {
		public TerminalNode QUEST() { return getToken(MountCParser.QUEST, 0); }
		public ThenPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterThenPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitThenPart(this);
		}
	}

	public final ThenPartContext thenPart() throws RecognitionException {
		ThenPartContext _localctx = new ThenPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_thenPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(QUEST);
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

	public static class ElsePartContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MountCParser.COLON, 0); }
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterElsePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitElsePart(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(COLON);
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

	public static class Expr_tailContext extends ParserRuleContext {
		public Expr_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_tail; }
	 
		public Expr_tailContext() { }
		public void copyFrom(Expr_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends Expr_tailContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddContext(Expr_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitAdd(this);
		}
	}
	public static class Epsilon3Context extends Expr_tailContext {
		public Epsilon3Context(Expr_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterEpsilon3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitEpsilon3(this);
		}
	}

	public final Expr_tailContext expr_tail() throws RecognitionException {
		Expr_tailContext _localctx = new Expr_tailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_tail);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				op();
				setState(97);
				expr(0);
				}
				break;
			case 2:
				_localctx = new Epsilon3Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdTermContext extends TermContext {
		public TerminalNode ID() { return getToken(MountCParser.ID, 0); }
		public Term_tailContext term_tail() {
			return getRuleContext(Term_tailContext.class,0);
		}
		public IdTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterIdTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitIdTerm(this);
		}
	}
	public static class NumTermContext extends TermContext {
		public TerminalNode NUM() { return getToken(MountCParser.NUM, 0); }
		public NumTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterNumTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitNumTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new IdTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(ID);
				setState(104);
				term_tail();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Term_tailContext extends ParserRuleContext {
		public Term_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_tail; }
	 
		public Term_tailContext() { }
		public void copyFrom(Term_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Epsilon2Context extends Term_tailContext {
		public Epsilon2Context(Term_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterEpsilon2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitEpsilon2(this);
		}
	}
	public static class FunCallContext extends Term_tailContext {
		public TerminalNode LPAREN() { return getToken(MountCParser.LPAREN, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MountCParser.RPAREN, 0); }
		public FunCallContext(Term_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitFunCall(this);
		}
	}
	public static class VarAssignContext extends Term_tailContext {
		public TerminalNode GETS() { return getToken(MountCParser.GETS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAssignContext(Term_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitVarAssign(this);
		}
	}

	public final Term_tailContext term_tail() throws RecognitionException {
		Term_tailContext _localctx = new Term_tailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term_tail);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new FunCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(LPAREN);
				setState(108);
				arg_list();
				setState(109);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new VarAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(GETS);
				setState(112);
				expr(0);
				}
				break;
			case 3:
				_localctx = new Epsilon2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Arg_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MountCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MountCParser.COMMA, i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				setState(116);
				expr(0);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(117);
					match(COMMA);
					setState(118);
					expr(0);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Arg_list_tailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MountCParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Arg_list_tailContext arg_list_tail() {
			return getRuleContext(Arg_list_tailContext.class,0);
		}
		public Arg_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterArg_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitArg_list_tail(this);
		}
	}

	public final Arg_list_tailContext arg_list_tail() throws RecognitionException {
		Arg_list_tailContext _localctx = new Arg_list_tailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arg_list_tail);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(COMMA);
				setState(127);
				expr(0);
				setState(128);
				arg_list_tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MountCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MountCParser.MINUS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MountCListener ) ((MountCListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\5\bH\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tR\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f"+
		"g\n\f\3\r\3\r\3\r\5\rl\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16u\n"+
		"\16\3\17\3\17\3\17\7\17z\n\17\f\17\16\17}\13\17\5\17\177\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0086\n\20\3\21\3\21\3\21\2\3\20\22\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \2\3\3\2\f\r\2\u0086\2\"\3\2\2\2\4(\3\2\2\2\6"+
		"*\3\2\2\2\b\67\3\2\2\2\n=\3\2\2\2\f?\3\2\2\2\16G\3\2\2\2\20Q\3\2\2\2\22"+
		"^\3\2\2\2\24`\3\2\2\2\26f\3\2\2\2\30k\3\2\2\2\32t\3\2\2\2\34~\3\2\2\2"+
		"\36\u0085\3\2\2\2 \u0087\3\2\2\2\"#\5\4\3\2#\3\3\2\2\2$%\5\6\4\2%&\5\4"+
		"\3\2&)\3\2\2\2\')\3\2\2\2($\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7\20\2\2+"+
		",\7\5\2\2,-\5\b\5\2-.\7\6\2\2./\7\3\2\2/\60\7\16\2\2\60\61\5\f\7\2\61"+
		"\62\7\n\2\2\62\63\7\4\2\2\63\7\3\2\2\2\64\65\7\20\2\2\658\5\n\6\2\668"+
		"\3\2\2\2\67\64\3\2\2\2\67\66\3\2\2\28\t\3\2\2\29:\7\7\2\2:;\7\20\2\2;"+
		">\5\n\6\2<>\3\2\2\2=9\3\2\2\2=<\3\2\2\2>\13\3\2\2\2?@\5\20\t\2@A\5\16"+
		"\b\2A\r\3\2\2\2BC\7\7\2\2CD\5\20\t\2DE\5\16\b\2EH\3\2\2\2FH\3\2\2\2GB"+
		"\3\2\2\2GF\3\2\2\2H\17\3\2\2\2IJ\b\t\1\2JK\5\30\r\2KL\5\26\f\2LR\3\2\2"+
		"\2MN\7\5\2\2NO\5\f\7\2OP\7\6\2\2PR\3\2\2\2QI\3\2\2\2QM\3\2\2\2R[\3\2\2"+
		"\2ST\f\5\2\2TU\5\22\n\2UV\5\20\t\2VW\5\24\13\2WX\5\20\t\6XZ\3\2\2\2YS"+
		"\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2\2^_\7\b\2"+
		"\2_\23\3\2\2\2`a\7\t\2\2a\25\3\2\2\2bc\5 \21\2cd\5\20\t\2dg\3\2\2\2eg"+
		"\3\2\2\2fb\3\2\2\2fe\3\2\2\2g\27\3\2\2\2hl\7\17\2\2ij\7\20\2\2jl\5\32"+
		"\16\2kh\3\2\2\2ki\3\2\2\2l\31\3\2\2\2mn\7\5\2\2no\5\34\17\2op\7\6\2\2"+
		"pu\3\2\2\2qr\7\13\2\2ru\5\20\t\2su\3\2\2\2tm\3\2\2\2tq\3\2\2\2ts\3\2\2"+
		"\2u\33\3\2\2\2v{\5\20\t\2wx\7\7\2\2xz\5\20\t\2yw\3\2\2\2z}\3\2\2\2{y\3"+
		"\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~v\3\2\2\2~\177\3\2\2\2\177\35"+
		"\3\2\2\2\u0080\u0081\7\7\2\2\u0081\u0082\5\20\t\2\u0082\u0083\5\36\20"+
		"\2\u0083\u0086\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\37\3\2\2\2\u0087\u0088\t\2\2\2\u0088!\3\2\2\2\16(\67=G"+
		"Q[fkt{~\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}