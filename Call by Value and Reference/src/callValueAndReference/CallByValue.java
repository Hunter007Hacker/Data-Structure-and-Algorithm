package callValueAndReference;

public class CallByValue {

	public static void main(String[] args) {
		int value = 10 ;
		 System.out.println(value);
		 
		 checkRefrence(value);

	}
	static void checkRefrence(int value) {
		System.out.println(value);
		value = 20;
		System.out.println(value);
	}

}
