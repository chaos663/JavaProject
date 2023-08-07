package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
	
	int num1 = 10;
	int num2 = 2;
	//이 경우는 타입 상속을 받았다 라고 생각하면 된다.
	Calc calc = new CompleteCalc();
	System.out.println("더한 값은 "+calc.add(num1, num2)+" 입니다.");
	}

}
