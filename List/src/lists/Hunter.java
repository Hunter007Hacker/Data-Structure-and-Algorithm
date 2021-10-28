package lists;

public class Hunter<X , Y , Z> {
	X x;
	Y y;
	Z z;
	 
	
	Hunter(X x, Y y, Z z){
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	public void goat() {
		System.out.println(" X is" + x + "Y is "+ y + "Z is " + z);
	}
 
}
