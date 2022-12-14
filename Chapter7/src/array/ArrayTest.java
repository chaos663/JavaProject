package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] numbers = new int[] { 0, 1, 2 };
		// int[] numbers = { 0, 1, 2 }; 처럼 써도 된다.
		// 배열 초기화
		int[] numbers2 = new int[3];

		int[] numbers3;

		numbers3 = new int[3];

		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		System.out.println(numbers.length);
		System.out.println(numbers3.length);

		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}

	}

}
