package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	// HashSet선언
	private HashSet<Member> hashSet;

	public MemberHashSet() {
		// HashSet 생성
		hashSet = new HashSet<Member>();
	}

	// HashSet에 회원추가
	public void addMember(Member member) {
		hashSet.add(member);
	}

	public boolean removeMember(int memberId) {

		// Iterator를 활용해 요소 순회
		Iterator<Member> ir = hashSet.iterator();

		// 회원이 있는 동안 회원의 아이디를 비교하여 같은아이디면 삭제
		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();

			if (tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
