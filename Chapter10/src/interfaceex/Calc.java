package interfaceex;

//인터페이스로 정의 -> class가 아닌 -> class로 하면 abstract 사용 
//interface로 선언하면 내부의 method는 abstract가 된다. 
public interface Calc {
	
	//public static final로 선언이된다. 상수 
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//default method 사용,인터페이스에서 구현 코드를 가질 수 있는 method이다. default 빼면 오류남(인터페이스에서는
	// 구현코드를 가질 수 없기에)
	//인터페이스의 이 default method는 implement하는 다른 클래스에서 다 통용 될 수 있는 구현 method이어야 함!
	//하지만 만약 다른 클래스에서 해당 메소드에대해서 다르게 쓰려면 재정의 가능 
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
//		myMethod();
	};
	
	//static method(정적 메소드), 인스턴스의 생성과는 상관 없이 사용할 수 있다.
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		};
//		myStaticMethod();
		return total;
	};
// 그런데 이 private method가 java 8부터 지원 가능한데... 내가 1.8을 사용하고...있지
//	//private method의 구현
//	private void myMethod() {
//		System.out.println("private method입니다.");
//	};
//	//private static은 정적메서드에서 사용가능 
//	private static void myStaticMethod() {
//		System.out.println("private static method입니다.");
//	};
	
}
