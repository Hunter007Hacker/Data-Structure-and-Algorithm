package Constructor;

class Vehicle {
	int wheels;
	String color;
	int headLight;
	
	
	Vehicle (int wheels) {
		this.wheels =wheels;
		headLight = 2;
		
	}
	Vehicle (int wheels , String color ) {
		this.wheels = wheels ;
		this.color = color ;
		headLight = 2;
	}

}

public class MyConstructorArgument {
	
	MyConstructorArgument() {
		System.out.println("object is created");
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle(4);
		Vehicle bmw = new Vehicle(2);
		Vehicle eRicskha = new Vehicle(3 , "red");
		
		
		System.out.println( car.wheels + " wheels");
		System.out.println(bmw.wheels + " wheels");
		System.out.println( eRicskha.wheels + " wheels" + " and color is"  + eRicskha.color    );
		
		System.out.println( car.headLight + "headLIght");

	}

}
