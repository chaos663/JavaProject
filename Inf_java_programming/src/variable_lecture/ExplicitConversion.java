package variable_lecture;

public class ExplicitConversion {

	public static void main(String[] args) {

		// 명시적 형 변환

		int iNum = 1000;
//		byte bNum = iNum; >> 오류난다.
		byte bNum = (byte) iNum;
//		System.out.println(iNum);
//		System.out.println(bNum);
		// 1000이 byte형에 들어가니깐 bNum을 출력해보면 , 1000이 아니고 -24가 출력이 된다.byte(-128~127까지)
		// 기존 int 였던 1000의 4바이트 중 1바이트만 가져와서 변수에 넣기 때문에 저렇게 출력(데이터 유실)
		double dNum = 3.14;
		iNum = (int) dNum;
//		System.out.println(iNum);
		// 3이 출력이되는데 double type이 명시적으로 int로 바꾸게 되면 소숫점 이하가 없어짐
		// 이렇게 날리고 싶을 때는 사용하면 된다.
		float fNum = 0.9F;

		int num1 = (int) dNum + (int) fNum;
		int num2 = (int) (dNum + fNum);
		System.out.println(num1);
		System.err.println(num2);
		// truncate된다고 하고 , 유실된다고도 한다.
	}

}
