package reference_lecture;

public class Students {

//	int studentID;
//	String studentName;
//	int koreaScore;
//	int mathScore;
//	String koreaSubject;
//	String mathSubject;
//
//	int engScore;
//	String engSubject;
	int studentID;
	String studentName;
	Subjects korea;
	Subjects math;

	// ���� �Ѵٰ� Ŭ���� ���� x
	public Students(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subjects("����");
		math = new Subjects("����");
	}

	public void setKorea(int score) {
		korea.setScore(score);
	}

	public void setMath(int score) {
		math.setScore(score);
	}

	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "�л��� ������" + total + "�� �Դϴ�.");
		System.out.println(studentName + "�л��� �����" + total / 2 + "�� �Դϴ�.");
	}
}
