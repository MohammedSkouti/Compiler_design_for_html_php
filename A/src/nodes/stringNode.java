package nodes;
public class stringNode extends treeNode
{
String val;
public stringNode (String v)
{
this.val = v;
}
public stringNode ()
{
}
public void setVal(String v)
{
this.val = v;
}
String x="";
public Object execute()
{
return this.val ;
}
}