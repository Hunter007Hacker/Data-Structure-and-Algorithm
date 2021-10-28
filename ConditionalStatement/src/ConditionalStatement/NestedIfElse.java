package ConditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c=4, result=0;	
//		if (a>b) {
//			if (a>c) {
//				System.out.println("a is greater");
//			} else {
//				System.out.println("c is greater");
//			}
//		} else if(b>c) {
//			System.out.println("b is greater");
//		}else {
//			System.out.println("c is greater");
//		}
		result= a>b?a>c?a:c :b>c?b:c ;
		System.out.println(result);
		
	}

}
