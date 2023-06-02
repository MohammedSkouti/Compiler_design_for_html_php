package nodes;
public class SwitchNode extends treeNode{
	int i=1;
	public Object execute() {	
	
	double x=(double)children.get(0).execute();
	while( ! children.get(i).execute().equals(null))
	{
		double y=(double)children.get(i).execute();
		if(y==x)
		{
			children.get(i+1).execute();
		}
		i+=2;
	}
		return null;
	}
}