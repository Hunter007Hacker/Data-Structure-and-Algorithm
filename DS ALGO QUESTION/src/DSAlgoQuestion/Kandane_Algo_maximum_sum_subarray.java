package DSAlgoQuestion;

import java.util.Scanner;

public class Kandane_Algo_maximum_sum_subarray {
	
	static int getmax_sum_subarray(int arr[],int n) {
		
		int max_so_far = Integer.MIN_VALUE ;
		int max_ending_here = 0;
		
		for(int i=0; i<n; i++) {
			max_ending_here = max_ending_here + arr[i];
			if(max_so_far < max_ending_here)
			{
				max_so_far = max_ending_here ;
			}
			
			if(max_ending_here < 0)
			{
				max_ending_here = 0 ;
			}
		}
		
		return max_so_far ;		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println(getmax_sum_subarray( arr, n));
		

	}

}
