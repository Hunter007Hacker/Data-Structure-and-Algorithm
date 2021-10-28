package UnboundedKnapsack;

public class rod_cutting_pblm {
	static int maxProfit(int []len,int []price,int n,int m) {
		int t[][] = new int[n+1][m+1];
		
		//initialization of t[][]
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<m+1;j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(len[i-1]<=j) {
					t[i][j] = price[i-1] + t[i][j-len[i-1]] + t[i-1][j-1];
				}else
					t[i][j] = t[i-1][j];
			}
		}
			
		return t[n][m];
	}
	

	public static void main(String[] args) {
		int len[] = {1,2,3,4,5,6,7,8};
		int price[] = {1,5,8,9,10,17,17,20};
		int m=8;
		
		System.out.println(maxProfit(len,price,len.length,m));
				
	}

}
