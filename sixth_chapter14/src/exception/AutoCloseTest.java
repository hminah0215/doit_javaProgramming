package exception;

public class AutoCloseTest {

	public static void main(String[] args) {

//		try (AutoCloseObj obj = new AutoCloseObj()) {
//
//		} catch (Exception e) {
//			System.out.println("예외부분입니다.");
//		}

		// 위처럼도 했었지만 자바 9 부터는 try문의 괄호안에서 외부에서 선언한 변수를 쓸 수 있다.

		AutoCloseObj obj = new AutoCloseObj();
		try (obj) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외부분입니다.");
		}
	}
	// 리소스가 close() 되었습니다.
}
