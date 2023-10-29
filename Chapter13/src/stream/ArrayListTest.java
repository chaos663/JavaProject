package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		
		stream.forEach(s->System.out.println(s));
		
		Stream<String> stream2 = sList.stream();
		
		long sCount = stream2.count();
		
		System.out.println(sCount);
		
		//sorted()는 중간연산자 , foreach->최종연산자 
		sList.stream().sorted().forEach(s->System.out.println(s));
	
		
	}

}
