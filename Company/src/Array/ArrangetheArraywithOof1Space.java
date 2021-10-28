package Array;

public class ArrangetheArraywithOof1Space {
	static void arrange(int arr[], int n) {
		int temp[]= new int[n];
		for(int i=0;i<n;i++) {
			temp[i] = arr[arr[i]];
		}
		for(int i=0;i<n;i++) {
			arr[i] =temp[i];
			
			System.out.print(arr[i] +" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {4,0,2,1,3};
		arrange(arr,arr.length);

	}

}
