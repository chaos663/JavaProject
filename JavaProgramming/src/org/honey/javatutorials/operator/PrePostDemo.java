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
		// 6 ->> 5 +1 �̱⿡ 6�̳��´�.
		System.out.println(i++);
		// 6 6�̸��� ����� �ǰ� +1�� �ȴ�.
		System.out.println(i);
		// �׷��� ������ �� 7�� ���⼭ ���
	}

}
