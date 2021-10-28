package vectorAndStacks;

import LinkedList.MyLinkedList;

public class MyStack<E> {
	
	MyLinkedList <E>  ll = new MyLinkedList<>();
	
	
	void push(E e) {
		
		ll.add(e);
		
	}
	
	E pop () throws Exception {
		
	if (ll.isEmpty()) {
			throw new Exception("cannot remove element from empty stack");
		}
		
		return ll.removeLast();
		
	}
    
	E peek() throws Exception{
		
		
		return ll.getlast();
		
	}
}
