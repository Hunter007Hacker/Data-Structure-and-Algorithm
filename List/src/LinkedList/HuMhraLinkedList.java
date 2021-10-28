package LinkedList;

public class HuMhraLinkedList <E> {
	Node<E> head;
	
	
	public void add(E data) {
		Node<E> toAdd = new Node<>(data);
		
		Node<E> temp = head;
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		
	}
	
	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	boolean isEmpty() {
		return head == null ;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

		
	

}
