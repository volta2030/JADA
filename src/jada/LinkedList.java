package jada;
/**
 * LINKED LIST
 * 
 * JADA : JAVA Data structure & Algorithm
 * Makes World Better with Engineering - volta2030(GT40)
 * Recent Update : 2021-08-28 
 * 
 * 
 */

class Node{
	
	public Object data;
	public Node next;
	
	public Node() {
		this.data = null;
		this.next = null;
	};
	
	public Node(Object data) {
		this.data = data;
		this.next = null;
	};
	
}

public class LinkedList {
	
	public Node head;
	public Node tail;
	
	public LinkedList() {
		super();
		head = new Node();
	}
	
	public void insert(Node pre_node, Object obj) {
		
		Node node = new Node(obj);
		
		if(pre_node.data==null) { //head has null data
			Node tmp_node = head.next;
			head.next = node;
			if(tmp_node!=null) {
				node.next = tmp_node;	
			}
			
			tail = tmp_node;
			set_tail();
			return;
		}

		Node tmp_node = pre_node.next;
		pre_node.next = node;
		node.next = tmp_node;
		set_tail();
	}
	
	public void remove(Node pre_node) {
		
		if(pre_node.data == null) { //head has null data
			System.out.println("Couldn't remove head");
			return;
		}
		
		Node tmp_node = pre_node.next;
		
		if(tmp_node == null) {
			Node node = set_tail();
			node.next = null;
			set_tail();
			return;
		}
		
		pre_node.next = tmp_node.next;
		tmp_node = null;
		set_tail();
		return;
	}

	public Node target_node(Node pre_node, int idx) {
		Node node = pre_node;
		Node tmp_node;
		for(int i =0; i < idx; i++) {
			tmp_node = node.next;
			node = tmp_node;
		}
		return node;
	}
	
	public void show() {
		System.out.print("[head]->");
		if(head.next == null) {
			System.out.println();
			return;
			}
		Node node = head.next;
		Node tmp_node = null;
		while(node.next !=null) {
			tmp_node = node;
			System.out.print(node.data+"->");
			node = tmp_node.next;
		}
		System.out.println(tail.data);
		return;
	}
	
	private Node set_tail() {
		Node node = head.next;
		Node tmp_node = null;
		while(node.next !=null) {
			tmp_node = node;
			node = tmp_node.next;
		}
		
		tail = node;
		return tmp_node;
	}
}
