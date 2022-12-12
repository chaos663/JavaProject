package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;

	public Student(String studentName, int money) {

		this.studentName = studentName;
		this.money = money;
	}

	// ��ü�� ������ �Ͼ�� �κ�
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}

	public void takeSubway(Subway subway) {

		subway.take(1500);
		money -= 1500;
	}

	public void takeTaxi(Taxi taxi) {

		taxi.take(3800);
		money -= 3800;
	}

	public void showInfo() {

		System.out.println(studentName + "���� ���� ����" + money + "�� �Դϴ�.");
	}

}
