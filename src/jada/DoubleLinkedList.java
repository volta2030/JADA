package jada;


import jada.*;

public class DoubleLinkedList {
	
	public Node head;
	public Node tail;
	
	public DoubleLinkedList() {
		super();
		head = new Node();
	}
	
	public void insert(Node pre_node, Object obj) {
		
		Node node = new Node(obj);
		
		if(pre_node.data==null) { //head has null data
			Node tmp_node = head.next;
			head.next = node;
			node.prev = head;
			if(tmp_node!=null) {
				node.next = tmp_node;
				tmp_node.prev = node;
			}
			tmp_node = null;
			set_tail();
			return;
		}

		Node tmp_node = pre_node.next;
		pre_node.next = node;
		node.prev = pre_node.prev;
		node.next = tmp_node;
		tmp_node.prev = node;
		tmp_node = null;
		set_tail();
	}
	
	public void remove(Node pre_node) {
		
		if(pre_node.data == null) { //head has null data
			System.out.println("Couldn't remove head");
			return;
		}
		
		Node tmp_node = pre_node.next;
		Node node = before_remove(pre_node);
		
		if(tmp_node == null) {
			node.next = null;
			tmp_node = null;
			set_tail();
			return;
		}
		
		node.next = tmp_node;
		tmp_node.prev = node;
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
		System.out.print("[head]<->");
		if(head.next == null) {
			System.out.println();
			return;
			}
		Node node = head.next;
		Node tmp_node = null;
		while(node.next !=null) {
			tmp_node = node;
			System.out.print(node.data+"<->");
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

	private Node before_remove(Node pre_node) {
		Node node = head.next;
		Node tmp_node = node;
		while(node!=pre_node){
			tmp_node = node;
			node = tmp_node.next;	
		}
		node = null;
		return tmp_node;
	}
}
