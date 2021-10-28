package ConditionalStatement;
import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a==1) {
			System.out.println("today is sunday");
		}
		else if(a==2) {
			System.out.println("today is monday");
			
		}
		else {
			System.out.println("today is tuesday");
			
		}
		
	}

}
