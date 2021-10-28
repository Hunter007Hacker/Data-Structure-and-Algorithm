package SynchronizationUnderConcurrency;

public class Data {
	public static int COUNTER = 0;

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
					Data.COUNTER++;
				}
				System.out.println("Thread1 is done");
				
			}	
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
					Data.COUNTER++;
				}
				System.out.println("Thread2 is done");
				
			}	
		});
		thread1.start();
		thread2.start();
		Thread.sleep(100);
		System.out.println(Data.COUNTER);

	}

}
