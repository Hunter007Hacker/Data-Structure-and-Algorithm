package Arrays_Questions;

import java.util.Scanner;

public class subset_of_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size if first array: ");
		int n = sc.nextInt();
		System.out.println("enter the size of second array");
		int m = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[m];
		
		System.out.println("enter the elements of first array");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the element of second array");
		for(int i=0; i<m; i++) {
			b[i]= sc.nextInt();
		}
	    boolean sub = true;
	    int j;
		
		for(int i=0; i<n; i++) {
			for( j=0; j<m; j++) {
				if(a[i]== b[j])
					
					break;
			}
			System.out.println(j);
			if(j==m)
				sub =false;
				
		}
		if(sub==true) {
			System.out.println("subarray is  found");
		}else
		{
			System.out.println("subarray is not found");
		}

	}

}
