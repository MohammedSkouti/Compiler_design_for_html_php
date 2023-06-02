package nodes;

import java.util.ArrayList;
import java.util.HashMap;

public class FuncNode extends treeNode{

	String s;
	public nodes.blockNode blo;
	public static HashMap<String, String> NameFunc= new HashMap<String, String>();
	ArrayList<String> NameOfVariable =new ArrayList<>();
	public static ArrayList<nodes.blockNode> Lis =new ArrayList<>();
	public static HashMap<String,ArrayList<String>>ss =new HashMap<>(); 
	public FuncNode(nodes.stringNode x,nodes.stringNode y,nodes.blockNode bb)
	{
		this.s=(String)x.execute();
		 NameOfVariable.add((String)y.execute());
		ss.put((String)x.execute(),NameOfVariable);
		this.blo=bb;
		Lis.add(blo);
		
	}
	public Object execute() {
		
		return null;
	}

}
