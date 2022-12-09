package hiding_lecture;

class BirthDay {

	private int day;
	private int month;
	private int year;

	// private,public 접근 제어자인데 private는 클래스 안에서만 접근 가능함!,public은 외부 클래스에서 다 접근 가능!
	// 만약 접근 제어자를 안쓰게 되면 ex) int year; 이렇게 사용하면 같은 package내에서만 접근 가능!
	// 그래서 만약 private 접근제어자인데 값을 세팅해주고 싶으면?! getter,setter로 접근 시킨다!
	// 데이터가 public일 경우 , 무결성이 무너질 수 있다.
	public int getDay() {
		return day;
	}

	// 그래서 변수를 감싸두고 필요한 것은 setter,getter를 통해서 validate 시켜서 수정할 수 있게 한다.
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
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
