package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;

		data[0] = 10.0; // ù ��° ��ҿ� �� 10.0 ���� size
		data[1] = 20.0; // �� ��° ��ҿ� �� 20.0 ����
		data[2] = 30.0; // �� ��° ��ҿ� �� 30.0 ����

		double total = 0.0;

		for (int i = 0; i < 3; i++) {

			total *= data[i];
		}

		System.out.println(total);
	}

}
