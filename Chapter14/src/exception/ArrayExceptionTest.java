package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			};
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			return;
			//return 해도 finally 구문이 실행 된다! 
		} finally {
			System.out.println("finally");
		};
		//finally는 맨 마지막 정리 구문
		//finally는 try cathch 구문이 실행이되면 정의 해두면 무조건 실행됨!!
		System.out.println("end");
		
	}

}
