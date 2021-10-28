package Constructor;

class Cat{
	boolean fur;
	String color;
	int legs, eye;
	String breed;
	
public void walk() {
	System.out.println("cat is walking");
}
public void eat() {
	System.out.println("cat is eating");
}
public void discription() {
	System.out.println("my cat has " + legs + " legs and " + eye + " eyes" );
}
}

class Dog{
	String breed, name;
	public void jump() {
		System.out.println("my dog name is " + name + " jumped");
	}
	public void discription() {
		System.out.println("my dog breeed is" + breed  );
	}
}


public class MainClass {

	public static void main(String[] args) {
		
	
		
//		
//	Cat cat1 = new Cat();
//	Cat cat2 = new Cat();
//	cat1.legs = 4;
//	cat1.eye = 2;
//	cat2.legs=3;
//	cat2.eye=1;
//	cat1.discription();
//	cat2.discription();
		
		
	Dog dog1= new Dog();
	Dog dog2= new Dog();
	dog1.name="moti";
	dog2.name="shera";
	dog1.breed="german sheperd";
	
	dog1.jump();
	dog1.discription();
	
	
	
	
	}

}
