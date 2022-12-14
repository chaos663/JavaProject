package singletonex;

public class Company {

	// instance라는 인스턴스를 단 하나만 사용하기위해서 static사용
	private static Company instance = new Company();

	// Constructor
	// private를 써서 외부에서 접근 불가
	private Company() {
	}

	// 객체를 생성하지않고 이 메서드 부르는 방법 static
	public static Company getInstance() {

		if (instance == null) {
			instance = new Company();
		}
		return instance;
	};

}
