package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		System.out.println("================================");

		Student studentLee = new Student(10123, "이동건");

		studentLee.addSubject("국어", 97);
		studentLee.addSubject("수학", 100);
		studentLee.addSubject("도덕", 88);

		studentLee.showStudentInfo();

		System.out.println("================================");

		Student studentMa = new Student(10124, "마동석");

		studentMa.addSubject("국어", 88);
		studentMa.addSubject("수학", 99);
		studentMa.addSubject("도덕", 85);

		studentMa.showStudentInfo();

		System.out.println("================================");

		Student studentHarry = new Student(10125, "Harry Styles");

		studentHarry.addSubject("국어", 84);
		studentHarry.addSubject("수학", 100);
		studentHarry.addSubject("도덕", 100);

		studentHarry.showStudentInfo();

		System.out.println("================================");

	}

}
