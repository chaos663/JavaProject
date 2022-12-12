package thisex;

class Person {
	String name;
	int age;

	public Person() {
//		int i = 0;
		// 그래서 이 앞에는 아무 statement도 못옴!
		this("이름없음", 1);
		// 이렇게 다른 constructor을 호출하여 사용할 때는 앞에 어떠한 statement(문장)도 올 수 없다.! 이 this가 가장 먼저
		// 나오는 statement!
	}
	// 이 디폴트 생성자는 파라미터를 받는 생성자를 상속 받아서 사용할 수 있다. == constructor overloading

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Person returnSelf() {
		return this;
		// 반환하는 것은 현재 인식되어있는 instance의 주소 값

	}

}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
	}
}
