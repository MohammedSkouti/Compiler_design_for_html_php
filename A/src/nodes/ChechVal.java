package nodes;
public class ChechVal  extends treeNode{
	String v;
	public ChechVal(String val)
	{
		this.v=val;
	}
	public Object execute()
	{
		boolean c=nodes.assignNode.MapOfDouble.containsKey(v);
		boolean a=nodes.assignNode.MapOfString.containsKey(v);
		if(c==false && a==true)
		{
			return (String)nodes.assignNode.MapOfString.get(v);
		}
		else if(c==true && a==false)
		{
			return (double)nodes.assignNode.MapOfDouble.get(v);
		}
		else
		{

			System.out.println("the Variavle is not exists");
			return null;
			
		}
	}

}
