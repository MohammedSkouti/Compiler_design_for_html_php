package nodes;

public class blockNode extends treeNode{

	public Object execute()
	{
		
          
          
            for (treeNode  c : children )
            {
                c.execute();
            }
		return null;
		
	}
}
