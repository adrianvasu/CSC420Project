public class CompilerListener extends MountCBaseListener {
  @Override
  public void enterProgram(MountCParser.ProgramContext ctx) {
    System.out.println("Entering program...");
  }
  @Override
  public void exitProgram(MountCParser.ProgramContext ctx) {
    System.out.println("Leaving program.");
  }

  @Override
  public void enterFun_def(MountCParser.Fun_defContext ctx) {
    System.out.println("Name of function is " + ctx.ID());
  }

}
