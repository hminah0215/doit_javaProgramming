package scheduler;

// 고객등급이 높은 고객의 전화부터 대기열에서 가져와 업무능력이 높은 상담원에게 우선배분
public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 전화를 먼저 가져옵니다!");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무능력이 높은 상담원에게 우선적으로 배분합니다.");
		
	}
}
