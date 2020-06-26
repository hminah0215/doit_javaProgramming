package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		// 새로운 회원 생성, 추가 
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// 전체회원 출력 
		memberArrayList.showAllMember();
		
		// 홍길동 멤버 삭제
		memberArrayList.removeMember(memberHong.getMemberId());
		
		// 홍길동 멤버삭제 후 전체회원 다시 출력 
		memberArrayList.showAllMember();
		
		// 412쪽 나혼자코딩, ArrayList의 특정 위치에 회원 추가하기
		memberArrayList.insertMember(memberHong, 1); // 1번째 자리에 홍길동 다시 추가됨
		memberArrayList.showAllMember();
	}
}
