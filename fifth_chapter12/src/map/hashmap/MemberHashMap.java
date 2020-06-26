package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	public void addMember(Member member) {
		// key, value 쌍으로 회원 추가
		hashMap.put(member.getMemberId(), member);

	}

	public boolean removeMember(int memberId) {

		// hashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
		// hashMap에서 회원을 삭제하는 메소드
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		// Iterator를 활용하여 전체 회원을 출력하는 메소드
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
