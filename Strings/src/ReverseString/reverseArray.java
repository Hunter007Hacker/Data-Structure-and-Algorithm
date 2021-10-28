package ReverseString;

import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the size of array");
		int n = scan.nextInt();
		int []a = new int[n];
		System.out.print("enter the element of array");
		for (int i= 0 ; i<n ; i++) {
			a[i] = scan.nextInt();
		}
		 for (int i=a.length-1 ; i>=0 ; i--) {
			 System.out.print(a[i] + " ");
		 }
		

	}

}
