package SortingMechanism.Array;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class mySort implements Comparable<mySort>{
    private int age ;
    public mySort(int age) {
    	this.age = age ;
    }
	@Override
	public int compareTo(mySort obj) {
		if(age > obj.age) {
			return 1;
		}else if(age<obj.age) {
			return -1;
		}else 
			return 0;
	}
	@Override
	public String toString() {
		return   age +" " ;
	}
	
	
}

public class SortingByNePo {
	

	public static void main(String[] args) {
		List<mySort> l = new LinkedList<>();
		l.add(new mySort(10));
		l.add(new mySort(20));
		l.add(new mySort(20));
		l.add(new mySort(30));
		l.add(new mySort(60));
		
		SortingByNePo.print(l);
		
	}
	
static void print(List<mySort> l) {
	ListIterator<mySort> iterator =l.listIterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next() +" ");
	}
}

}
