package inheritance;

public class singer extends person{

	public singer (String name) {
		super(name);
		System.out.println("inside teacher costruction");
	}
	
	public void sing() {
		System.out.println(name +" is singing");
	}

	  public static void laughing() {
		  System.out.println("person is laughing");
	  }


}
