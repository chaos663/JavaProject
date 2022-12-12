package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;

	public Student(String studentName, int money) {

		this.studentName = studentName;
		this.money = money;
	}

	// 객체의 협업이 일어나는 부분
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}

	public void takeSubway(Subway subway) {

		subway.take(1500);
		money -= 1500;
	}

	public void takeTaxi(Taxi taxi) {

		taxi.take(3800);
		money -= 3800;
	}

	public void showInfo() {

		System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다.");
	}

}
