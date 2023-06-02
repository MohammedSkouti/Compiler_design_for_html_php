package nodes;

public class ifNode extends treeNode {

	public Object execute()
	{
		if((boolean)children.get(0).execute())
		{
			children.get(1).execute();
		}
		return null;
		
	}
	
}


