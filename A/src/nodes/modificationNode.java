package nodes;

public class modificationNode extends treeNode {

    public Object execute() {
        String varName = (String) children.get(0).execute();
        String op = (String) children.get(1).execute();
        double varValue;
        System.out.println("the first value of var"+assignNode.MapOfDouble.get(varName));
        	if ((assignNode.MapOfDouble.get(varName) != null))
        	{
            varValue = (double) assignNode.MapOfDouble.get(varName);
            if (op.equalsIgnoreCase("++")) 
            {
            	varValue=varValue+1;
            } 
            if (op.equalsIgnoreCase("--")) 
            {
            	varValue--;
            }
             if(op.equalsIgnoreCase("+="))
            {
            	double AdvanceInc=(double)children.get(2).execute();
            	varValue=varValue+AdvanceInc;
            }
            if(op.equalsIgnoreCase("-="))
            {
            		double AdvanceInc=(double)children.get(2).execute();
            			varValue=varValue-AdvanceInc;
            }
            assignNode.MapOfDouble.put(varName, varValue);
        } 
        else 
        {
            System.out.print("Error variable is not edfined\n");
        }

        System.out.println("the last value of var " + assignNode.MapOfDouble.get(varName)+"\n");
        return null;
    }
}