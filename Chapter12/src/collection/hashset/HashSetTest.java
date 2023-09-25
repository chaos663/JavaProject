package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		//set은 중복돼서 나오지 않는다.
		
		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		System.out.println(b1);
		
		
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
	
		boolean b = set.add("aaa");
		
		System.out.println(b);
	}

}
