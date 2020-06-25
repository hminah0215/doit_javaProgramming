package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("전화상담 할당방식을 선택하세요.");
		System.out.println("R :한명씩 차례로 할당");
		System.out.println("L : 쉬고있거나 대기가 가장적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객먼저 할당");
		// 326쪽 나혼자 코딩 추가
		System.out.println("A : 상담원이 상담 가져가기 ");

		int ch = System.in.read();
		Scheduler scheduler = null;

		if (ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		} else if (ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		} else {
			System.out.println("지원되지 않는 할당방식입니다. ");
			return;
		}

		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
