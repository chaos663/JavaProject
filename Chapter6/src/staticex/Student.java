package staticex;

public class Student {

	int studentID;
	String studentNameString;

	public Student() {

		serialNum++;

		studentID = serialNum;
	};

	private static int serialNum = 10000;

	public static int getSerialNum() {

		// static�������� ������ ��������!! �� �޼��尡 ȣ�� �� �� �����ǰ�, �޼��尡 ����Ǹ� ��������.
		int i = 10;

		i++;
		System.out.println(i);

//		studentName = "������"; // �������,�ν��Ͻ�����
		// �̷��� ��������� �ȿ��� ����� �� ����. �ֳ��ϸ�, ���������� ���� �ν��Ͻ� ������ static �޸� �ܿ��� ����Ϸ��� �ϴ� ������ ��
		// �� �ۿ�...

		return serialNum; // static����,Ŭ���� ����
	}

}
