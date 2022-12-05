package org.honey.javatutorials.conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if (id.equals("egoing") && password.equals("111111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
