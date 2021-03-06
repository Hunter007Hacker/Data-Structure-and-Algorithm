package Arrays_Questions;

public class maxProductSubarray {

	public static void main(String[] args) {
		int arr[] = {6,-3,-10,0,2};
		int n= arr.length;
		
		int minVal = arr[0];
		int maxVal = arr[0];
		int maxProduct = arr[0];
		
		for(int i=1; i<n ; i++) {
			
			if (arr[i]<0) {
				int temp = maxVal;
				maxVal = minVal;
				minVal = temp ;
			}
			
			maxVal = Math.max(arr[i], (maxVal * arr[i]));
			minVal = Math.min(arr[i], (minVal * arr[i]));
			
			maxProduct = Math.max(maxProduct, maxVal);
			
		}
		System.out.println(maxProduct);


	}

}
