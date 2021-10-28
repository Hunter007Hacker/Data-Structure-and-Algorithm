package Arrays_Questions;

import java.util.HashSet;

public class Longest_consecu_suseq {
	public static int findLongestSubseq(int arr[], int n) {
		
		HashSet<Integer> hs = new HashSet<>();
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			hs.add(arr[i]);
		}
		
		for(int i=0; i<n; i++) {
			if(!hs.contains(arr[i]-1)) {
				int j = arr[i];
				while (hs.contains(j)) {
					j++;
				}
				if(ans < j-arr[i])
					ans = j-arr[i];
			}
		}
		return ans;	
	}

	public static void main(String[] args) {
		int arr[] = {2,6,1,9,4,5,3};
		int n = arr.length;
		 System.out.println( findLongestSubseq(arr,n));
     

	}

}
