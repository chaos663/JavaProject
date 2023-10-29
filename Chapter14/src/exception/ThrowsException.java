package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName,String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	};

	public static void main(String[] args) {
		//Exception을 throws로 미룰 수 있다?! 
		
		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		// 어떤 예외처리를 해야될지 모르겠다?? 그러면 최상위 Exception class를 제일 아래에 불러서 사용
		// 최상위 exception을 젤 위에 불러서 쓰지 말것! 다른 Excepton 사용 불가
		System.out.println("end");
	}

}
