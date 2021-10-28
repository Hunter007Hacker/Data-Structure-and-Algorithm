package LCS_appliOf_Knapsack;

public class LogestCommomSubstring {
	static int LogestCommomSubstring(String a,String b,int n,int m) {
		int t[][] = new int[n+1][m+1];
		int result=0;
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<m+1;j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					t[i][j] = 1+t[i-1][j-1] ;
					result  = Math.max(result, t[i][j]);
				}else
					t[i][j] = 0;
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		String a ="abde";
        String b = "ae";
        System.out.println(LogestCommomSubstring(a,b,a.length(),b.length()));
        
	}

}
