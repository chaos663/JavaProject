package loop_lecture;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		int num;

		for (num = 1; num <= 100; num++) { // 100���� �ݺ�
			if (num % 2 == 0) // num ���� ¦���� ���
				continue; // ���� ������ �����ϰ� num++ ����
			total += num; // num ���� Ȧ���� ��쿡�� ����
		}
		System.out.println("1���� 100������ Ȧ���� ����:" + total + "�Դϴ�.");
	}

}
