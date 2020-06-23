package cooperation;

public class Bus {
	int busNumber; // 버스번호
	int passengerCount; // 승객수
	int money; // 버스수입

	public Bus(int busNumebr) // 버스번호가 매개변수인 생성자
	{
		this.busNumber = busNumebr;
	}

	public void take(int money) // 승객이 버스에 탄 경우를 나타낸 메소드
	{
		this.money += money; // 승객이 타면 버스수입 증가
		passengerCount++; // 승객이 타면 승객수 증가
	}

	public void showInfo() { // 버스정보 출력
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}

}
