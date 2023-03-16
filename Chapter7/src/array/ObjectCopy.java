package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백이0", "조정래0");
		bookArray1[1] = new Book("태백이1", "조정래1");
		bookArray1[2] = new Book("태백이2", "조정래2");

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();

		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		;

//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

		System.out.println("--------복사된 bookArray2");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		;

//		bookArray1[0].setBookName("수정태백이1");
//		bookArray1[0].setAuthor("수정조정래1");
//
//		System.out.println("---------- 수정 --------------");
//
//		for (int i = 0; i < bookArray1.length; i++) {
//			bookArray1[i].showBookInfo();
//		}
//		;
//		for (int i = 0; i < bookArray2.length; i++) {
//			bookArray2[i].showBookInfo();
//		}
//		;
		// bookArray2의 0번째 값도 바꼈는데, 왜 2가바꼈냐면, 주소값만 복사되어 있기때문에 향하는 주소값의 값을 가져오게되는 것
		// ===얕은복사

		// 깊은 복사를 위해서는 인스턴스를 새로 만들어준 후 복사해야, 같은 주소 값을 향하는 것이 아닌 다르게 관리할 수 있다.

		bookArray1[0].setBookName("수정태백이1");
		bookArray1[0].setAuthor("수정조정래1");

		System.out.println("---------- 수정 --------------");

		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		;
		System.out.println("---------새로 생성된 bookArray2 인스턴스-------");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		;

		String[] StrArr = { "Java", "Android", "C", "Kotlin" };

		// 향상된 for문
		System.out.println("----- 향상된 for문 String ------");
		for (String s : StrArr) {
			System.out.println(s);
		}
		;

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("------향상된 for문 Int-----");
		for (int num : arr) { // num === arr[i], arr의 요소 하나하나씩 num에 들어가면서 순회
			System.out.println(num);
		}
		;

	}

}
