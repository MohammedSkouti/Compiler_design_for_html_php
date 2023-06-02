package nodes;
import java.util.HashMap;

public class assignNode extends treeNode {

	public static HashMap<String, Double> MapOfDouble = new HashMap<String, Double>();
	public static HashMap<String, String> MapOfString = new HashMap<String, String>();
    public Object execute() {
    	
    	
    	String CheckName=(String)children.get(0).execute();
    	String VarName=(String)children.get(1).execute();
    	if(MapOfDouble.containsKey(VarName)==true || MapOfString.containsKey(VarName)==true)
    	{
    		System.out.println("The Variable Name is Used");
    	}
    	else if(CheckName.equals("int") )
    		{
    			Object xx=children.get(2).execute();
    			if(xx instanceof Double || xx instanceof Integer)
    			{
    				Double VarVlaue=(double)children.get(2).execute();
        			MapOfDouble.put(VarName, VarVlaue);
    			}
    			else
    			{
    				System.out.println("The Type is different");
    			}
    			
    			
    		}
    	else if(CheckName.equals("string"))
    	{
    		String VarValue=(String)children.get(2).execute();
    		MapOfString.put(VarName, VarValue);
    		System.out.println("the value of string is  "+MapOfString.get(VarName));
    		}
    	else
    	{
    		System.out.println("Error Type");
    	}
        return null;
    }

}
