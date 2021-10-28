package inheritance;

public class person {
	protected String name;
	
	public person(String name) {
		this.name= name;
		System.out.println("inside personconstructor");
	}
	
	
public void walk() {
	System.out.println(name + " is walking");
}

public void eat() {
	System.out.println(name +  " is eating-");
}

  public static void laughing() {
	  System.out.println("person is laughing");
  }


}
 