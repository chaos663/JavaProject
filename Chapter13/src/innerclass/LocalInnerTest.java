package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	//method
	// 익명(Anonymous) innerclass 
	// 하나의 추상클래스나 하나의 인터페이스만 구현 가능.
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable 생성");
		}
	};
	public Runnable getRunnable(int i) {
		
		int localNum = 100;

		return new Runnable() {

			@Override
			public void run() {
				
			outNum += 10;
			System.out.println("outNum : "+outNum);
			System.out.println("sNum : "+sNum);
			System.out.println("localNum : "+localNum);
			System.out.println("i : " + i);				
			
			}
			
		};
			
	};
};


public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
//		outer.getRunnable().run();
		
		Runnable runnable = outer.getRunnable(100);
		runnable.run();
		
		outer.runnable.run();
		
	}

}
