package Main.easy;

public class main {

	public static void main(String[] args) {
		main obj  = new main();
		obj.case1(10,2);
		obj.case2(10,0);
		

	}
	public static void case1(int x,int y) {
		if(y!=0) {
			System.out.println(x/y);
		}else {
			System.out.println("y value is : 0"  );
		}
		
	}
	public static void case2(int x ,int y) {
		try {
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println("Arithematic exception");
		}
		
		catch(Exception e) {
			System.out.println("y value is 0");
		}
		
	}

}
