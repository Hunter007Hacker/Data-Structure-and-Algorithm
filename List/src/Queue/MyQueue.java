package Queue;



public class MyQueue<E> {
	Node<E> head , rear;
	
	
	public void enqueue(E e) {
		Node<E> toAdd = new Node<>();
		if (head == null) {
			head = rear = toAdd;
			return ;
		}
		
		rear.next = toAdd;
		rear = rear.next;	
				
	}
	
     public E dequeue() {
		
		if (head == null) {
			return null ;
		}
			
		Node<E> temp =  head ;
		head= head.next;
		
		if (head==null) {
			rear = null ;
		}
	    return (E) temp.data ;
		
		
		
	}
  private class Node<E> {
	  E data;
	  Node<E> next ;
  }
	
	
}
