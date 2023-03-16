package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("�¹���0", "������0");
		bookArray1[1] = new Book("�¹���1", "������1");
		bookArray1[2] = new Book("�¹���2", "������2");

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();

		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		;

//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

		System.out.println("--------����� bookArray2");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		;

//		bookArray1[0].setBookName("�����¹���1");
//		bookArray1[0].setAuthor("����������1");
//
//		System.out.println("---------- ���� --------------");
//
//		for (int i = 0; i < bookArray1.length; i++) {
//			bookArray1[i].showBookInfo();
//		}
//		;
//		for (int i = 0; i < bookArray2.length; i++) {
//			bookArray2[i].showBookInfo();
//		}
//		;
		// bookArray2�� 0��° ���� �ٲ��µ�, �� 2���ٲ��ĸ�, �ּҰ��� ����Ǿ� �ֱ⶧���� ���ϴ� �ּҰ��� ���� �������ԵǴ� ��
		// ===��������

		// ���� ���縦 ���ؼ��� �ν��Ͻ��� ���� ������� �� �����ؾ�, ���� �ּ� ���� ���ϴ� ���� �ƴ� �ٸ��� ������ �� �ִ�.

		bookArray1[0].setBookName("�����¹���1");
		bookArray1[0].setAuthor("����������1");

		System.out.println("---------- ���� --------------");

		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		;
		System.out.println("---------���� ������ bookArray2 �ν��Ͻ�-------");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		;

		String[] StrArr = { "Java", "Android", "C", "Kotlin" };

		// ���� for��
		System.out.println("----- ���� for�� String ------");
		for (String s : StrArr) {
			System.out.println(s);
		}
		;

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("------���� for�� Int-----");
		for (int num : arr) { // num === arr[i], arr�� ��� �ϳ��ϳ��� num�� ���鼭 ��ȸ
			System.out.println(num);
		}
		;

	}

}
