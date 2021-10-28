package studyGenericMethods;

import java.util.List;

class Data{
	public <E> void printList(List<E> list) {
		for(E element: list ) {
			System.out.println(element);
		}
	}
	public <E> void printArray(E[] arr) {
		for(E number: arr) {
			System.out.println(number);
		}
	}
}

public class App {

	public static void main(String[] args) {
		Integer arr[] = {12,34,56,78};
		String str[] = {"rav", "ban", "tina","you"};
        Data data = new Data();
        data.printArray(arr);
        data.printArray(str);

	}

	

}
