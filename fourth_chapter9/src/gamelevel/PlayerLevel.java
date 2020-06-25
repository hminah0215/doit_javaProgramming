package gamelevel;

public abstract class PlayerLevel {

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();
	
	// 재정의 하면 안되니까 final , 템플릿메소드
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
