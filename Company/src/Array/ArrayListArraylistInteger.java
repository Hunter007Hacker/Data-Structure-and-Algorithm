package Array;

import java.util.ArrayList;

public class ArrayListArraylistInteger {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> ext = new ArrayList<ArrayList<String>>();
	    String[] arr = {"1","2","3","4","5","6"};
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        ArrayList temp = new ArrayList<String>();
	        for(int j=i;j<n;j++){
	            temp.add(arr[j]);
	            // this the line that needs to look at. Rather than pointing to the same memory reference creating a new ArrayList will store it in a different memory location. If you just add temp then it will point to same memory location.
	           // ext.add(new ArrayList<String>(temp));
	             // Comment above line and uncomment below to see the difference    
	            ext.add(temp);
	        }

	    }
	    System.out.println(ext);

	}

}
