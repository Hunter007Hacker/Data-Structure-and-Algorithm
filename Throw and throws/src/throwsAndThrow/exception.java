package throwsAndThrow;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception {

	public static void main(String[] args) {
		try {
			someMethode();
		} catch (FileNotFoundException e) {
			System.out.println("catch exception from someMethode");
		}

	}
	public static void someMethode() throws FileNotFoundException {
		System.out.println("Print from someMethode");
		throw new FileNotFoundException();
		
	}

}
