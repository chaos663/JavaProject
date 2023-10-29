package lambda;


@FunctionalInterface
public interface MyNumber {
	
	// lambda식을 위한 함수형 인터페이스는 method를 하나만 선언해야함
	int getMaxNumber(int num1, int num2);

}
