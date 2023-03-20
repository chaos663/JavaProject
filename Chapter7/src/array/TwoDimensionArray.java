package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

//		int[][] arr = new int[2][3];
//		System.out.println(arr.length);
//		// 길이는 행의 길이를 말한다고 보면된다. 2행이니깐 2
//
//		System.out.println(arr[0].length);
//		// 0행의 배열의 길이는 3열이니깐 3이 나올 것
//		System.out.println(arr[1].length);

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(i + "행" + " " + j + "열의 값은  = " + arr[i][j] + " " + "입니다.");
			}
			;
		}
		;

		char[][] alphabets = new char[13][2];
		char ch = 'A';

		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < alphabets[i].length; j++, ch++) {
				alphabets[i][j] = ch;
				System.out.println(alphabets[i][j]);
			}
			;
		}
		;
	}

}
