package org.honey.javatutorials.variables;

public class StringDemo {

	public static void main(String[] args) {
		// data type 을 String(문자열)로 선언읋 함
		String first;
		first = "저는 문자열입니다.";
		// 문자열은 " "로 열고 닫아서 사용
		System.out.println(first);

		// type과 변수를 한번에 선언
		String second = "저는 두 번째 문자열입니다.";

		System.out.println(second);

		// 복수의 변수 data type을 선언하고 사용
		String a, b;
		a = "나는\n";
		b = "Java를 배웁니다.";
		System.out.println(a + b);

	}

}
