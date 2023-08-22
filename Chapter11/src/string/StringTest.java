package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//힙메모리에 생성된 str1, st2의 주소 값은 다를 것이다.
		System.out.println(str1 ==str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);
		// 상수 풀에 생성된 abc의 주소값을 가리키는 str3,str4의 주소값은 같을 것이다. 
		
		/*
		 * StringBuilder, StringBuffer 사용하기
		 * 이 클래스를 사용하게 되면 좋은 점이 있다.®
		 * 내부에서 가변적인 char[]를 가지고 있음. 문자열을 여러 번 열결할 때나 변경할 때 유용함
		 * 매번 새로 생성하지않고 기존 배열을 변경하므로 gabage가 생기지 않음 
		 * str3 = str3.concat(str4)와 같이 문자열을 합치면 새로 인스턴스가 생기고 str3는 새로 생긴 인스턴스를 향하게 되어있음(이전 꺼는 gabage)
			StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(Syncronization)을 보장
		* 동기화란 : 멀티 쓰레드가 있을 때 쓰레드간의 순서를 보장해주는 것 (리소스 접근할 때 순차적으로 접근) 
			단일 쓰레드 프로그램에서는 StringBuilder를 사용하기를 권장
			toString() method로 String 반환 
		 */
	}

}
