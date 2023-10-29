package exception;

public class IDFormatException extends Exception{
	
	public IDFormatException(String message) {
		super(message);
	};
	//예외 발생 조건(임의) : 아이디값이 null이거나 8자 이하 20자 이상인 경우
	

}
