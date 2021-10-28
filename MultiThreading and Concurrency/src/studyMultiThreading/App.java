package studyMultiThreading;

// CREATING THREAD USING THREAD CLASS EXTENDS IN A CLASS  

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	
	@Override
	public void run() {
		countMe();
	}


	public void countMe() {
		long startTime= System.currentTimeMillis();
		for(int i=1;i<=9 ;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("the Value of i is : "+i + " and The Thread number is : " +threadNo);
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Total time required : " + (endTime - startTime));
	}
	
}


public class App {

	public static void main(String[] args) throws InterruptedException {
		MyCounter obj1 = new MyCounter(1);
		MyCounter obj2 = new MyCounter(2);
      
		long startTime= System.currentTimeMillis();
		
		obj1.start();
		System.out.println("************************");
		obj2.start();
		
	    Thread.sleep(500);
		
		
		long endTime = System.currentTimeMillis();
		
	
		System.out.println("Total time required : " + (endTime - startTime));

	}

}
