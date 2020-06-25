package gamelevel;

public class AdvancedLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("빨리달림.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 점프!");
	}

	@Override
	public void turn() {
		System.out.println("Turn은 아직 못해.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨! *****");
	}
}
