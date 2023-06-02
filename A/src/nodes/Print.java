package nodes;

public class Print extends treeNode{

	String x;
	public Print(String y)
	{
		x=y;
	}
	public Object execute() {
		System.out.print(" "+x.toString());
		//System.out.println("");
		return null;
	}
	

}
