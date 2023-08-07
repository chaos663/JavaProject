package gamelevel;

public class Player {
	
	private PlayerLevel level;
	
	public Player() {
		level = new BegginerLevel();
		//레벨이 바뀔 때 마다 레벨을 표
		level.showLevelMessage();
	};

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		
		level.go(count);
	};
	
	

}
