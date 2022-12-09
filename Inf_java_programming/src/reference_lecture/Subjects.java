package reference_lecture;

public class Subjects {

	String subjectName;
	int score;

	public Subjects(String name) {
		subjectName = name;
	}

	public void setSubjectName(String name) {
		subjectName = name;
	}
	// 이렇게 만들어도되고
	// eclipse는 get, set 을 만들어주는 wizard가 존재!!
	// 마우스 우클릭 -> source -> Generate Getters and Setters

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSubjectName() {
		return subjectName;
	}

}
