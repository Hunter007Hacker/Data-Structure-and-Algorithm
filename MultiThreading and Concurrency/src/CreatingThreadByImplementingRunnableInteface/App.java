package CreatingThreadByImplementingRunnableInteface;

// MULTIPLE USES OF RUNNABLE CLASS 

import java.util.Random;

// 1 - WE CAN IMPLEMENTS RUNNABLE INTERFACE IN A CLASS THEN MAKE A RUN METHODE AND CREATE A THREAD OUT 
//     OF THE CLASS

class MyCounter implements Runnable{
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	@Override
	public void run() {
		Random random = new Random();
		for(int i=1;i<=9;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("the Value of i is : "+i + " and The Thread number is : " +threadNo);
		}
		
	}
	
}


public class App {

	public static void main(String[] args) throws InterruptedException {
 //		1. this is how we create thread by Runnable interface
	/*	  Thread thread1 = new Thread(new MyCounter(1)); 
		  Thread thread2 = new Thread(new MyCounter(2));
		  thread1.start();
		  thread2.start();
		  */
		
// 3 . OR WE AND MAKE ANONYMOSE OBJECT AND START THE THREAD  		
    /*		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
				
			}
			
		}).start();
		*/
 //2 . ALTERNATILY WE CREATE A OBJECT OF THREAD CLASS AND ALSO DECLAIR AND DEFINE METHODE RIGHT AWAY		
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
				
			}
			
		});
		thread.start();
	}

}
