package operator_lecture;

public class OperationEx5 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;

		int result = num1 & num2;
		System.out.println(result);

		// 1비트 이동은 *2랑 같음
		int num3 = 5; // 000000101;
		System.out.println(num3 << 1);
		System.out.println(num3 << 2);
		System.out.println(num3 << 3);

		System.out.println(num3 >> 1); // 00000010

	}

}
