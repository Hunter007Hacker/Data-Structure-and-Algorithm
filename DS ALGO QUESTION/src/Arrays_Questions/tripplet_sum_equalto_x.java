package Arrays_Questions;

import java.util.Scanner;


public class tripplet_sum_equalto_x {
	public static int find3Numbers(int a[], int n, int x) {
		int low,high;
		int ans=0;
		
		for(int i=0;i<n;i++) {
			low=i+1;
			high=n-1;
			
			while(low<high) {
				if(a[i]+a[low]+a[high] == x) 
					return 1;
				else if(a[i]+ a[low]+ a[high] < x)
					low++;
				else if( a[i]+ a[low]+ a[high] >x)
					high--;
			}
		}
		return 0;
		
	}


	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,6};
		int n = a.length;
		int x= 10;
		
		System.out.println(find3Numbers(a,n,x));
	}

}
