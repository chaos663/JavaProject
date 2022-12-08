package object_lecture;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfor() {
		System.out.println(studentID + " " + studentName + "," + address);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	public static void main(String[] args) {
		// 4byte,integer
		int i = 10;

		// ��ü,������ ������ Ÿ��, ���� ����
		Student studentLee = new Student();
		// ctrl + space == ����
		studentLee.studentName = "�̿���";
		studentLee.studentID = 100;
		studentLee.address = "����� �������� ���ǵ���";

		Student studentG = new Student();
		studentG.studentName = "���巡��";
		studentG.studentID = 101;
		studentG.address = "����� ������ ������";

		studentLee.showStudentInfor();
		studentG.showStudentInfor();

		System.out.println(studentLee);
		// studentLee�� ����������� �ϰ�,
		// ��µ� object_lecture.Student@15db9742 �̰Ÿ� reference value, ���� ���̶�� �Ѵ�.
		System.out.println(studentG);
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.address);
	}

}
