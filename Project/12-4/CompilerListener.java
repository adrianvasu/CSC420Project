import java.util.*;

public class CompilerListener extends MountCBaseListener {

    private Map<String, Integer> symTab = new HashMap<String, Integer>();
    int ifIdGenerator = 1;
    int addCounter = 0;
    int ifCounter = 0;
    int ifCounter2 = 0;

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
        symTab.put("putint", 1);
        System.out.println("getint:\tDECI\t2,s");
        System.out.println("\tRET");
        symTab.put("getint", 0);
    }

    @Override
    public void exitProgram(MountCParser.ProgramContext ctx) {
        System.out.println("\t.END");
    }

    @Override
    public void enterFun_def(MountCParser.Fun_defContext ctx) {
        System.out.println(ctx.ID().toString() + ":\tNOP0");
        symTab.put(ctx.ID().toString(), 1);
    }

    @Override public void exitFun_def(MountCParser.Fun_defContext ctx) {
        System.out.println("\tRET");
    }

    @Override
    public void enterId_list(MountCParser.Id_listContext ctx) {
        //System.out.println(ctx.ID().toString() + ":\t.EQUATE\t0");
    }

    @Override
    public void exitId_list(MountCParser.Id_listContext ctx) {
        //System.out.println("\tSUBSP\t" + 2 + ",i");
    }

    @Override
    public void enterParameter(MountCParser.ParameterContext ctx) {
        System.out.println(ctx.getParent().getChild(0).toString() + ":\t.EQUATE\t0");
        if(ctx.getChild(0) == null) {
            System.out.println(ctx.getParent().getChild(1).toString() + ":\t.EQUATE\t0");
        }
        //symTab.put();
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
        addCounter += 1;
        String id = ctx.getChild(1).getChild(0).getText().toString();
        String subCheck = ctx.getChild(0).getChild(0).getText().toString();
        String curNum = ctx.getChild(1).getChild(0).getText().toString();
        //System.out.println(id);
        if (id.equals("(")) {
            //System.out.println("\tSTWA\t-2,s");
        }
        else if (subCheck.equals("+")){
            if (curNum.contains("getint")) {
                System.out.println("\tSTWA\t-6,s");
            } else {
                System.out.println("\tADDA\t" + curNum + ",i");
            }
        }
        else if (subCheck.equals("-")){
            if (curNum.contains("getint")) {
                System.out.println("\tSTWA\t-6,s");
            }
            else if (ctx.getParent().getParent().getClass().toString().contains("AddContext")){
                if(subCheck.equals("+")){
                    System.out.println("\tADDA\t0,s");
                }
                else if (subCheck.equals("-")) {
                    System.out.println("\tNEGA\t");
                    System.out.println("\tADDA\t-6,s");
                    System.out.println("\tSUBA\t" + curNum + ",i");
                }
            } else {
                System.out.println("\tSUBA\t" + curNum + ",i");
            }
        }

    }

    @Override
    public void exitAdd(MountCParser.AddContext ctx) {
        String id = ctx.getChild(1).getChild(0).getText().toString();
        String subCheck = ctx.getChild(0).getChild(0).getText().toString();
        String curNum = ctx.getParent().getChild(0).getChild(0).getText().toString();
        String getCheck = ctx.getChild(1).getChild(0).getText().toString();
        if(id.equals("(")){
            if(subCheck.equals("+")){
                System.out.println("\tADDA\t" + curNum + ",i");
            }
            else if (subCheck.equals("-")) {
                System.out.println("\tNEGA\t");
                System.out.println("\tADDA\t" + curNum + ",i");
            }
        }
        else if (getCheck.contains("getint") && ctx.getChild(1).getChild(1).getChildCount() == 0) {
            if(subCheck.equals("+")){
                System.out.println("\tADDA\t" + curNum + ",i");
            }
            else if (subCheck.equals("-")) {
                System.out.println("\tNEGA\t");
                System.out.println("\tADDA\t" + curNum + ",i");
            }
        }
    }

    @Override
    public void exitIdTerm(MountCParser.IdTermContext ctx) {
        //System.out.println("\tCALL\t" + ctx.ID().toString());
    }

    @Override
    public void enterFunCall(MountCParser.FunCallContext ctx) {
        String id = ctx.getParent().getChild(0).toString();
        Integer numParams = symTab.get(id);
        if (numParams == null) {
           System.err.println("function " + id + " not defined at this point");
           System.exit(1);
        }
        if (numParams != ctx.getChild(1).getChildCount()) {
           System.err.println("function " + id + " called with wrong number of arguments" + ctx.getChild(1).getChildCount());
           System.exit(2);
       }
        System.out.println("\tSUBSP\t2,i");
    }

    @Override
    public void exitFunCall(MountCParser.FunCallContext ctx) {
        String id = ctx.getParent().getChild(0).toString();
        if (id.equals("getint")) {
            System.out.println("\tCALL\t" + id);
            int numBytesToPop = 2*(symTab.get(id) + 1);  //  Won't get here if id not in symtab.
            System.out.println("\tADDSP\t" + numBytesToPop + ",i");
            System.out.println("\tLDWA\t-2,s");
            System.out.println("\tSTWA\t0,s");
        }
        else if (id.equals("putint")) {
            System.out.println("\tSTWA\t0,s");
            System.out.println("\tCALL\t" + id);
            int numBytesToPop = 2*(symTab.get(id) + 1);  //  Won't get here if id not in symtab.
            System.out.println("\tADDSP\t" + numBytesToPop + ",i");
        }
        else {
            System.out.println("\tCALL\t" + id);
            int numBytesToPop = 2*(symTab.get(id) + 1);  //  Won't get here if id not in symtab.
            System.out.println("\tADDSP\t" + numBytesToPop + ",i");
        }
    }

    @Override
    public void enterIfExpr(MountCParser.IfExprContext ctx) {
        ctx.ifID = ifIdGenerator;
        ifIdGenerator += 1;
        //System.out.println("");
    }

    @Override
    public void exitIfExpr(MountCParser.IfExprContext ctx) {
        int curNum = ctx.ifID;
        System.out.println("___" + curNum + ":\tSTWA\t2,s");
    }

    @Override
    public void enterThenPart(MountCParser.ThenPartContext ctx) {
        System.out.println("\tCPWA\t0,i");
        System.out.println("\tBRNE\t__" + ((MountCParser.IfExprContext)ctx.getParent()).ifID);
        System.out.println("\tBR\t__" + ((MountCParser.IfExprContext)ctx.getParent()).ifID + 10);
    }

    @Override
    public void exitThenPart(MountCParser.ThenPartContext ctx) {

    }

    @Override
    public void exitElsePart(MountCParser.ElsePartContext ctx) {
        ifCounter += 1;
        ifCounter2 += 1;
    }

    @Override
    public void enterIdTerm(MountCParser.IdTermContext ctx) {

	}

    @Override
    public void enterMathExpr(MountCParser.MathExprContext ctx) {
        String check = ctx.getParent().getChild(ifCounter).getChild(0).getText().toString();
        int curNum = ((MountCParser.IfExprContext)ctx.getParent()).ifID;
        //System.out.println(check);
        if (check.equals("?")) {
            System.out.println("__" + curNum + ":\tNOP0");
        }
        else if (check.equals(":")) {
            System.out.println("__" + curNum + 10 + ":\tNOP0");
        }
    }

    @Override
    public void exitMathExpr(MountCParser.MathExprContext ctx) {
        String check = ctx.getParent().getChild(ifCounter).getChild(0).getText().toString();
        int curNum = ((MountCParser.IfExprContext)ctx.getParent()).ifID;
        if (check.equals("?") || check.equals(":")) {
            System.out.println("\tBR\t___" + curNum);
        }
        ifCounter2 += 1;
        ifCounter += 1;
    }

    @Override
    public void enterTermExpr(MountCParser.TermExprContext ctx) {
        String id = ctx.getChild(0).getChild(0).getText().toString();
        if (ctx.getParent().getClass().toString().contains("IfExprContext")) {
            if (id.equals("putint") || id.equals("getint")) {
                String check = ctx.getParent().getChild(ifCounter2).getChild(0).getText().toString();

                //System.out.println(check);
                int curNum = ((MountCParser.IfExprContext)ctx.getParent()).ifID;
                if (check.equals("?")) {
                    System.out.println("__" + curNum + ":\tNOP0");
                }
                else if (check.equals(":")) {
                    System.out.println("__" + curNum + 10 + ":\tNOP0");
                }
            }
        } else {
            //Do Nothing
        }
    }

    @Override
    public void exitTermExpr(MountCParser.TermExprContext ctx) {
        //System.out.println(ifCounter2);
        String id = ctx.getChild(0).getChild(0).getText().toString();
        if (ctx.getParent().getClass().toString().contains("IfExprContext")) {
            if (id.equals("putint") || id.equals("getint")) {
                String check = ctx.getParent().getChild(ifCounter2).getChild(0).getText().toString();
                //System.out.println(check);
                int curNum = ((MountCParser.IfExprContext)ctx.getParent()).ifID;
                if (check.equals("?") || check.equals(":")) {
                    System.out.println("\tBR\t___" + curNum);
                }
                ifCounter2 += 1;
            }
        } else {
            //Do Nothing
        }
    }
}
