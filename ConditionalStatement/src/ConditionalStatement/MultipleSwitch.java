package ConditionalStatement;

public class MultipleSwitch {

	public static void main(String[] args) {
		int rating=3;
		switch(rating) {
		case 1:
		case 2:
			System.out.println("bad rating");
			break;
		case 3:
			System.out.println("average rating");
			break;
		case 4:
		case 5:
			System.out.println("good rating");
			break;
		default:
			System.out.println("invalid input");
		}
	

	}

}
