// Generated from MountC.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MountCParser}.
 */
public interface MountCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MountCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MountCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MountCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#fun_def_list}.
	 * @param ctx the parse tree
	 */
	void enterFun_def_list(MountCParser.Fun_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#fun_def_list}.
	 * @param ctx the parse tree
	 */
	void exitFun_def_list(MountCParser.Fun_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void enterFun_def(MountCParser.Fun_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void exitFun_def(MountCParser.Fun_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(MountCParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(MountCParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#id_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_list_tail(MountCParser.Id_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#id_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_list_tail(MountCParser.Id_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(MountCParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(MountCParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(MountCParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(MountCParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MountCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MountCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#expr_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_tail(MountCParser.Expr_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#expr_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_tail(MountCParser.Expr_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MountCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MountCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#term_tail}.
	 * @param ctx the parse tree
	 */
	void enterTerm_tail(MountCParser.Term_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#term_tail}.
	 * @param ctx the parse tree
	 */
	void exitTerm_tail(MountCParser.Term_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(MountCParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(MountCParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#arg_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterArg_list_tail(MountCParser.Arg_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#arg_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitArg_list_tail(MountCParser.Arg_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MountCParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(MountCParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MountCParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(MountCParser.OpContext ctx);
}