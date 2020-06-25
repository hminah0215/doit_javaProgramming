package scheduler;

//상담원 한명씩 돌아가며 동일하게 상담 업무배분 
public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("대기열에서 상담전화를 순서대로 가져옵니다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음순서 상담원에게 배분합니다.");

	}

}
