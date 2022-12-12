package cooperation;

public class TakeClass {

	public static void main(String[] args) {

		Student lee = new Student("이도영", 50000);
		Student kim = new Student("김건우", 80000);

		Bus bus100 = new Bus(100);
		lee.takeBus(bus100);
		lee.showInfo();
		bus100.showInfo();

		Subway subway2 = new Subway(2);
		kim.takeSubway(subway2);
		kim.showInfo();
		subway2.showInfo();

		Taxi kakao1 = new Taxi(1);
		kim.takeTaxi(kakao1);
		lee.takeTaxi(kakao1);
		kim.showInfo();
		lee.showInfo();
		kakao1.showInfo();

	}

}
