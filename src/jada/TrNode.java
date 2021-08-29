package jada;

public class TrNode {
	public Object data;
	public TrNode parent;
	public TrNode left;
	public TrNode right;
		
	public TrNode() {
		super();
		this.data = null;
		this.parent = null;
		this.left = null;
		this.right = null;
	};
		
	public TrNode(Object data) {
		super();
		this.data = data;
		this.parent = null;
		this.left = null;
		this.right = null;
	};
}
