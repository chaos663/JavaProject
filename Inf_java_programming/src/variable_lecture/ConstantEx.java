package variable_lecture;

public class ConstantEx {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		// 변수 타입 앞에 final을 붙이면 이 변수는 수정할 수 없음을 의미한다. 값도 변경 불가하다.
		final float PI = 3.14f;

		final int STUDENT_NUM = 70;
		int num = 0;
		if (num == STUDENT_NUM) {
		}
		;
		System.out.println(STUDENT_NUM);
	}

}
