package StackUsingArray;

public class Mystack {
	 int size;
	int stack[] ;
	int top ;
	Mystack(int size ){
		this.size =size;
		this.stack = new int[size];
		top =-1 ;
	}
	
	void push(int element) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			top++;
			stack[top]=element;
			System.out.print(element +" ");
		}
	}
	
	int pop() {
		
		if(top ==-1) {
			System.out.println("stack is empty") ; 
			return -1;
		}else {
			int delElement = stack[top];
			top--;
			return delElement ; 
		}
	}
	
	void peek() {
		if(top==-1)
			System.out.println("stack is empty");
		else {
			System.out.print(stack[top]);
		}
	}
	
	void print(Mystack stack) {
		for(int i=0;i<size ;i++) {
			System.out.print(stack+ " ");
		}
	}
	
	boolean isFull() {
		if(top == size-1)
			return true;
		return false;
	}

}
