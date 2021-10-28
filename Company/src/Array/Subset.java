package Array;

public class Subset {
	static int subset(int arr[], int n) {
		int i=0;
		
		int count= 0;	
		while(i<n) {
			
			if(arr[i] %4 !=0) {
				count++;
			}

			int sub = 1;
			int ans[] = new int[n];
			for(int j=i+1; j<n;j++) {
				sub = sub * arr[i] * arr[j];
				if(sub % 4 != 0)
					count++;
			}
			i++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		int arr[]  = {4,5,6,15};
		System.out.println(subset(arr,arr.length));

	}

}
