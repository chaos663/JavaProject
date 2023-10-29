package innerclass;

import java.util.ArrayList;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	private ArrayList list;
	
	public OutClass() {
		inClass = new InClass();
	};
	
	private class InClass{
		//innerClass이다.
		//innerclass 에서는 static 변수, static method를 사용 할 수 없음.
		// 보통 innerclass는 private로 밖에서 못보게 함
		int inNum = 200;
	
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		};
	}
	public void usingInTest() {
		inClass.inTest();
	};
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10;
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sNum);
		};
		static void sTest() {
			System.out.println(sNum);
			System.out.println(sInNum);
		};
	};
};


public class InnerTest {

	public static void main(String[] args) {
		/*
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		*/
		OutClass.InStaticClass.sTest();
	}

}
