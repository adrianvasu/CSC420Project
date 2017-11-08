import java.util.HashMap;

public class CompilerListener extends MountCBaseListener {

    private Map<Integer, SymbolTableEntry> symbolTable = new HashMap<Integer, SymbolTableEntry>();
    private int keyCount = 0;

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
        System.out.println("\tSTWA\t2,s");
        System.out.println("\tRET");
    }

    @Override
    public void enterNumTerm(MountCParser.NumTermContext ctx) {
        System.out.println("\tLDWA\t" + ctx.NUM() + ",s");
    }

    @Override
    public void exitIdTerm(MountCParser.IdTermContext ctx) {
        System.out.println("\tCALL\t" + ctx.ID().toString());
    }

    @Override
    public void exitFunCall(MountCParser.FunCallContext ctx) {
        System.out.println("\tCALL\t" + symbolTable.get(keyCount).getId());
    }

    @Override
    public void enterIdTerm(MountCParser.IdTermContext ctx) {
        SymbolTableEntry entry = new SymbolTableEntry();
        entry.setId(ctx.ID().toString())
        symbolTable.put(keyCount, entry);
    }
}
