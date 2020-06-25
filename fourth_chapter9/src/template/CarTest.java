package template;

public class CarTest {

	public static void main(String[] args) {

		System.out.println("=== 자율 주행 자동차 ===");
		Car myCar = new AICar();
		myCar.run();

		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}
	/*
			=== 자율 주행 자동차 ===
			시동 켬!
			자율주행 모드
			자동차가 알아서 방향을 전환합니다
			스스로 멈춥니다
			시동 끔!
			비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.
			=== 사람이 운전하는 자동차 ===
			시동 켬!
			사람이 운전합니다.
			사람이 핸들을 조작함
			브레이크로 정지!
			시동 끔!
			사람이 빠르기를 조절합니다.
	*/
}
