package jada;

/**
 * STACK
 * 
 * JADA : JAVA Data structure & Algorithm
 * Makes World Better with Engineering - volta2030(GT40)
 * Recent Update : 2021-08-28 
 * 
 * 
 */

public class Stack {
	
	private Object[] space;
	private int size;
	private int top;
	
	public Stack() {
		super();
		top = -1;
		this.size = 10;
		space = new Object[this.size];
	}
	
	public Stack(int size) {
		super();
		top = -1;
		this.size = size;
		space = new Object[this.size];
	}
	
	public void push(Object obj) {
		
		top++;
		if(size == top) {
			Object[] space_copy = space.clone();
			space = new Object[top+1];
			for(int i = 0; i < top; i++) {
				space[i] = space_copy[i];
			}
		}
			
		space[top] = obj;
	}
	
	public void pop() {
		if(empty()) {
			return;
		}
		space[top] = null;
		top--;
	}
	
	public boolean empty() {
		if(top == -1) {
			System.out.println("stack is empty");
			return true;	
		}else {
			return false;
		}
	}
	
	public void top() {
		if(empty()) {
			return;
		}
		System.out.println(space[top]);
	}
	
}
