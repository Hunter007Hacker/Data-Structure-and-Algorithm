package studyComposition;

public class Main {

	public static void main(String[] args) {
//		Laptop lappy = new Laptop();
//		System.out.println(lappy.toString());
//	
//		System.out.println(lappy.getProcessor().getChacheMemory());
		Processor processor = new Processor(null, null, null, 0, 0, null, "2.1GHz", "2.2Ghz", "8.1GHz");
		
		Laptop gamingLaptop = new Laptop(24.5f, processor, null, null, null, null, null);
       System.out.println(gamingLaptop);
       
       gamingLaptop.gamingMode();
       System.out.println(gamingLaptop);
       System.out.println(gamingLaptop.getProcessor().getFrequency());
}
}