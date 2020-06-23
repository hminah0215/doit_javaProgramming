package cooperation;

public class Subway {
	public String lineNumber; // 지하철노선번호
	public int passengerCount; // 승객수
	public int money; // 수입액

	public Subway(String lineNumber) { // 지하철 노선번호가 매개변수인 생성자
		this.lineNumber = lineNumber;
	}

	public void take(int money) { // 승객이 지하철을 타면
		this.money += money; // 수입 증가
		passengerCount++; // 승객수 증가
	}

	public void showInfo() // 지하철 정보출력
	{
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은  " + money + "원 입니다.");
	}

}
