package interfaceex;

public abstract class Calculator implements Calc {
	//인터페이스 implements 자바에서 타입상속이라고 한다.

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}



}
