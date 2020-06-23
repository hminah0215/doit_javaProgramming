package singleton;

//196쪽 나혼자 코딩! 싱글톤 패턴으로 클래스 구현 연습하기
public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
