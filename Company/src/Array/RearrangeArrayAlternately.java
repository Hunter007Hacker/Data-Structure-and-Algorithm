package Array;

public class RearrangeArrayAlternately {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6};
		rearrange(arr,arr.length);

	}

	private static void rearrange(int[] arr, int n) {
		int max_idx = n-1;
		int min_idx = 0;
		int max_elem = arr[n-1] +1;
		
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				arr[i] += (arr[max_idx] %max_elem)*max_elem ;
				max_idx--;
			}else {
				arr[i] += (arr[min_idx]% max_elem)*max_elem;
				min_idx++;
			}
		}
		for(int i=0;i<n;i++) {
			arr[i] = arr[i]/max_elem ; 
			System.out.print(arr[i]+" ");
		}
	}

}
