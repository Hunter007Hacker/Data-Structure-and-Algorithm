package Arrays_Questions;

import java.util.Scanner;

public class NO_Of_Negative_SubArray {
	static int Solution(int []arr , int n) {
		int sum =0;
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=i ;j<n ; j++) {
				sum +=arr[j];
				if(sum < 0 ) {
					count++;
				}
			}
			sum =0;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
			
			System.out.println(Solution(arr,n));
		}

	}

}
