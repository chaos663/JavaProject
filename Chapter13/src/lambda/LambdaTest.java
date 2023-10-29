package lambda;

interface PrintString{
	
	void showString(String str);
};

public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
	showMyString(lambdaPrint);
	
	PrintString reStr = returnPrint();
	reStr.showString("Hello");
	
	}
	
	public static void showMyString(PrintString lambda) {
		lambda.showString("testt");
	};
	
	public static PrintString returnPrint() {
		return s -> System.out.println(s + " world");
	}
	
	

}
