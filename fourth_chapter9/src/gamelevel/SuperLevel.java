package gamelevel;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("엄청 빨리달린닷!");

	}

	@Override
	public void jump() {
		System.out.println("완전 높게 점프!");
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돈다~");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨! *****");
	}

}
