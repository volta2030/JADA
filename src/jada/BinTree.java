package jada;

public class BinTree {
	TrNode root;
	TrNode tmp_node;
	
	public BinTree(Object data) {
		super();
		root = new TrNode();
		tmp_node = new TrNode();
		root.data = data;
		root.left = tmp_node;
		tmp_node.parent = root;
	}
	
	public void insert(Object data) {
		tmp_node.data = data;
		TrNode tmp_parent_node = tmp_node.parent;
		if(tmp_node.parent.left == null) {
			tmp_parent_node.left = new TrNode();
			tmp_parent_node.parent = tmp_node.parent;
			tmp_node = tmp_parent_node.left;
		}else if(tmp_node.parent.right ==null) {
			tmp_parent_node.right = new TrNode();
			tmp_parent_node.parent = tmp_node.parent;
			tmp_node = tmp_parent_node.right;
		}else {
			tmp_parent_node = tmp_node;
			tmp_node = tmp_node.left;
			tmp_node.parent = tmp_parent_node;
		}
	}
	
	
	public void remove() {
		
	}
	
	public void show() {
		
	}
	
	public void empty() {
		
	}
	
}
