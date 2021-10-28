package Encapsulation;

public class student {
   private int age;
   private 	String name;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age<20) {
			System.out.println("you are eligible");
		} else 
			System.out.println("you are not");
		
		}
	public String  setName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
		System.out.println("my name is "+ name);
	}
}

