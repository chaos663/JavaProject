package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// Class 클래스 -> reflection 프로그래밍에서 사용 
		/* 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일로 생
		 * class 파일에는 객체의 정보(멤버변수, 메서드, 생성자등)가 포함되어 있음
		 * Class 클래스는 컴파일된 class 파일에서 객체의 정보를 가져올 수 있음
		 * Class.ForName() method는 꼭 알자! 클래스 이름을 String으로 가져와서 Class 메모리에 올리는 메서드! 동적로딩을 함  
		 * */
		 
		Person person = new Person();
		
		
		//Class 클래스 가져오는 방법 3가지
		
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		Person p = new Person();
		Person p2 = (Person)pClass3.newInstance();
		System.out.println(p);
		System.out.println(p2);
		
		
		
	}

}
