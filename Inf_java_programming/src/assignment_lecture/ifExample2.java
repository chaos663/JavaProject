package assignment_lecture;

public class ifExample2 {

	public static void main(String[] args) {

		int age = 20;
		int charge;

		if (age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("��,����л��Դϴ�.");
		} else {
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		System.out.println("������" + charge + "�� �Դϴ�.");
	}

}
