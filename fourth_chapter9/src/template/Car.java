package template;

public abstract class Car {

	public abstract void drive();

	public abstract void stop();
	
	// 295쪽 나혼자 코딩, wiper() 추상메서드 추가 
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동 켬!");
	}

	public void turnOff() {
		System.out.println("시동 끔!");
	}
	
	// 템플릿 메서드 
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		wiper();
	}

	


}
