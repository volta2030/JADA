package jada;

public class Node {

	public Object data;
	public Node next;
	public Node prev;
		
	public Node() {
		this.prev = null;
		this.data = null;
		this.next = null;
	};
		
	public Node(Object data) {
		this.prev = null;
		this.data = data;
		this.next = null;
	};
		
	
}
