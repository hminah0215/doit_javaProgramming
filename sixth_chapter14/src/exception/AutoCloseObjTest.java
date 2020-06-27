package exception;

public class AutoCloseObjTest {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()){
			
			// 강제로 예외 발생 시켜  catch문 수행 
			throw new Exception();
		}catch (Exception e) {
			System.out.println("예외부분입니다.");
		}
	}
}
