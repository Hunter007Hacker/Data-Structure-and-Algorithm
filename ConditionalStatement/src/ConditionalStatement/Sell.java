package ConditionalStatement;

import java.util.Scanner;

public class Sell {
	static void printRateStock(int choose ,int quantity , int[] Number,int []Price ,int []Stock) {
		int man = 0 ;
		int flag = 0;
		for(int i=0;i<Number.length;i++) {
			if(choose == Number[i]) {
				flag = 1;
				man = i; 
				break ;
			}	
		}
		if(flag != 1) {
			System.out.println("INVALID INPUT");
			return; 
		}
	        if(Stock[man] >= quantity) {
				System.out.println(quantity * Price[man] + "INR");
				System.out.println(Stock[man] - quantity +"LEFT");
				return;
			}else if(Stock[man] < quantity) {
				System.out.println("NO STOCK");
				System.out.println(Stock[man] + "LEFT");
			} 	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int Number[] = new int[n];
		String name[] = new String[n];
		int Price[] = new int[n];
		int Stock[] =new int[n];
		
		for(int i=0;i<n;i++) {
			Number[i] = sc.nextInt();
			name[i] = sc.nextLine();
			Price[i] = sc.nextInt();
			Stock[i] = sc.nextInt();
		}
		int choose =sc.nextInt();
		int quantity = sc.nextInt();
		printRateStock(choose,quantity , Number, Price , Stock);

	}

}
