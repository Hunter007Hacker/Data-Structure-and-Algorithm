package Abstraction;

public class ReapairCar {
	
	
	public static void carRepair(Audi a) {
		System.out.println("car is reapired");
		
	}
	
	public static void carRepair(WagnoR w) {
		System.out.println("car2 is repaired");
	}

	public static void main(String[] args) {
		
		
		Audi a = new Audi();
		WagnoR w = new WagnoR ();
		
		
		carRepair(w);
		carRepair(a);
		
		

	}

}
