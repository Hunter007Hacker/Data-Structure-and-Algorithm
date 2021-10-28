package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class MyArrayList {

	public static void main(String[] args) {
		
		// List  fruits = new ArrayList();
        List<String> fruits = new LinkedList<>();
//      
//      List<String> toRemove = new ArrayList<>();
//      
//      toRemove.add("apple");
//      toRemove.add("banana");
//   
//		
		fruits.add("apple");  
		fruits.add("banana");
		 fruits.add("grapes");
		 for(String e: fruits) {
			 System.out.println(e); 
		 }
//		 }
//	
//		fruits.add( "orange");
		String temp[] = new String[fruits.size()];
//		
		 fruits.toArray(temp);
		 for(String e: temp) {
			 System.out.println(e);
		 }
//		 
//		 
//		 }
//		 
		
		
	     
//		
//		System.out.println(fruits);
//		ArrayList<Integer> marks = new ArrayList();
		
//		Pair <String , Integer> p1 = new Pair("Hunter",555);
//     	Pair <Boolean, String> p2 = new Pair (true, "rocko");
//		
//		p1.getdiscription();
//		p2.getdiscription();
//		
		
//		Hunter<String, Integer, Boolean> h1 = new Hunter("Hunter" ,5, true);
//		 h1.goat();  
	}

}
