package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x,y) -> (x >= y)? x : y;
		
		int max = maxNum.getMaxNumber(10, 20);
		
		System.out.println(max);
		
		MyNumber aaa = new MyNumber() {
			
			//anonymous innerclass 내부적으로 생성이 됨 
			
			@Override
			public int getMaxNumber(int num1, int num2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
