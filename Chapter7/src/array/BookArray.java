package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		// 책이 5권 만들어지는 것이 아니라, 책을 가리킬 주소값이 5개가 만들어진다.
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		// 이렇게 공간이 5개가 생겼으니 , new Book을 통해서 책을 한권한권 공간에 지정해줘야한다.

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		;

	}

}
