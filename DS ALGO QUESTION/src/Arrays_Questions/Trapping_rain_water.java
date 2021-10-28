package Arrays_Questions;

import java.util.Scanner;

public class Trapping_rain_water {
	
	public static int min(int l, int r) {
		if(l>r)
			return r;
		else 
			return l;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    
	    for(int i=0; i<n; i++) {
	    	a[i] = sc.nextInt();
	    }
	    
	    int l[]  =new int[n];
	    int r[] = new int[n];
	    int max_left = l[0] = a[0];
	    int max_right = r[n-1] = a[n-1];
	    for(int i=1 ; i<n ; i++) {
	    	if(a[i]>max_left) {
	    		max_left = a[i];
	    		l[i] = max_left;
	    	}
	    }
	    for(int i=n-2; i>=0; i--) {
	    	if(a[i]>max_right) {
	    		max_right = a[i];
	    		r[i] = max_right;
	    	}
	    }
	    
	    int sum = 0;
	     for(int i=0; i<n ; i++) {
	    	 sum = sum + ((min(l[i], r[i])) - a[i]);
	     }
	     
	     System.out.println(sum);
	    

	}

}
