package nodes;

public class condNode extends treeNode{

	public Object execute()
	{
		
		
		double v1 = (double)children.get(0).execute();
		double v2 = (double)children.get(1).execute();
		String v3=(String)children.get(2).execute();
		if(v3.equals(">"))
		{
			return (v1 > v2);
		}
		if(v3.equals("<"))
		{
			return v1 < v2;
		}
		if(v3.equals("=="))
		{
			return (v1 == v2);	
		}
		if(v3.equals(">="))
		{
			return (v1 >= v2);
		}
		if(v3.equals("<="))
		{
			return (v1<=v2);
		}
		if(v3.equals("!="))
		{
			return (v1 != v2);
		}
		return null;
	}
	
}
