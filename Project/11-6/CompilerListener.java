public class CompilerListener extends MountCBaseListener {

    @Override
    public void enterProgram(MountCParser.ProgramContext ctx) {
        //System.out.println("Entering program...");
    }

    @Override
    public void exitProgram(MountCParser.ProgramContext ctx) {
        System.out.println(".END");
    }

    @Override
    public void enterFun_def(MountCParser.Fun_defContext ctx) {
        //System.out.println("Name of function is " + ctx.ID());
    }

    @Override public void exitFun_def(MountCParser.Fun_defContext ctx) {
        if(ctx.ID().toString().equals("main")) { // toString allows matching and printing of the ID
            System.out.println("STOP");
        }
    }

    @Override
    public void enterExpr_list(MountCParser.Expr_listContext ctx) {

    }

    @Override
    public void exitExpr_list(MountCParser.Expr_listContext ctx) {

    }

    @Override
    public void enterExpr_list_tail(MountCParser.Expr_list_tailContext ctx) {

    }

    @Override
    public void exitExpr_list_tail(MountCParser.Expr_list_tailContext ctx) {

    }

    @Override
    public void enterExpr(MountCParser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(MountCParser.ExprContext ctx) {

    }

    @Override
    public void enterExpr_tail(MountCParser.Expr_tailContext ctx) {

    }

    @Override
    public void exitExpr_tail(MountCParser.Expr_tailContext ctx) {

    }

    @Override
    public void enterTerm(MountCParser.TermContext ctx) {

    }

    @Override
    public void exitTerm(MountCParser.TermContext ctx) {

    }

    @Override
    public void enterTerm_tail(MountCParser.Term_tailContext ctx) {

    }
    
    @Override
    public void exitTerm_tail(MountCParser.Term_tailContext ctx) {

    }
}
