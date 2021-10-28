package Array;

import java.util.ArrayList;
import java.util.List;

public class MissingNoInUnsorted {
	static List<Integer> findDisapper(int arr[] , int n) {
		for(int i=0;i<n-1;i++) {
			int index = Math.abs(arr[i]);
			if(arr[index -1] > 0) {
				arr[index-1] *= -1;
			}
		}
		List<Integer> res = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i] >0) {
				res.add(i+1);
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
	  int arr[] = {1,2,4,6,3,7,8};
	  System.out.println(findDisapper(arr,arr.length));

	}

}
