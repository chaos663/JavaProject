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

	// 선언만 한다고 클래스 생성 x
	public Students(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subjects("국어");
		math = new Subjects("수학");
	}

	public void setKorea(int score) {
		korea.setScore(score);
	}

	public void setMath(int score) {
		math.setScore(score);
	}

	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
		System.out.println(studentName + "학생의 평균은" + total / 2 + "점 입니다.");
	}
}
