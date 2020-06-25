package scheduler;

// 현재 상담업무가 없거나 상담대기가 적은 상담원에게 배분 
public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("대기열에서 상담전화를 순서대로 가져옵니다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담없무가 없거내 상담대기가 가장적은 상담원에게 할당합니다.");

	}

}
