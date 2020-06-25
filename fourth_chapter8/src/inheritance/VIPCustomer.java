package inheritance;

public class VIPCustomer extends Customer {

	private int agentID; // VIP고객 담당 상담원 아이디
	double saleRatio; // 할인율

	public VIPCustomer() {
		customerGrade = "VIP"; // 고객등급
		bonusRatio = 0.05; // 보너스적립율
		saleRatio = 0.1; // 할인율
//		System.out.println("VIPCustomer() 생성자 호출");
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String,int) 생성자 호출");
	}

	// 재정의한 메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 적립
		return price - (int) (price * saleRatio); // 할인율 적용하여 반환
	}

	public int getAgentID() {
		return agentID;
	}

}
