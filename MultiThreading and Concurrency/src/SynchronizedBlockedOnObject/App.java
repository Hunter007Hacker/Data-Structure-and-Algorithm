package SynchronizedBlockedOnObject;

class Bracket{
	private Object  lock = "lock";
  public void generate() { 
	  synchronized (lock){
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i<= 5) {
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
	  
		System.out.println();
	  }
		
//THIS SECOND FOR LOOP DONOT AFFECT OUR SYNCHRONIZED UPPER FOR FOOP 
//    THIS IS DONING SOME OTHER PROCESS
		
       for(int j=1;j<=10;j++) {
    	   try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
   }
}

/*   
 * SYNCHRONIZE METHODE TAKE
 *   TIME : 10,000 miliseconds 
   
    SYNCHRONIZE BLOCK METHODS
    TIME: 8,000 miliseconds
  *
  *
  */




public class App {

	public static void main(String[] args) {
	 Bracket bracket = new Bracket();
	  
	   
	   new Thread(new Runnable() {
		@Override
		public void run() {
			long startTime= System.currentTimeMillis();
			for(int i=1;i<=5;i++) {
				bracket.generate();
			}
		
			long endTime= System.currentTimeMillis();
			
			System.out.println(  "Time required in thread1: " + (endTime - startTime));
		}
	  }).start();
	   
	   
	   new Thread(new Runnable() {
		@Override
		public void run() {
			long startTime= System.currentTimeMillis();
			for(int i=1;i<=5;i++) {
				bracket.generate();
			}
		
			long endTime= System.currentTimeMillis();
			System.out.println("Time required in thread1: " + (endTime - startTime));
		}
		   
	   }).start();

	}

}
