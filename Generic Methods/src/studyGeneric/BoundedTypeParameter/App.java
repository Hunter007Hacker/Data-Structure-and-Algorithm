package studyGeneric.BoundedTypeParameter;

class Data<K ,App>{
	private  K key ;
	private App value ;
	public Data(K key, App value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public App getValue() {
		return value;
	}
	public <E extends Character,N extends Number> void display(E string , N i) {
		System.out.println(string + " " + i);
	}
	
}

public class App {

	public static void main(String[] args) {
		Data<String, App> data = new Data<String, App>("Hunter", new App());
		data.display('u', 20);
		data.getValue().Test();
	}
	public static void Test() {
		System.out.println("Testing..App.");
	}


}
