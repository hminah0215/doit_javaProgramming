package map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

//key값인 회원아이디는 Integer 형. Integer 클래스에는 Comparable 인터페이스가 구현
//되어 있으므로 별도로 인터페이스를 구현하지 않아도 됨  
public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}

	public void addMember(Member member) {
		// key-value 쌍으로 회원 추가
		treeMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {

		if (treeMap.containsKey(memberId)) {
			// key값에 맞는 자료 삭제
			treeMap.remove(memberId);
			return true;
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
