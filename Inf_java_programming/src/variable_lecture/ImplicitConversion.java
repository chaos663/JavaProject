package variable_lecture;

public class ImplicitConversion {

	public static void main(String[] args) {
		// ������ �� ��ȯ
		byte bNum = 10;
		int num = bNum;
		System.out.println(num);
		// 10���

		long lNum = 10;
		float fNum = lNum;

		System.out.println(fNum);
		// 10.0���

		double dNum = fNum + num;
		// num�� float�� ���� �� ��ȯ�� �Ͼ��, ���� �� double�� �� ��ȯ�ž ���� type�� double

		System.out.println(dNum);

		// ��, ���� �� -> ū ��, �� ���� -> �� ������ �� �� �� ��ȯ�� ���������� �Ͼ �� �ִ�.
	}

}
