// Generated from Project.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#fun_def_list}.
	 * @param ctx the parse tree
	 */
	void enterFun_def_list(ProjectParser.Fun_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#fun_def_list}.
	 * @param ctx the parse tree
	 */
	void exitFun_def_list(ProjectParser.Fun_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void enterFun_def(ProjectParser.Fun_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void exitFun_def(ProjectParser.Fun_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(ProjectParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(ProjectParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#id_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_list_tail(ProjectParser.Id_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#id_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_list_tail(ProjectParser.Id_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(ProjectParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(ProjectParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(ProjectParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(ProjectParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ProjectParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ProjectParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#expr_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_tail(ProjectParser.Expr_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#expr_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_tail(ProjectParser.Expr_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ProjectParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ProjectParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#term_tail}.
	 * @param ctx the parse tree
	 */
	void enterTerm_tail(ProjectParser.Term_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#term_tail}.
	 * @param ctx the parse tree
	 */
	void exitTerm_tail(ProjectParser.Term_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(ProjectParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(ProjectParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#arg_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterArg_list_tail(ProjectParser.Arg_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#arg_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitArg_list_tail(ProjectParser.Arg_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ProjectParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ProjectParser.OpContext ctx);
}