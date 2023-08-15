package interfaceex2;

public class MyClass implements MyInterface{

	//MyInterface가 상속받은 x
	@Override
	public void x() {
		
		System.out.println("x()");
		
	}
	
	//MyInterface가 상속받은 y
	@Override
	public void y() {
		
		System.out.println("y()");
		
	}
	//인터페이스간 상속이 일어날 경우 class는 상속 받은 method들도 구현할 의무가 있다.

	@Override
	public void myMethod() {
		
		System.out.println("myMethod()");
		
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		
	};

}
