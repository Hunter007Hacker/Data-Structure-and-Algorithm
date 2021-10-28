package studyGeneric;
/* 
 * The Naming convention are as follow
 *
 * T- Type
 * E -Element
 * K- Key
 * N- Number
 * V- Value
 *  
 * */
class Data<K,V>{
	private K key;
	private V value ;
	
    public Data(K key , V value){
		this.key= key;
		this.value = value;
		}
    public K getKey() {
    	return key;
    }
    public V getValue() {
    	return value;
    }
    
    public String toString() {
			return "key = " + key + " ,value = " + value  ;
    }
   public <E,N> void display(E element, N number) {
	   System.out.println(element + " " +  number);
   }
	
    
}

public class App {
	

	public static void main(String[] args) {
	Data<Integer, String> data = new Data<>(1, "Hunter");
	System.out.println(data.getKey());
	data.display("Hunter", 9);

	}

}
