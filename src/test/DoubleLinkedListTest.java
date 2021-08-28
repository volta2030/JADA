package test;

import jada.*;

public class DoubleLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList ds = new DoubleLinkedList();
		ds.insert(ds.head, 1);
		ds.insert(ds.head, 2);
		ds.insert(ds.head, 3);
		ds.insert(ds.head, 4);
		ds.insert(ds.target_node(ds.head, 2), 5);
		ds.show();
		ds.remove(ds.tail);
		ds.show();
		ds.remove(ds.target_node(ds.head, 2));
		ds.show();

	}

}
