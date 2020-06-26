package collection;

// 434쪽, Comparable 인터페이스 구현 추가 
public class Member implements Comparable<Member> {

	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름

	public Member(int memberId, String memberName) { // ������
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() { 
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() { 
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;	// 회원아이디 반환하도록 재정의
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			
			// 매개변수로 받은 회원아이디가 자신의 회원 아이디와 같으면 true 반환 
			if (this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	//Comparable  인터페이스에 포함된 메소드 재정의  
	@Override
	public int compareTo(Member member) {
		
		// 추가한 회원아이디와 매개변수로 받은 회원 아이디를 비교함  
		// 두값을 비교하여 새로 추가한 회원 아이디가 더 크면 양수,
		// 그렇지 않으면 음수, 같으면 0을 반환
		// 그러면 출력결과값은 오름차순으로 정렬됨!  
		// return (this.memberId - member.memberId) * -1 하면 내림차순으로 정렬 
		return (this.memberId - member.memberId); 
		
	}
}
