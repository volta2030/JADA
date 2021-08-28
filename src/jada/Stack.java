package jada;

public class Stack {
	
	private Object[] space;
	private int size;
	private int top;
	
	public Stack() {
		top = -1;
		space = new Object[10];
	}
	
	public Stack(int size) {
		top = -1;
		this.size = size;
		space = new Object[this.size];
	}
	
	public void push(Object obj) {
		top++;
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
