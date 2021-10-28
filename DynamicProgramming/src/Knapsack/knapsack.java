package Knapsack;

public class knapsack {
	static int t[][] = new int [102][1002];
	
	static int knapsack(int wt[],int val[], int w ,int n) {
		if(n==0 || w == 0)
			return 0;
		if(t[n][w] != -1)
			return t[n][w];
		if(wt[n-1] <= w)
			return t[n][w]= Math.max(val[n-1] + knapsack(wt,val, w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
		return t[n][w] = knapsack(wt,val,w,n-1);
		
	
	}

	public static void main(String[] args) {
		int wt[] = {1,3,4,5};
		int val[] = {1,4,5,7};
		int n = wt.length;
		int w  = 7 ;
		for(int i=0 ;i<102 ; i++){
			for(int j=0;j<1002 ; j++) {
				t[i][j] = -1;
			}
		}
		System.out.println(knapsack(wt , val , w, n));
		

	}

}
