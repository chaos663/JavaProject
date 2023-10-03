package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet tree = new TreeSet<String>();

		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");

		System.out.println(tree);
		// 정렬이 되어서 나오는데 그 이유는 TreeSet 클래스 들어가보면 Comparable이 이미 구현되어 있음
	}

}
