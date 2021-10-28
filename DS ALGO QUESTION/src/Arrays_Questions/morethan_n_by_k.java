package Arrays_Questions;

public class morethan_n_by_k {
	
	public static void moreThan(int arr[] , int k,int n) {
		
		int temp[] = new int[n];
		int j = 0 ;
		for(int i=0; i<n ; i++) {
			if(n/k <= arr[i])
				temp[j]= arr[i];
			    j++;
		}
		System.out.print(temp[0]);
		for( j=1; j<temp.length; j++) {
			if(temp[j] != temp[j-1] )
			System.out.print(temp[j]);
		}
			
		
		
	}

	public static void main(String[] args) {
		int arr[] = {3,1,2,2,1,2,3,3};
		int k = 4;
		int n = arr.length;
		
		moreThan(arr,k,n);
			
   
	}

}
