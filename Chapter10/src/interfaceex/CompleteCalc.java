package interfaceex;

public class CompleteCalc extends Calculator{
	// 자바에class extends는 구현 상속이라고 한다.

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
		return num1 / num2;
		};
		return ERROR;
	}
	public void showInfo() {
		System.out.println("Calc Interface를 구현하였습니다.");
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기 입니다.");
	};
	
	

}
