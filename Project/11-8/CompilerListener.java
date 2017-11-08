import java.util.HashMap;

public class CompilerListener extends MountCBaseListener {

    private HashMap symbolTable = new HashMap(Map<Integer, SymbolTableEntry> m);

    @Override
    public void enterProgram(MountCParser.ProgramContext ctx) {
        System.out.println("\tSUBSP\t2,i");
        System.out.println("\tCALL\tmain");
        System.out.println("\tADDSP\t2,i");
        System.out.println("\tSTOP");
    }

    @Override
    public void exitProgram(MountCParser.ProgramContext ctx) {
        System.out.println("\t.END");
    }

    @Override
    public void enterFun_def(MountCParser.Fun_defContext ctx) {
        System.out.println(ctx.ID().toString() + ":\tNOP0");
    }

    @Override public void exitFun_def(MountCParser.Fun_defContext ctx) {

    }
    @Override
    public void exitFunCall(MountCParser.FunCallContext ctx) {
        //System.out.println("\tCALL\t" + symbolTable.get());
    }
    @Override
    public void enterIdTerm(MountCParser.IdTermContext ctx) {
        //symbolTable.put(ctx.ID().toString());
    }
}
