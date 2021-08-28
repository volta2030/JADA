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

public class SingleLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SingleLinkedList ds = new SingleLinkedList();
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
			ds.show();
			ds.insert(ds.target_node(ds.head, 2), "hello");
			ds.show();
			ds.remove(ds.target_node(ds.head, 3));
			ds.remove(ds.tail);
			ds.show();
		
	}

}
