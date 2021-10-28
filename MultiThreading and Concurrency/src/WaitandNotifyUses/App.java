package WaitandNotifyUses;

public class App {
	static public int balance ;
	
	public void withdrawl(int amount) {
		synchronized(this) {
		if(balance <= 0) {
		try {
			System.out.println("Waiting for balance updation");
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		balance = balance - amount ;
		System.out.println("Withdrawl successfully and remaining balance is :" +balance);
	}
	public void deposite(int amount) {
		System.out.println("we are depositing money");
		balance = balance  + amount ;
      synchronized (this) {

  		notify();
	}
	}
	

	public static void main(String[] args) {
		App app = new App();
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.withdrawl(1000);
				
			}
			
			
		});
		thread1.setName("Thread1");
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app.deposite(4000);
				
			}
			
		});
		thread2.start();
		

	}

}
