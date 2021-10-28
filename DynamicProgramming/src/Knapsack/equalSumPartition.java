package Knapsack;

public class equalSumPartition extends subsetSum {
	static boolean equalSumPartition(int []arr ,int n) {
		int sum = 0;
		for(int i=0 ; i<n;  i++) {
			sum = sum + arr[i];
		}
		if(sum % 2 != 0)
			return false;
		else 
			return subSetSum(arr,sum/2, n);
	}

	public static void main(String[] args) {
		int  arr[] = {1,5,11,5};
		
		  
		System.out.println(equalSumPartition(arr,arr.length));
		
	}

}
