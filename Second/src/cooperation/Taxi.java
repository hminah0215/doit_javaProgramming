package cooperation;

public class Taxi {
	// 180쪽, 나혼자코딩! 택시타는 과정을 추가로 구현할것

	String taxiCompany; // 택시회사
	int money; // 택시의 수입

	public Taxi(String taxiCompany) // 택시 회사 이름을 매개변수로 갖는 생성자
	{
		this.taxiCompany = taxiCompany;
	}

	public void take(int money) // 승객이 택시를 탑승하면
	{
		this.money += money; // 택시의 수입 증가

	}

	public void showInfo() { // 택시 정보 출력
		System.out.println(taxiCompany + " 택시 수입은 " + money + "원 입니다.");
	}

}
