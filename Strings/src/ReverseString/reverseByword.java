package ReverseString;

class Solution{
	
	
}

public class reverseByword {

	public static void main(String[] args) {
		
		Solution s= new Solution();
		reverseWord("the sky is blue");
		
	    

	}
	static void reverseWord (String s){
		int i = s.length()-1;
		 String ans = "" ;
		 while (i>=0) {
			 while ( i >=0 && s.charAt(i)==' ' ) i--;
			 
				 int  j=i;
				  
				 if (i<0)break;
				 while ( i>=0 && s.charAt(i)!=' ') i-- ;
				 
				 if (ans.isEmpty()) {
					 ans = ans.concat(s.substring(i+1 , j+1));
					
				 } else {
					 ans = ans.concat(" " + s.substring(i+1 , j+1));
					
				 }
			 
		 } System.out.println(ans);
		
	}

}

  