package test;

/**
* 
* JADA : JAVA Data structure & Algorithm
* Makes World Better with Engineering - volta2030(GT40)
* Recent Update : 2021-08-29
* 
* 
*/

import jada.*;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLinkList ds = new DLinkList();
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
