package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		/*
		 * ArrayList���� ����ϰ� ���Ǵ� Method���� �ִµ�, boolean add(E e) -> ��� �ϳ��� �迭�� �߰�. E�� �����
		 * �ڷ����� �ǹ� int size() -> �迭�� �߰��� ��� ��ü ������ ��ȯ E get(int index) -> �迭�� index��ġ��
		 * �ִ� ��� ���� ��ȯ E remove(int index) -> �迭�� index��ġ�� �ִ� ����� ���� �����ϰ� �� ���� ��ȯ
		 * boolean isEmpty() -> �迭�� ��� �ִ��� Ȯ���ϰ� ��� ������ True ������������� False�� ��ȯ
		 */

		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		System.out.println("------------���1-----------------");

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("------------���2-----------------");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			// System.out.println(list[i]); -> arraylist�� �̷��� ��� ����, ����Ϸ��� �迭�� ���� ������ �Ϳ���
			// ���! list.get(index)�� ���!
		}
		;

	}

}
