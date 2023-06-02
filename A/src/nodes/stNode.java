package nodes;

public class stNode extends treeNode{

	public  Object execute() {
			
			if(children.get(0).execute() instanceof Double)
			{
				double x=(double)children.get(0).execute();
				double w=(double)x;
				System.out.println("from final executes  this is value is  "+w);
			}
			else
			{
				System.out.println(" "+children.get(0).execute()+" "); 
			}
		return null;	
	}
}
