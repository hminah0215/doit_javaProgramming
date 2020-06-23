package singleton;

// 196쪽 나혼자 코딩! 싱글톤 패턴으로 클래스 구현 연습하기
public class Car {
	private static int serialNum = 10000;	// 자동차 번호가 10001 부터 시작되니 고유번호는 1만
	private int carNum;
	
	public Car() {	// 자동차가 만들어지면 고유번호를 증가, 그 고유번호가 차 번호가 된다 
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
