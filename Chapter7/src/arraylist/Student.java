package arraylist;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;

	public Student(int studentID, String studentName) {

		this.studentID = studentID;
		this.studentName = studentName;

		subjectList = new ArrayList<Subject>();
	};

	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);

		subjectList.add(subject);
	};

	public void showStudentInfo() {
		int total = 0;
		int average = 0;
		for (Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(
					"학생 : " + studentName + "님의 " + subject.getName() + "과목의 성적은 " + subject.getScore() + " 입니다.");
		}
		;
		average = total / subjectList.size();
		;
		System.out.println("학생 : " + studentName + "님의 " + "성적의 총 합산은 " + total + "점 입니다.");
		System.out.println("학생 : " + studentName + "님의 " + "성적의 평균은 " + average + "점 입니다.");
	};

}
