package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Threadd extends Thread{
	public String name ;
	
	

	public Threadd(String name) {
		this.name = name;
	}



	@Override
	public void run() {
		System.out.println("Starting Thread:" + name );
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread ended :"+ name);
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
		ExecutorService executorservice = Executors.newFixedThreadPool(2);
		
		Threadd thread1 = new Threadd("Thread1");
		Threadd thread2 = new Threadd("Thread2");
		Threadd thread3 = new Threadd("Thread3");
		Threadd thread4 = new Threadd("Thread4");
		Threadd thread5 = new Threadd("Thread5");
		Threadd thread6 = new Threadd("Thread6");
		Threadd thread7 = new Threadd("Thread7");
		Threadd thread8 = new Threadd("Thread8");
		Threadd thread9 = new Threadd("Thread9");
		Threadd thread10 = new Threadd("Thread10");
		Threadd thread11 = new Threadd("Thread11");
		Threadd thread12 = new Threadd("Thread12");
		Threadd thread13 = new Threadd("Thread13"); 
		
		executorservice.execute(thread1);
		executorservice.execute(thread2);
		executorservice.execute(thread3);
		executorservice.execute(thread4);
		executorservice.execute(thread5);
		executorservice.execute(thread6);
		executorservice.execute(thread7);
		executorservice.execute(thread8);
		executorservice.execute(thread9);
		executorservice.execute(thread10);
		executorservice.execute(thread11);
		executorservice.execute(thread12);
		executorservice.execute(thread13);
	
		

	}

}
