package Knapsack;

import java.util.Scanner;

public class count_subset_given_sum {
	
	
	static int countSubset(int []arr,int sum,int n) {
	  int t[][] = new int [n+1][sum+1];
	  
	  for(int i=0 ; i<n+1 ; i++) {
		  for(int j=0 ;j<sum+1; j++) {
			  if(i==0 )
				  t[i][j] = 0;
			  if(j==0)
				  t[i][j] =1;
			  
		  }
	  }
	  for(int i=1 ; i<n+1 ; i++) {
		  for(int j=1 ;j<sum+1; j++) {
			if(arr[i-1] <= j)
				t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
			else
				t[i][j] = t[i-1][j];
		  }
	  }
		  
	return t[n][sum];	
	}

	public static void main(String[] args) {
		int arr[] = {2,3,5,6,8,10};
		int sum=5;
		System.out.println (countSubset(arr,sum,arr.length));
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = sc.nextInt();
//		int arr[] = new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i] = sc.nextInt();
//		}
		
//		int outcome = countSubset(arr,sum,n);
//		System.out.println(outcome/Math.pow(2, n));
	}

}
