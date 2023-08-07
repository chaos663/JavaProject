package template;

public abstract class Car {
	
	//상속 받은 하위 클래스에서는 상위 추상 클래스를 구현할 의무가 있다.
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	//Hook 메소드라고 하는데, 구현 코드가 없다. 하위 클래스에서 오버라이딩해서 재정의를 하여 사용할 수 있다. 하위 클래스에서 구현할 의무는 없다.
	public void washCar() {
		
	};
	
	public void turnOn() {
		System.out.println("차의 시동을 켭니다.");
	};
	
	public void turnOff() {
		System.out.println("차의 시동을 끕니다.");
	};
	
	//template method == 일련의 과정을 시나리오로 만들어 놓은 것!! 바뀌면 안되는 것!
	final public void run() {
		turnOn();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	};
}
