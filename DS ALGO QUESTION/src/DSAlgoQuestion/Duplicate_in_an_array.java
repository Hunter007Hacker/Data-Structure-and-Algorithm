package DSAlgoQuestion;

public class Duplicate_in_an_array {
	
	public static int findDuplicate(int []arr) {
		int n = arr.length;
		
		
		int ans = 0 ;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(arr[i] == arr[j])
					
				{
					ans = arr[i];
					 
				}else
				{
					ans = -1;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,4};
		System.out.println(findDuplicate(arr));
		

	}

}
