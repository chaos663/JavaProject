package string;

public class StringBuilderTest {

	public static void main(String[] args) {

		//String 인스턴스 생성 
		String str1 = new String("Java");
		
		System.out.println(System.identityHashCode(str1));
		
		//StringBuilder로 buffer 인스턴스 생성 -> gabage 안생김, 멀티스레드의 경우 StringBuffer사용! 이렇게 문자열을 합친 후에 
		//String클래스로 인스턴스 생성하여 힙메모리에 넣으면 된다.
		StringBuilder buffer = new StringBuilder(str1);
		
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		
		//toString으로 인스턴스 생성 !! 주소값은 바뀌지요~~ str2라고 String 인스턴스가 힙 메모리에 들어감(새로운 주소값)
		String str2 = buffer.toString();
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		
		
		// int 는 4바이트 자료형, Integer는 class다 원래! 옛날에는 그냥 연산이 안됐는데, autoboxing과 unboxing이 일어나서 연산이 된다.
		// 자바 9 이후로는 deprecated!
		Integer i = new Integer(100);
		
		Integer j = 100;
		// 앞으로는 이렇게 바로 Integer 객체를 생성할 수 있다.
		
		
		
	}

}
