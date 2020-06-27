package exception;

public class PasswordTest {
	
	private String password;

	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) throws PassWordException {

		if (password == null) {
			throw new PassWordException("비밀번호는 null 일 수 없습니다!");
		} else if (password.length() < 5) {
			throw new PassWordException("비밀번호는 5자 이상이어야 합니다!");
		} else if (password.matches("[a-zA-Z]+")) {
			throw new PassWordException("비밀번호는 숫자를 포함해야 합니다.");
		}

		this.password = password;
	}

	public static void main(String[] args) {

		PasswordTest test = new PasswordTest();
		
		// 비번이 null 
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		// 비번이 5자 미만
		password = "abcd";
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		// 비번에 숫자가 들어가야함
		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		// 오류 없음 
		password = "abcde123";
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
	}
}
