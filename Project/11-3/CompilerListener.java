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
      if(ctx.getText().contains("main")) {
          System.out.println("STOP");
      }
  }
  @Override
  public void enterExpr_list(MountCParser.Expr_listContext ctx) {
      
  }
}
