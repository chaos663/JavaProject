package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		System.out.println("================================");

		Student studentLee = new Student(10123, "�̵���");

		studentLee.addSubject("����", 97);
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 88);

		studentLee.showStudentInfo();

		System.out.println("================================");

		Student studentMa = new Student(10124, "������");

		studentMa.addSubject("����", 88);
		studentMa.addSubject("����", 99);
		studentMa.addSubject("����", 85);

		studentMa.showStudentInfo();

		System.out.println("================================");

		Student studentHarry = new Student(10125, "Harry Styles");

		studentHarry.addSubject("����", 84);
		studentHarry.addSubject("����", 100);
		studentHarry.addSubject("����", 100);

		studentHarry.showStudentInfo();

		System.out.println("================================");

	}

}
