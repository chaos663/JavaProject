package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;

		data[0] = 10.0;
		size++; // ù ��° ��ҿ� �� 10.0 ���� size�� �ϳ��� ����
		data[1] = 20.0;
		size++;// �� ��° ��ҿ� �� 20.0 ����
		data[2] = 30.0;
		size++;// �� ��° ��ҿ� �� 30.0 ����

		double total = 1;
		// length�� ����ϸ� 0.0�̳���..
		for (int i = 0; i < size; i++) {
			System.out.println(data[i]);
			total *= data[i];
		}

		System.out.println("total=" + total);
	}

}
