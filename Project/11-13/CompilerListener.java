import java.util.*;

public class CompilerListener extends MountCBaseListener {

    private Map<String, Integer> symbolTable = new HashMap<String, Integer>();

    @Override
    public void enterProgram(MountCParser.ProgramContext ctx) {
        System.out.println("\tSUBSP\t2,i");
        System.out.println("\tCALL\tmain");
        System.out.println("\tADDSP\t2,i");
        System.out.println("\tSTOP");
        System.out.println("putint:\tDECO\t2,s");
        System.out.println("\tLDWA\t2,s");
        System.out.println("\tSTWA\t4,s");  //  return the same value we printed out.
        System.out.println("\tRET");
        symbolTable.put("putint", 1);
        System.out.println("getint:\tDECI\t2,s");
        System.out.println("\tRET");
        symbolTable.put("getint", 0);
    }

    @Override
    public void exitProgram(MountCParser.ProgramContext ctx) {
        System.out.println("\t.END");
    }

    @Override
    public void enterFun_def(MountCParser.Fun_defContext ctx) {
        System.out.println(ctx.ID().toString() + ":\tNOP0");
        symbolTable.put(ctx.ID().toString(), 1);
    }

    @Override public void exitFun_def(MountCParser.Fun_defContext ctx) {
        System.out.println("\tSTWA\t2,s");
        System.out.println("\tRET");
    }

    @Override
    public void enterId_list(MountCParser.Id_listContext ctx) {
        //System.out.println(ctx.ID().toString() + ":\t.EQUATE\t0");
    }

    @Override
    public void exitId_list(MountCParser.Id_listContext ctx) {
        System.out.println("\tSUBSP\t" + 2 + ",i");
    }

    @Override
    public void enterParameter(MountCParser.ParameterContext ctx) {
        System.out.println(ctx.getParent().getChild(0).toString() + ":\t.EQUATE\t0");
        if(ctx.getChild(0) == null) {
            System.out.println(ctx.getParent().getChild(1).toString() + ":\t.EQUATE\t0");
        }
        //symbolTable.put();
    }

    @Override
    public void enterNumTerm(MountCParser.NumTermContext ctx) {
        String id = ctx.getParent().getParent().getChild(0).getText().toString();
        if (id.equals("+") || id.equals("-")) {
            /* Do Nothing */
        } else {
            System.out.println("\tLDWA\t" + ctx.NUM() + ",i");
        }
    }

    @Override
    public void enterAdd(MountCParser.AddContext ctx) {
        System.out.println("\tADDA\t" + ctx.getChild(1).getChild(0).getText().toString() + ",i");
    }

    @Override
    public void exitIdTerm(MountCParser.IdTermContext ctx) {
        //System.out.println("\tCALL\t" + ctx.ID().toString());
    }

    @Override
    public void enterFunCall(MountCParser.FunCallContext ctx) {
        String id = ctx.getParent().getChild(0).toString();
        Integer numParams = symbolTable.get(id);
        /*if (numParams == null) {
           System.err.println("function " + id + " not defined at this point");
           System.exit(1);
        }
        if (numParams != ctx.getChild(1).getChildCount()) {
           System.err.println("function " + id + " called with wrong number of arguments" + ctx.getChild(1).getChildCount());
           System.exit(2);
       } */
        System.out.println("\tSUBSP\t2,i");
    }

    @Override
    public void exitFunCall(MountCParser.FunCallContext ctx) {
        String id = ctx.getParent().getChild(0).toString();
        System.out.println("\tCALL\t" + id);
        int numBytesToPop = 2*(symbolTable.get(id) + 1);  //  Won't get here if id not in symtab.
        System.out.println("\tADDSP\t" + numBytesToPop + ",i");
        if (id.equals("getint")) {
            System.out.println("\tLDWA\t-2,s");
            System.out.println("\tSTWA\t0,s");
        }
    }

    @Override
    public void enterIdTerm(MountCParser.IdTermContext ctx) {

	}
}
