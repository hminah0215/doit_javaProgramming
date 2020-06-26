package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member; //Member 클래스는 collection 패키지에 있으므로 임포트! 

public class MemberArrayList {

	private ArrayList<Member> arrayList; // ArrayList 선언

	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); // Member형으로 ArrayList 생성
	}

	public void addMember(Member member) { // ArrayList에 회원추가
		arrayList.add(member);
	}

	// 412쪽 나혼자 코딩 ArrayList의 특정 위치에 회원 추가하기
	public void insertMember(Member member, int position) {
		if (position < 0 || position > arrayList.size() + 1) {
			System.out.println("지정 된 자리에 추가할 수 없습니다");
			return;
		}
		arrayList.add(position - 1, member);
	}

	// 해당 아이디를 가진 회원을 ArrayList에서 찾아 제거
	public boolean removeMember(int memberId) {

		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();

			// 회원아이디와 매개변수가 일치하면 해당 회원을 삭제
			if (tempId == memberId) {
				arrayList.remove(i);
				return true; // true 반환
			}
		}
		// 422쪽 iterator
		Iterator<Member> ir = arrayList.iterator();

		while (ir.hasNext()) { // 요소가 있는동안
			Member member = ir.next(); // 다음 회원을 반환받음
			int tempId = member.getMemberId();

			// 회원아이디와 매개변수가 일치하면 해당 회원을 삭제
			if (tempId == memberId) {
				arrayList.remove(member);
				return true; // true 반환
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
