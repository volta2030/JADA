package jada;
/**
 * NODE
 * 
 * JADA : JAVA Data structure & Algorithm
 * Makes World Better with Engineering - volta2030(GT40)
 * Recent Update : 2021-08-29
 * 
 * 
 */
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
