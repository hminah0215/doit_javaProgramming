package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달림.");

	}

	@Override
	public void jump() {
		System.out.println("Jump 못해.");
	}

	@Override
	public void turn() {
		System.out.println("Turn도 못해.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 완전 초보자 레벨 *****");
	}

}
