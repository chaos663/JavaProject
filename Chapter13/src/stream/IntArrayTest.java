package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		
		int sum = Arrays.stream(arr).sum();
		
		System.out.println(sum);
		
		// 위 만들어진 stream은 소모되고나면 다시 연산으로 사용할 수 없어서 다시 사용하고 싶으면
		//재생성 해야한다.
	}

}
