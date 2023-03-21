package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		/*
		 * ArrayList에서 빈번하게 사용되는 Method들이 있는데, boolean add(E e) -> 요소 하나를 배열에 추가. E는 요소의
		 * 자료형을 의미 int size() -> 배열에 추가된 요소 전체 개수를 반환 E get(int index) -> 배열의 index위치에
		 * 있는 요소 값을 반환 E remove(int index) -> 배열의 index위치에 있는 요소의 값을 제거하고 그 값을 반환
		 * boolean isEmpty() -> 배열이 비어 있는지 확인하고 비어 있으면 True 비어있지않으면 False를 반환
		 */

		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		System.out.println("------------출력1-----------------");

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("------------출력2-----------------");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			// System.out.println(list[i]); -> arraylist는 이렇게 사용 못함, 사용하려면 배열을 직접 선언한 것에만
			// 사용! list.get(index)를 사용!
		}
		;

	}

}
