package Main.test;


public class Door {
	Lock lock = new Lock() {

		@Override //anonymous class
		public boolean isUnlock(String keyCode) {
			if(keyCode.equals("qwerty")) {
				return true;
			}else {
				return false;
			}
			
		}
		
	};
	//inorder to access Lock object we required getter

	public Lock getLock() {
		return lock;
	}
	

}
