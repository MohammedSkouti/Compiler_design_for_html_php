package nodes;
public class ForNode extends treeNode{
	public Object execute() {
		double x = (double)children.get(0).execute();
		double y=(double)children.get(1).execute();
		String s=(String)children.get(3).execute();
		if(s.equals(">"))
		{
			for(double a=x;a>y;a--)
			{
				children.get(2).execute();
			}	
		}
		else
		{
		for(double a=x;a<y;a++)
		{
			children.get(2).execute();
		}
		}
		return x;
	}
}