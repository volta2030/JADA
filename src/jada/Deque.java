package jada;

public class Deque extends SingleLinkedList {

	public Deque() {
		super();
		head = new Node();
	}
	
	public void insert_front(Object obj) {
		insert(head, obj);
	}
	
	public void insert_back(Object obj) {
		insert(tail, obj);
	}
	
	public void remove_front() {
		remove(target_node(head,1));
	}
	
	public void remove_back() {
		remove(tail);
	}
	
	public void show() {
		if(empty()) {
			return;
		}
		System.out.print("[front] ");
		Node node = head.next;
		Node tmp_node = null;
		
		
		while(node.next !=null) {
			tmp_node = node;
			System.out.print(node.data+"-");
			node = tmp_node.next;
		}
		
		System.out.print(tail.data);
		System.out.println(" [back]");
		return;
	}
	
}
