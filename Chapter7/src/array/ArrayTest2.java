package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;

		data[0] = 10.0;
		size++; // 첫 번째 요소에 값 10.0 대입 size는 하나씩 증가
		data[1] = 20.0;
		size++;// 두 번째 요소에 값 20.0 대입
		data[2] = 30.0;
		size++;// 세 번째 요소에 값 30.0 대입

		double total = 1;
		// length로 사용하면 0.0이나옴..
		for (int i = 0; i < size; i++) {
			System.out.println(data[i]);
			total *= data[i];
		}

		System.out.println("total=" + total);
	}

}
