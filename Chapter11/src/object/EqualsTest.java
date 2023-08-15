package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	//주소값이 달라도 비교되는 두 학생의 studentID가 같으면 true를 반환하기 위해 equals method를 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) return true;
			else 
				return false;
		};
		return false;
	};
	
	public int hashCode() {
		return studentID;
	};
	
	/*자바에서 equals를 재정의 해줬을 때 hashcode도 재정의 해줘야함. equals로 논리적으로 같으면
	hashcode 또한 같게 나와야
	*/
	
	
};
public class EqualsTest {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		//연산자 == 을 통해서 str1, str2의 주소값이 같으면 true 그렇지 않으면 false를 반환
		System.out.println(str1==str2);
		//equals 메서드는 우선 주소값 같은지 체크 ! 논리적으로 같은 문자열이면 true 반환
		System.out.println(str1.equals(str2));
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		//hashcode 출력 해보기 -> 주소값 반환 
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
