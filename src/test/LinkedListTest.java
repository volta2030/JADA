package test;

import jada.*;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList ds = new LinkedList();
			ds.show();
			ds.insert(ds.target_node(ds.head,0), 1);
			ds.insert(ds.target_node(ds.head,0), 2);
			ds.insert(ds.target_node(ds.head,0), 3);
			ds.insert(ds.target_node(ds.head,0), 4);
			ds.remove(ds.tail);
			ds.show();
			ds.insert(ds.head, 5);
			ds.insert(ds.head, 6);
			ds.remove(ds.head);
			ds.insert(ds.head, 8);
			ds.insert(ds.target_node(ds.head, 2), "hello");
			ds.remove(ds.target_node(ds.head, 3));
			ds.show();
		
	}

}
