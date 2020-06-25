package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		
		// 처음생성시는 비기너레벨 
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}
	
	/*
		***** 완전 초보자 레벨 *****
		천천히 달림.
		Jump 못해.
		Turn도 못해.
		***** 중급자 레벨! *****
		빨리달림.
		높이 점프!
		높이 점프!
		Turn은 아직 못해.
		***** 고급자 레벨! *****
		엄청 빨리달린닷!
		완전 높게 점프!
		완전 높게 점프!
		완전 높게 점프!
		한바퀴 돈다~
	 */
}
