package nodes;
public class ExeFunc extends treeNode {

	nodes.CheckFun a;
	public ExeFunc(nodes.CheckFun x)
	{
		this.a=x;
	}
	public Object execute() {
		Object ww;
		for(int i=0;i<nodes.FuncNode.Lis.size();i++)
		{
			ww=nodes.FuncNode.Lis.get(i).execute();
			System.out.println("this is execute of blocknode");
			System.out.println(ww.toString());
		}
		
		a.execute();
		System.out.println("execute of a is "+a.execute());
		return null;
	}
	

}
