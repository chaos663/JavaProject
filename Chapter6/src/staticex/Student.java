package staticex;

public class Student {

	int studentID;
	String studentNameString;

	public Student() {

		serialNum++;

		studentID = serialNum;
	};

	private static int serialNum = 10000;

	public static int getSerialNum() {

		// static변수안의 변수는 지역변수!! 이 메서드가 호출 될 때 생성되고, 메서드가 종료되면 없어진다.
		int i = 10;

		i++;
		System.out.println(i);

//		studentName = "가나다"; // 멤버변수,인스턴스변수
		// 이렇게 멤버변수를 안에서 사용할 수 없다. 왜냐하면, 생성되지도 않은 인스턴스 변수를 static 메모리 단에서 사용하려고 하니 오류가 날
		// 수 밖에...

		return serialNum; // static변수,클래스 변수
	}

}
