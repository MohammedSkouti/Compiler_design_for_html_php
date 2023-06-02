package nodes;
public class doWhileNode extends treeNode {
	public Object execute() {
		do {
			children.get(0).execute();	
		}while((boolean)children.get(1).execute());
		return null;
	}
}
