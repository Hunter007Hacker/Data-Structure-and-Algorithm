package Array;

public class MainClass {
	
	static int[] friends(int arr[] , int n) {
		int temp[] = new int[n];
		int k=0;
		
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]%arr[j] ==0 || arr[j] %arr[i]==0) {
					count++;
				}
			}
			temp [k]=count-1;
			k++;
		}
		return temp;
	}
public static void main(String[] args) {
	
	int arr[] = {2,3,4,5,6};
	friends(arr ,arr.length);
	
}
}
