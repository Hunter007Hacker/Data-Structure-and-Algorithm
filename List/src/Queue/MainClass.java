package Queue;

public class MainClass {

	public static void main(String[] args) {
		
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(123);
		mq.enqueue(1234);
		
		
		System.out.println(mq);
		
		
		
	
	}

}
