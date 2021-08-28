package test;

import jada.*;

public class DequeTest {
	
	public Node front;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque ds = new Deque();
		
		ds.insert_front(1);
		ds.insert_back(2);
		ds.insert_front(3);
		ds.insert_back(4);
		ds.show();
		ds.remove_front();
		ds.remove_back();
		ds.show();
		ds.remove_back();
		ds.show();
		ds.remove_front();
		ds.show();
		
	}

}
