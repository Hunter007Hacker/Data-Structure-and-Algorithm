package InterfenceAndClass;

public abstract class Person implements liveLife , isAlive {
	public void eat() {
		System.out.println("You are eating");
	}

	@Override
	public void alive() {
		System.out.println("You are Alive");
		
	}

	@Override
	public void live() {
		System.out.println("You are living");
		
	}
   public abstract void run();

   protected abstract int num();
	
}
