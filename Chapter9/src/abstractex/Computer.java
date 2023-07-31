package abstractex;

//abstarct class 추상 클래스
public abstract class Computer {

	// Method를 선언만 하기 -> 추상 메서드
	public abstract void display();

	public abstract void typing();

	// 추상 클래스를 만드는 이유 : 추상 클래스는 상속을 하기 위해서 만드는 클래스, 인스턴스화 될 수 없음
	public void turnon() {
		System.out.println("전원을 켭니다.");
	};

	public void turnoff() {
		System.out.println("전원을 끕니다.");
	};

}
