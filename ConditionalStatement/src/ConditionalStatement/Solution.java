package ConditionalStatement;

import java.util.Scanner;

public class Solution {
	static void participant(int  P) {
		if(P%2==0) {
			System.out.println(P/4 +"   --> Participants of Group A");
			System.out.println(P/4 +"   --> Participants of Group B");
			System.out.println(P/4 +"   --> Participants of Group C");
			System.out.println(P/4 +"   --> Participants of Group D");
		}else {
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P  = sc.nextInt();
		participant(P);

	}

}
