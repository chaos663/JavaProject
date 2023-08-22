package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class strClass = Class.forName("java.lang.String");
		
		//컨스트럭터 가져오
		Constructor[] cons = strClass.getConstructors();
		
		//for문으로 컨스트럭터 정보 뽑아보기 
		for(Constructor c:cons) {
			System.out.println(c);
		};
		
		Field[] fields = strClass.getFields();
		
		for(Field f: fields) {
			System.out.println(f);
		};
		
		Method[] methods = strClass.getMethods();
		for(Method m:methods) {
			System.out.println(m);
		};
		
	}

}
