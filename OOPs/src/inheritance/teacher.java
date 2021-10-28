package inheritance;

public class teacher extends person {
	
	public teacher (String name) {
		super(name);
		System.out.println("inside teacher costruction");
	}

	
	public void teach() {
		
		System.out.println(name +" is teachimg");
	}
	public void walk() {
		super.walk();
		System.out.println("person"  + name + " is walking");
	}

	  public static void laughing() {
		  System.out.println("person is laughing");
	  }

}
