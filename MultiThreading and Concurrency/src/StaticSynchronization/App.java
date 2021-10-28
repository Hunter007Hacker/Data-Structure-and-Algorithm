package StaticSynchronization;

class Bracket{
	private  String threadNo;
	
  synchronized static public void generate(String threadNo) {
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
public class App {

	public static void main(String[] args) {
	  
	   
	   new Thread(new Runnable() {
		@Override
		public void run() {
			long startTime= System.currentTimeMillis();
			for(int i=1;i<=5;i++) {
				Bracket.generate("Threadno 1");
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
				Bracket.generate("threadno 2");
			}
		
			long endTime= System.currentTimeMillis();
			System.out.println("Time required in thread1: " + (endTime - startTime));
		}
		   
	   }).start();

	}

}
