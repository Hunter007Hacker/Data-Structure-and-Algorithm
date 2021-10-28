package Main;

import Main.test.Door;

public class Main {

	public static void main(String[] args) {
		Door door = new Door();
		System.out.println(door.getLock().isUnlock("qwerty"));
		

	}

}
