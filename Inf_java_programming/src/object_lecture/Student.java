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

		// 객체,참조형 데이터 타입, 참조 변수
		Student studentLee = new Student();
		// ctrl + space == 도움말
		studentLee.studentName = "이영애";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";

		Student studentG = new Student();
		studentG.studentName = "지드래곤";
		studentG.studentID = 101;
		studentG.address = "서울시 마포구 망원동";

		studentLee.showStudentInfor();
		studentG.showStudentInfor();

		System.out.println(studentLee);
		// studentLee를 참조변수라고 하고,
		// 출력된 object_lecture.Student@15db9742 이거를 reference value, 참조 값이라고 한다.
		System.out.println(studentG);
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.address);
	}

}
