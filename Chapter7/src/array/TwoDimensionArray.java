package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

//		int[][] arr = new int[2][3];
//		System.out.println(arr.length);
//		// ���̴� ���� ���̸� ���Ѵٰ� ����ȴ�. 2���̴ϱ� 2
//
//		System.out.println(arr[0].length);
//		// 0���� �迭�� ���̴� 3���̴ϱ� 3�� ���� ��
//		System.out.println(arr[1].length);

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(i + "��" + " " + j + "���� ����  = " + arr[i][j] + " " + "�Դϴ�.");
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
