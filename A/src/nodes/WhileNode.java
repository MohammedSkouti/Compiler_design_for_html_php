package nodes;
public class WhileNode extends treeNode {

	public Object execute() {
		
		
		while((boolean)children.get(0).execute())
		{
			children.get(1).execute();
			
		}
		return null;
	}
}
	
	
	
