package Arrays_Questions;

import java.util.Arrays;
import java.util.Scanner;


public class Smallest_subarray_sum_greterthan_x {
	
	 public static void subArrays(int a[], int n , int x) {
		 
		 Arrays.sort(a);
		 
		
		 int sum= 0;
		 int start= 0;
		 int end = 0;
		 int mila=0;
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n; j++) {
			 sum = a[i] + a[j];	
			 
			 if(sum > x)
				
			     end = j;
			     mila =1;
				 break;
			 }
			 if(mila == 1)
				 start= i;
				 break;
		 }
		 
		 for(int i=start; i<=end; i++) {
			 System.out.print(a[i]+" ");
		 }
		 
	 }


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number x: ");
		int x = sc.nextInt();
		System.out.println("entr thr size of array: ");
		int n =  sc.nextInt();
		int a[] = new int[n];
		System.out.println("entr the elements of array");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		
		
	subArrays(a,n,x);	

	}

}
