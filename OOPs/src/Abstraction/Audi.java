package Abstraction;

public class Audi extends Car {
	
	
		
		public void breaking() {
		System.out.println("Audi is breaking");
	
		}

		@Override
		public void accelerate() {
			System.out.println("audi is accelerating");
			
		}
}
