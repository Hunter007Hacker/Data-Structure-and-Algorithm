package DSAlgoQuestion;

import java.util.Arrays;



public class Cyclic_rotation_Of_Array_By_2 {

	public static void main(String[] args) {
		
		
		
		
		int []arr = new int[] {1,2,3,4,5};
		int n = arr.length ;
		
		
			int x=arr[n-1] ;
		for(int i=n-1; i>0 ;i--) {
			
			arr[i] = arr[i-1];
			
		}
		arr[0] = x;
		
			
		System.out.println(Arrays.toString(arr));
		

	}

}
