package Knapsack;


import java.util.Vector;



public class min_subset_sum_difference{
	
	 static int  subsetSum(int []arr,int sum,int n) {
		 //taking table 
		 boolean t[][] = new boolean[n+1][sum+1];
		 
		 //initializing the table
		for(int i=0 ;i<n+1 ; i++) {
			for(int j=0 ;j< sum+1 ; j++) {
				if(i==0) {
					t[i][j] = false;
				}
				if(j==0) {
					t[i][j] = true;
				}
				
			}
		}
		//choice diagram code
		for(int i=1 ;i<n+1 ; i++) {
			for(int j=1 ;j< sum+1 ; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
				}else
					t[i][j] = t[i-1][j];
			}
		}
		
		//now here we store all the value of last row "n" in the given arraylist so that we can minimize (sum - 2s1)
		Vector<Integer> v = new Vector<>();
		for(int i=0 ;i<=sum/2 ;i++) {
			if(t[n][i] == true) {
				v.add(i);
			}
		}
		int min = Integer.MAX_VALUE ;
		
		for(int i=0;i<v.size();i++) {
			min = Math.min(min,sum - 2*v.get(i));
		}
		
		return min; 
	}

	public static void main(String[] args) {
		int arr[] = {1,6,11,5};
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum = sum + arr[i];
		}
		int n  = arr.length;
		System.out.println(subsetSum(arr,sum,n));
			
	}

}
