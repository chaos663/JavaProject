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
	// �̷��� �����ǰ�
	// eclipse�� get, set �� ������ִ� wizard�� ����!!
	// ���콺 ��Ŭ�� -> source -> Generate Getters and Setters

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
