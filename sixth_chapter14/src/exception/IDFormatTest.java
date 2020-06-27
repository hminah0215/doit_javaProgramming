package exception;

public class IDFormatTest {

	private String userID;

	public String getUserID() {
		return userID;
	}

	// 아이디에 대한 제약 조건 구현
	public void setUserID(String userID) throws IDFormatException {

		if (userID == null) {
			throw new IDFormatException("아이디는 null 일 수 없음!");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자이상 20자 이하로 입력하세요");
		}

		this.userID = userID;
	}

	public static void main(String[] args) {

		IDFormatTest test = new IDFormatTest();

		// 아이디가 null인 경우
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

		// 아이디가 8자이상 20자 이하가 아닐경우
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
