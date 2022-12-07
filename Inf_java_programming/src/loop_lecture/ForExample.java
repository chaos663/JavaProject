package loop_lecture;

public class ForExample {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		for (num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1~10까지의 합은" + sum + "입니다.");
	}
}
