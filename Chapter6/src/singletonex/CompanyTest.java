package singletonex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		System.out.println(c1);
		System.out.println(c2);

		// �굵 �ڹ� ���ο� �ִ� instance �ε� singleton �������� �Ǿ� ����
		Calendar cal = Calendar.getInstance();

	}

}
