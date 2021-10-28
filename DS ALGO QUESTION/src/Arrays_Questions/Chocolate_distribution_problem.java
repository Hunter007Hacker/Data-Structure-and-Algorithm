package Arrays_Questions;

import java.util.Arrays;

public class Chocolate_distribution_problem {

	public static void main(String[] args) {
		
		int a[]  = {1,4,3,7,9,9,12,56};
		int n = a.length;
		
		Arrays.sort(a);
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		
		int min = Integer.MIN_VALUE;
		int m =3;
		
		
		for(int i=0 ; i+m-1<n; i++) {
			int d = a[i+m-1] - a[i];
			if(d< min) 
				min = d; 
			

	}
		
		System.out.println(min);

}
	
}
