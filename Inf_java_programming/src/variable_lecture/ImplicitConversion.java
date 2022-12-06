package variable_lecture;

public class ImplicitConversion {

	public static void main(String[] args) {
		// 묵시적 형 변환
		byte bNum = 10;
		int num = bNum;
		System.out.println(num);
		// 10출력

		long lNum = 10;
		float fNum = lNum;

		System.out.println(fNum);
		// 10.0출력

		double dNum = fNum + num;
		// num이 float로 먼저 형 변환이 일어나고, 계산된 후 double로 형 변환돼어서 최종 type은 double

		System.out.println(dNum);

		// 즉, 적은 수 -> 큰 수, 덜 정밀 -> 더 정밀한 수 로 형 병환은 묵시적으로 일어날 수 있다.
	}

}
