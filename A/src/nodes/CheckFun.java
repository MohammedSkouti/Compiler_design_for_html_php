package nodes;

public class CheckFun extends treeNode{

	String x;
	public CheckFun(String y)
	{
		this.x=y;
	}
	public Object execute() {
		boolean b=FuncNode.ss.containsKey(x);
		if(b==false)
		{
			System.out.println("the Function Name is not Exitst");
		}
		else
		{
			System.out.println("the function name is "+nodes.FuncNode.ss.keySet()+" and the parameter is "+nodes.FuncNode.ss.values());
			return nodes.FuncNode.ss.get(x);
		}
		return null;
	}

}
