package gamelevel;

public class Player {
//09-3 템플릿메서드 응용하기 

	private PlayerLevel level; // player가 가지는 레벨 변수 선언
	
	// 처음생성시 초보레벨로 시작하며 레벨 메시지 출력
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	// 레벨변경 메소드로 현재 자신의 레벨을 매개변수로 받은 레벨로 변경하고 메시지출력
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	// 플레이어레벨의 템플릿 메서드 go()호출 
	public void play(int count) {
		level.go(count);
	}
}
