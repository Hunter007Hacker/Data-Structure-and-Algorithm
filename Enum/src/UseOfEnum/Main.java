package UseOfEnum;

public class Main {

	public static void main(String[] args) {
		EnumLearning learn = EnumLearning.GENERICS;
		 switch(learn) {
		case COLLECTION:
			System.out.println("step 2: learning collection framework");
			break;
		case COREJAVA:
			System.out.println("step 1: learning corejava ");
			break;
		case GENERICS:
			System.out.println("step 3: learning Generics");
			break;
		case JSPANDSERVLETS:
			System.out.println("step 4: learning cjsp and servlet");
			break;
		case MULTITHREADING:
			System.out.println("step 5: llearning multithreading");
			break;
		default:
			System.out.println("element not in enumarated list");
			break;
		 
		 }
	}

}
