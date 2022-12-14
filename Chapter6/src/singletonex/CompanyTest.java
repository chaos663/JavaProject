package singletonex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		System.out.println(c1);
		System.out.println(c2);

		// 얘도 자바 내부에 있는 instance 인데 singleton 패턴으로 되어 있음
		Calendar cal = Calendar.getInstance();

	}

}
