package org.honey.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println("Conding Everybody" + i);
		}
	}

}
