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

}
