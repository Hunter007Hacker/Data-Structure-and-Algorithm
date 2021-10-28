package Shop;

public class Door {

	private Lock lock = new Lock(true) ;
	
	public void shopstatus() {
		if(lock.isLock()) {
			System.out.println("shop is closed ,please visit later.");
		}else {
			System.out.println("welcom! we are open.");
		}
	}
	public Lock getLock() {
		return lock;
	}
	
	
//	public Door(Lock lock) {
//		this.lock = lock;
//	}
	
	
	class Lock{
		private boolean lock;
		
		public Lock(boolean lock) {
			this.lock = lock;
		}
		public boolean isLock() {
			return lock;
		}
		public void setLock(boolean lock) {
			this.lock = lock;
		}
	}

}
