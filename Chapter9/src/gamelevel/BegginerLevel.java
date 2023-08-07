package gamelevel;

public class BegginerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프를 못해!");
	}

	@Override
	public void turn() {
		System.out.println("Turn도 못해요!!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****초보자 레벨 입니다***");
	}

}
