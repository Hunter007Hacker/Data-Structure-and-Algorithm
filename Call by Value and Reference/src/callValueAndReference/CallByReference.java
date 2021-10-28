package callValueAndReference;

public class CallByReference {

	public static void main(String[] args) {
		String []names = {"Hunter" , "Helsinki", "Professor", "Denver"};
		print(names);
		System.out.println("************************");
		
		print(names);

	}
	
	static void print(String []names) {
		for(String name : names) {
			System.out.println(name);
		}
		names[0] = "Tokyo";
	}

}
