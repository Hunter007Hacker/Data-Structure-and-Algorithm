
public class FinallyExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println("the output is : " + 1/1);
		}catch(RuntimeException e) {
			System.out.println("RUNtimeexception");
		}
		catch(Exception e) {
			System.out.println("exception");
		}finally{
			System.out.println("Whatever happen it will print");
		}

	}

}
