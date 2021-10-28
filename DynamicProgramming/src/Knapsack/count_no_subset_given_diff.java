package Knapsack;

public class count_no_subset_given_diff {
	
	static int subsetSum(int []arr,int n,int s1Sum) {
		 //taking table 
		 int  t[][] = new int[n+1][s1Sum+1];
		 
		 //initializing the table
		for(int i=0 ;i<n+1 ; i++) {
			for(int j=0 ;j< s1Sum+1 ; j++) {
				if(i==0) {
					t[i][j] = 0;
				}
				if(j==0) {
					t[i][j] = 1;
				}
				
			}
		}
		//choice diagram code
		for(int i=1 ;i<n+1 ; i++) {
			for(int j=1 ;j< s1Sum+1 ; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
				}else
					t[i][j] = t[i-1][j];
			}
		}
		
		return t[n][s1Sum];
		
	}

	public static void main(String[] args) {
		int arr[]  = {1,1,2,3};
		int diff=1;
		int n =arr.length;
		int sum = 0;
		for(int i=0 ; i<n ;i++) {
			sum = sum + arr[i];
		}
		//subset s1 - subset s2 = diff 
		//subset s1 + subset s2 = sum(arr);
		
		//  2 * subset s1 = diff + sum(arr);
		
		// subset s1 =  (diff + sum(arr)) / 2  ;
		
	  int s1Sum = (diff + sum) / 2 ;
	  
	  System.out.println(subsetSum(arr,n,s1Sum));
		
	}

}
