import java.util.*;

public class CompilerListener extends MountCBaseListener {

    private Map<String, Integer> symTab = new HashMap<String, Integer>();
    private Map<String, Integer> parameters = new HashMap<String, Integer>();
    int ifIdGenerator = 1;
    int addCounter = 0;
    int ifCounter = 0;
    int ifCounter2 = 0;
    boolean onlyIfBool = false;
    boolean ifEndBool = false;
    int howManyIf = 0;
    String currentID = "";
    ArrayList<String> paramNames = new ArrayList<>();
    boolean inFunCall = false;
    int params = 0;
    int totalNumParams = 0;
    int varOffset = 0;

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

        System.out.println("putchar:\tLDWA\t2,s");
        System.out.println("\tSTBA\tcharOut,d");
        System.out.println("\tSTWA\t4,s");
        System.out.println("\tRET");
        symTab.put("putchar", 1);

        System.out.println("getchar:\tLDWA\t0,i");
        System.out.println("\tLDBA\tcharIn,d");
        System.out.println("\tSTWA\t2,s");
        System.out.println("\tRET");
        symTab.put("getchar", 0);
    }

    @Override
    public void exitProgram(MountCParser.ProgramContext ctx) {
        System.out.println("\t.END");
    }

    @Override
    public void enterFun_def(MountCParser.Fun_defContext ctx) {
        int numKids = ctx.getChild(2).getChildCount();
        int numParams = 0;
        if (numKids != 0) {
            numParams = (((numKids) / 2) + 1);
        } else {
            numParams = 0;
        }

        String id = ctx.ID().toString();

        if (symTab.containsKey(id)) {
            System.err.println("error function is defined");
            System.exit(4);
        } else {
            symTab.put(ctx.ID().toString(), numParams);
        }

        int numBytesToAdd = 2 * (symTab.get(id));

        //System.out.println(numBytesToAdd);

        for (int i = numKids - 1; i >= 0; i -= 2) {
            //System.out.println(i);
            //System.out.println(varOffset);
            parameters.put(id + "_" + ctx.getChild(2).getChild(i).toString(), numBytesToAdd + varOffset);
            paramNames.add(id + "_" + ctx.getChild(2).getChild(i).toString());
            //System.out.println(id + "_" + ctx.getChild(2).getChild(i).toString() + " " + numBytesToAdd);
            numBytesToAdd -= 2;
            totalNumParams += 1;
        }

        System.out.println(ctx.ID().toString() + ":\tNOP0");
        if (!ctx.ID().toString().equals("main")) {
            System.out.println("\tSUBSP\t2,i");
            varOffset += 2;
        }
        currentID = id;

    }

    @Override public void exitFun_def(MountCParser.Fun_defContext ctx) {
        if ((!ctx.ID().toString().equals("main")) && (onlyIfBool == false) && (ifEndBool == false)) {
            System.out.println("\tADDSP\t2,i");
        }
        System.out.println("\tRET");
        //varOffset = 0;
    }

    @Override
    public void enterId_list(MountCParser.Id_listContext ctx) {

    }

    @Override
    public void exitId_list(MountCParser.Id_listContext ctx) {
        //System.out.println("\tSUBSP\t" + 2 + ",i");
    }

    @Override
    public void enterParameter(MountCParser.ParameterContext ctx) {

    }

    @Override
    public void enterNumTerm(MountCParser.NumTermContext ctx) {
        String id = ctx.getParent().getParent().getChild(0).getText().toString();

        if (id.equals("+") || id.equals("-")) {
            /* Do Nothing */
        } else {
            System.out.println("\tLDWA\t" + ctx.NUM() + ",i");
            if (inFunCall && !ctx.getParent().getParent().getParent().getParent().getChild(0).toString().equals("putchar")) {
                //System.out.println("Neg Val");
                System.out.println("\tSTWA\t-" + (parameters.get(paramNames.get(params))) + ",s");
                params += 1;
            }
        }
    }

    @Override
    public void enterAdd(MountCParser.AddContext ctx) {
        addCounter += 1;
        String id = ctx.getChild(1).getChild(0).getText().toString();
        String subCheck = ctx.getChild(0).getChild(0).getText().toString();
        String curNum = ctx.getChild(1).getChild(0).getText().toString();
        boolean useStack = false;
        //System.out.println(id);
        if (parameters.get(paramNames.get(params)) != null) {
            useStack = true;
        }
        if (id.equals("(")) {
            //System.out.println("\tSTWA\t-2,s");
        }
        else if (subCheck.equals("+")){
            if (curNum.contains("getint")) {
                System.out.println("\tSTWA\t-6,s");
            }
            else if (useStack) {
                System.out.println("\tADDA\t" + parameters.get(paramNames.get(params)) + ",s");
            }
            else {
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
                    if (useStack) {
                        System.out.println("\tNEGA\t");
                        System.out.println("\tADDA\t-6,s");
                        System.out.println("\tSUBA\t" + parameters.get(paramNames.get(params)) + ",s");
                    }
                    else {
                        System.out.println("\tNEGA\t");
                        System.out.println("\tADDA\t-6,s");
                        System.out.println("\tSUBA\t" + curNum + ",i");
                    }
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
        if (id.equals("putint") || id.equals("putchar") || id.equals("getint") || id.equals("getchar")) {

        }
        else if (numParams != (((ctx.getChild(1).getChildCount())/2) + 1)) {
           System.err.println("function " + id + " called with wrong number of arguments " + ctx.getChild(1).getChildCount());
           System.exit(2);
        }
        inFunCall = true;
        params = 0;
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
            varOffset += 2;
        }
        else if (id.equals("putint")) {
            System.out.println("\tSTWA\t0,s");
            System.out.println("\tCALL\t" + id);
            int numBytesToPop = 2*(symTab.get(id) + 1);  //  Won't get here if id not in symtab.
            System.out.println("\tADDSP\t" + numBytesToPop + ",i");
            varOffset += 2;
        }
        else if (id.equals("putchar")) {
            System.out.println("\tSTWA\t0,s");
            System.out.println("\tCALL\t" + id);
            int numBytesToPop = 2*(symTab.get(id) + 1);  //  Won't get here if id not in symtab.
            System.out.println("\tADDSP\t" + numBytesToPop + ",i");
            varOffset += 2;
        }
        else if (id.equals("getchar")) {
            System.out.println("\tCALL\t" + id);
            int numBytesToPop = 2*(symTab.get(id) + 1);  //  Won't get here if id not in symtab.
            System.out.println("\tADDSP\t" + numBytesToPop + ",i");
            System.out.println("\tLDWA\t-2,s");
            System.out.println("\tSTWA\t0,s");
            varOffset += 2;
        }
        else {
            System.out.println("\tSUBSP\t" + (parameters.get(paramNames.get(totalNumParams - params)) + 2) + ",i");
            System.out.println("\tCALL\t" + id);
            int numBytesToPop = 2*(symTab.get(id) + 2);  //  Won't get here if id not in symtab.
            System.out.println("\tADDSP\t" + numBytesToPop + ",i");
        }
        inFunCall = false;
        params = 0;
    }

    @Override
    public void enterIfExpr(MountCParser.IfExprContext ctx) {

        if (howManyIf != 0) {
            String key3 = "ifcounter" + (howManyIf - 1);
            int val3 = symTab.get(key3);
            //System.out.println(val3);
            String check = ctx.getParent().getChild(val3).getChild(0).getText().toString();

            int curNum = ((MountCParser.IfExprContext)ctx.getParent()).ifID;
            //System.out.println(check);
            if (check.equals("?")) {
                System.out.println("__" + curNum + ":\tNOP0");
            }
            else if (check.equals(":")) {
                System.out.println("__" + curNum + 10 + ":\tNOP0");
            }
        }

        ctx.ifID = ifIdGenerator;
        ifIdGenerator += 1;
        howManyIf += 2;
        String key1 = "ifcounter" + (howManyIf - 1);
        String key2 = "ifcounter" + (howManyIf);
        //System.out.println(key1);
        //System.out.println(key2);
        symTab.put(key1, 0);
        symTab.put(key2, 0);
        //ifCounter = 0;
        //ifCounter2 = 0;
        //System.out.println("");
    }

    @Override
    public void exitIfExpr(MountCParser.IfExprContext ctx) {
        int curNum = ctx.ifID;
        howManyIf -= 1;
        //ifCounter = 0;
        //ifCounter2 = 0;
        if (curNum != 1) {
            System.out.println("___" + curNum + ":\tBR\t___" + (curNum - 1));
            System.out.println("\tSTWA\t2,s");
        } else {
            System.out.println("___" + curNum + ":\tSTWA\t2,s");
        }


        int onlyIf = ctx.getParent().getChild(1).getChildCount();
        //System.out.println(onlyIf);
        if (onlyIf == 0) {
            onlyIfBool = true;
        }
        String ifEnd = ctx.getParent().getClass().toString();
        //System.out.println(ifEnd);
        if (ifEnd.contains("Expr_list_tail")) {
            ifEndBool = true;
        }
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

        String key1 = "ifcounter" + (howManyIf - 1);
        String key2 = "ifcounter" + (howManyIf);
        int val1 = symTab.get(key1) + 1;
        int val2 = symTab.get(key2) + 1;
        symTab.put(key1, val1);
        symTab.put(key2, val2);

        //ifCounter += 1;
        //ifCounter2 += 1;
    }

    @Override
    public void enterIdTerm(MountCParser.IdTermContext ctx) {
        String id = ctx.getParent().getParent().getParent().getParent().getParent().getChild(0).getText().toString();
        String compare = "putchar";
        boolean loadId = id.regionMatches(true, 0, compare, 0, compare.length());
        //System.out.println(ctx.getChild(0).toString());
        if (parameters.containsKey(currentID + "_" + ctx.getChild(0).toString())) {
            try {
                if (!ctx.getChild(1).getChild(0).getText().toString().equals("=")) {
                    int location = parameters.get(currentID + "_" + ctx.getChild(0).toString());
                    System.out.println("\tLDWA\t" + (location - varOffset) + ",s");
                }
            } catch (Exception ex) {
                int location = parameters.get(currentID + "_" + ctx.getChild(0).toString());
                System.out.println("\tLDWA\t" + (location - varOffset - 2) + ",s");
            }
        }
        if (loadId) {
            System.out.println("\tLDWA\t'" + ctx.ID() + "',i");
        }

	}

    @Override
    public void enterMathExpr(MountCParser.MathExprContext ctx) {
        //System.out.println(ifCounter + "," + ifCounter2);
        if (ctx.getParent().getClass().toString().contains("IfExprContext")) {



            String key3 = "ifcounter" + (howManyIf - 1);
            int val3 = symTab.get(key3);
            String check = ctx.getParent().getChild(val3).getChild(0).getText().toString();


            int curNum = ((MountCParser.IfExprContext)ctx.getParent()).ifID;
            //System.out.println(check);
            if (check.equals("?")) {
                System.out.println("__" + curNum + ":\tNOP0");
            }
            else if (check.equals(":")) {
                System.out.println("__" + curNum + 10 + ":\tNOP0");
            }


        }
    }

    @Override
    public void exitMathExpr(MountCParser.MathExprContext ctx) {



        if (ctx.getParent().getClass().toString().contains("IfExprContext")) {
            String key3 = "ifcounter" + (howManyIf - 1);
            int val3 = symTab.get(key3);
            String check = ctx.getParent().getChild(val3).getChild(0).getText().toString();
            int curNum = ((MountCParser.IfExprContext)ctx.getParent()).ifID;
            if (check.equals("?") || check.equals(":")) {
                System.out.println("\tBR\t___" + curNum);
            }
            String key1 = "ifcounter" + (howManyIf - 1);
            int val1 = symTab.get(key1) + 1;
            symTab.put(key1, val1);
            String key2 = "ifcounter" + (howManyIf);
            int val2 = symTab.get(key2) + 1;
            symTab.put(key2, val2);
            //System.out.println(symTab.get(key2));
            //ifCounter2 += 1;
            //ifCounter += 1;
        }
    }

    @Override
    public void enterTermExpr(MountCParser.TermExprContext ctx) {

            if (ctx.getParent().getClass().toString().contains("IfExprContext")) {

                        String id = ctx.getChild(0).getChild(0).getText().toString();
                        String key3 = "ifcounter" + (howManyIf);
                        int val3 = symTab.get(key3);
                if (id.equals("putint") || id.equals("getint") || id.equals("putchar") || id.equals("getchar")) {
                    //System.out.println(ifCounter2);
                    String check = ctx.getParent().getChild(val3).getChild(0).getText().toString();
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

            if (ctx.getParent().getClass().toString().contains("IfExprContext")) {
                String id = ctx.getChild(0).getChild(0).getText().toString();
                String key3 = "ifcounter" + (howManyIf);
                int val3 = symTab.get(key3);
                if (id.equals("putint") || id.equals("getint") || id.equals("putchar") || id.equals("getchar")) {
                    String check = ctx.getParent().getChild(val3).getChild(0).getText().toString();
                    //System.out.println(check);
                    int curNum = ((MountCParser.IfExprContext)ctx.getParent()).ifID;
                    if (check.equals("?") || check.equals(":")) {
                        System.out.println("\tBR\t___" + curNum);
                    }
                    //ifCounter2 += 1;

                    String key2 = "ifcounter" + (howManyIf);
                    int val2 = symTab.get(key2) + 1;
                    symTab.put(key2, val2);
                }
            } else {
                //Do Nothing
            }
    }

    @Override
    public void exitVarAssign(MountCParser.VarAssignContext ctx) {
        if (parameters.containsKey(currentID + "_" + ctx.getParent().getChild(0).toString())) {
            int location = parameters.get(currentID + "_" + ctx.getParent().getChild(0).toString());
            //System.out.println(currentID + "_" + ctx.getParent().getChild(0).toString() + " " + location);
            System.out.println("\tSTWA\t" + (location + varOffset + 2) + ",s");
        }
    }

}
