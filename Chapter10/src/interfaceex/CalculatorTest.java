package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
	
	int num1 = 10;
	int num2 = 2;
	//이 경우는 타입 상속을 받았다 라고 생각하면 된다.
	Calc calc = new CompleteCalc();
	System.out.println("더한 값은 "+calc.add(num1, num2)+" 입니다.");
	
	//default method 사
	calc.description();
	
	/*
	 static method test
	위에서 default method의 경우는 생성된 calc라는 인스턴스가 있어야 구현이 되었지만 
	아래 static method는 Calc에 정의했는데, 인스턴스 생성없이 바로 사용가능하다.
	*/
	 
	int[] arr = {1,2,3,4,5};
	int sum = Calc.total(arr);
	System.out.println("Array안의 숫자의 합은 "+sum+" 입니다.");
	};

}
