package variable_lecture;

public class ExplicitConversion {

	public static void main(String[] args) {

		// ����� �� ��ȯ

		int iNum = 1000;
//		byte bNum = iNum; >> ��������.
		byte bNum = (byte) iNum;
//		System.out.println(iNum);
//		System.out.println(bNum);
		// 1000�� byte���� ���ϱ� bNum�� ����غ��� , 1000�� �ƴϰ� -24�� ����� �ȴ�.byte(-128~127����)
		// ���� int ���� 1000�� 4����Ʈ �� 1����Ʈ�� �����ͼ� ������ �ֱ� ������ ������ ���(������ ����)
		double dNum = 3.14;
		iNum = (int) dNum;
//		System.out.println(iNum);
		// 3�� ����̵Ǵµ� double type�� ��������� int�� �ٲٰ� �Ǹ� �Ҽ��� ���ϰ� ������
		// �̷��� ������ ���� ���� ����ϸ� �ȴ�.
		float fNum = 0.9F;

		int num1 = (int) dNum + (int) fNum;
		int num2 = (int) (dNum + fNum);
		System.out.println(num1);
		System.err.println(num2);
		// truncate�ȴٰ� �ϰ� , ���ǵȴٰ� �Ѵ�.
	}

}
