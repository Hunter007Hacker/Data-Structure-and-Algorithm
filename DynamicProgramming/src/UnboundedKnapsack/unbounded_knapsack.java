package UnboundedKnapsack;

public class unbounded_knapsack {
	static int unboundedKnapsack(int []wt,int[]val,int n,int w) {
		int t[][] = new int[n+1][w+1];
		
		for(int i=0;i<n+1 ;i++) {
			for(int j=0;j<w+1 ;j++) {
				if(i==0 || j==0) {
					t[i][j]= 0;
				}
			}
		}
			for(int i=1;i<n+1 ;i++) {
				for(int j=1;j<w+1 ;j++) {
					if(wt[i-1] <= j) {
						t[i][j] = Math.max(val[i-1] + t[i][j-wt[i-1]] , t[i-1][j]);
					}else
						t[i][j] = t[i-1][j];
					}
				}
		return t[n][w];
	}

	public static void main(String[] args) {
       int wt[] = {2, 4, 5, 3}	;
       int n = wt.length;
       int val[] = {3, 5, 7, 8};
       int w = 9;
       
       System.out.println(unboundedKnapsack(wt,val,n,w));
      
	}

}
