package SyncronizedMethod;

class Bracket{
	
   synchronized	public void generate() {
		for(int i=1;i<=10;i++) {
			if(i<= 5) {
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}

public class App {

	public static void main(String[] args) {
	   Bracket bracket1 = new Bracket();
	   Bracket bracket2 = new Bracket();
	  
	   
	   new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=1;i<=5;i++) {
				bracket1.generate();
			}
			
		}
		   
	   }).start();
	   
	   
	   new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=1;i<=5;i++) {
				bracket2.generate();
			}
			
		}
		   
	   }).start();

	}

}
