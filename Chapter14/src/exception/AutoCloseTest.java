package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
			//throw는 exception을 강제로 발생시킬 때 사용 ! 
			throw new Exception();
			
		} catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
