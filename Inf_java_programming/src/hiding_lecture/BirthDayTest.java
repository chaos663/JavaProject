package hiding_lecture;

class BirthDay {

	private int day;
	private int month;
	private int year;

	// private,public ���� �������ε� private�� Ŭ���� �ȿ����� ���� ������!,public�� �ܺ� Ŭ�������� �� ���� ����!
	// ���� ���� �����ڸ� �Ⱦ��� �Ǹ� ex) int year; �̷��� ����ϸ� ���� package�������� ���� ����!
	// �׷��� ���� private �����������ε� ���� �������ְ� ������?! getter,setter�� ���� ��Ų��!
	// �����Ͱ� public�� ��� , ���Ἲ�� ������ �� �ִ�.
	public int getDay() {
		return day;
	}

	// �׷��� ������ ���εΰ� �ʿ��� ���� setter,getter�� ���ؼ� validate ���Ѽ� ������ �� �ְ� �Ѵ�.
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("��¥ �����Դϴ�.");
			} else {
				this.day = day;
			}
		}

	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {

		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

public class BirthDayTest {

	public static void main(String[] args) {

		BirthDay day = new BirthDay();
		day.setDay(30);
		day.setMonth(2);
		day.setYear(2022);

	}
}
