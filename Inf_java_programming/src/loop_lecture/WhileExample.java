package loop_lecture;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		} while (num <= 1);
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
	}

}
