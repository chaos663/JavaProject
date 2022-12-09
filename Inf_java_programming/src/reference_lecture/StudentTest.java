package reference_lecture;

public class StudentTest {

	public static void main(String[] args) {

		Students studentJames = new Students(100, "James");
		studentJames.setKorea(89);
		studentJames.setMath(95);

		Students studentTomas = new Students(101, "Tomas");
		studentTomas.setKorea(95);
		studentTomas.setMath(88);

		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();

	}

}
