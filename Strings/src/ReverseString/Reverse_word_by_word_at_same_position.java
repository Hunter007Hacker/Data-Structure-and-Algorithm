package ReverseString;

public class Reverse_word_by_word_at_same_position {

	public static void main(String[] args) {
		String a[] = {"hacker", "macker","ravi","shoman"};
		int n =a.length-1;
		int i=0;
		while(i<=n) {
			int j=a[i].length()-1;
		    while(j>=0) {
		    	System.out.print(a[i].charAt(j));
		    	j--;	
		    }
		    System.out.print(" ");
		    i++;
		}
	}

}
