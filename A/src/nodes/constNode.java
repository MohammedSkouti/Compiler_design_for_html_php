package nodes;
public class constNode extends treeNode
{
String val;
public constNode(String v)
{
this.val = v;
}
public constNode()
{
}
public void setVal(String v)
{}
public Object execute()
{
	
	double res = Double.parseDouble(this.val);// transfer t.image into double
	return res ;
}
}