package Methods;

public class Introduction {

	public static void main(String[] args) {
		int firstNumber=34;
		int secondNumber=14;
		
		int result = maxOf(firstNumber , secondNumber);
		int res= maxOf(1000 ,2000);
		System.out.println(res);
		sayHi();

	}
	static int maxOf(int a, int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("friends");
	}
	
	

}
