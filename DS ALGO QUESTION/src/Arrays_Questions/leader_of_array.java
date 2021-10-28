package Arrays_Questions;

import java.util.Scanner;

public class leader_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        
        for(int i=0 ;i<n ; i++){
            a[i] =sc.nextInt();
        } 
        int flag =1;
        for(int i= 0 ; i<n ;i++){
            for(int j=i+1 ; j<n ;j++){
                if(a[i] < a[j])
                    flag=0;
                    break;
            }
            if(flag==1){
                System.out.println(a[i]);
            }
            
            
        }

	}

}
