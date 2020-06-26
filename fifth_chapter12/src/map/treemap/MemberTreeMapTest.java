package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		// 회원아이디 순서와 상관없이 회원을 추가해도 
		// key값인 회원 아이디를 기준으로 정렬됨 
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberSon = new Member(1002, "손민국");

		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);

		memberHashMap.showAllMember();
		
		// 키값이 1004인 회원 아이디 삭제 
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
