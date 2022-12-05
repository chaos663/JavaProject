package org.honey.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i);

		++i;
		System.out.println(i);
		// 5
		System.out.println(++i);
		// 6 ->> 5 +1 이기에 6이나온다.
		System.out.println(i++);
		// 6 6이먼저 출력이 되고 +1이 된다.
		System.out.println(i);
		// 그래서 연산이 된 7이 여기서 출력
	}

}
