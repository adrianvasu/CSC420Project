import java.util.*;

public class CompilerListener extends MountCBaseListener {

    private Map<String, SymbolTableEntry> symbolTable = new HashMap<String, SymbolTableEntry>();
    private String currentKey = null;
    private String funKey = null;
    private int numParams = 0;

    @Override
    public void enterProgram(MountCParser.ProgramContext ctx) {
        System.out.println("\tSUBSP\t2,i");
        System.out.println("\tCALL\tmain");
        System.out.println("\tADDSP\t2,i");
        System.out.println("\tSTOP");
    }

    @Override
    public void exitProgram(MountCParser.ProgramContext ctx) {
        System.out.println("getint:\tNOP0");
        System.out.println("\tRET");
        System.out.println("\t.END");
    }

    @Override
    public void enterFun_def(MountCParser.Fun_defContext ctx) {
        System.out.println(ctx.ID().toString() + ":\tNOP0");
        funKey = ctx.ID().toString();
    }

    @Override public void exitFun_def(MountCParser.Fun_defContext ctx) {
        System.out.println("\tADDSP\t" + 2*numParams + ",i");
        System.out.println("\tLDWA\t0,i");
        System.out.println("\tSTWA\t2,s");
        System.out.println("\tRET");
        numParams = 0;
    }

    @Override
    public void enterId_list(MountCParser.Id_listContext ctx) {
        numParams += 1;
        if (ctx.ID() == null) {
	    if(ctx.getParent().getChild(0).getText().equals(funKey)){
	    } else {
		System.out.println("ERROR YOUR PARAMETER IS NOT DEFINED");
            	System.exit(0);
	    }
        } else if(!(ctx.getParent().getChild(0).getText().equals(funKey))) {
            System.out.println(ctx.ID().toString() + ":\t.EQUATE\t0");
        }
    }

    @Override
    public void exitId_list(MountCParser.Id_listContext ctx) {
        System.out.println("\tSUBSP\t" + 2*numParams + ",i");
    }

    @Override
    public void enterParameter(MountCParser.ParameterContext ctx) {
        System.out.println(ctx.ID().toString() + ":\t.EQUATE\t0");
        numParams += 1;
    }

    @Override
    public void enterNumTerm(MountCParser.NumTermContext ctx) {
        System.out.println("\tLDWA\t" + ctx.NUM() + ",i");
    }

    @Override
    public void exitIdTerm(MountCParser.IdTermContext ctx) {
        //System.out.println("\tCALL\t" + ctx.ID().toString());
    }

    @Override
    public void exitFunCall(MountCParser.FunCallContext ctx) {
        
            System.out.println("\tCALL\t" + ctx.getParent().getChild(0).getText()/*getParent().getChild(0).ID()*/);
    }

    @Override
    public void enterIdTerm(MountCParser.IdTermContext ctx) {
	
	}
}
