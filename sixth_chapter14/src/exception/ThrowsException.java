package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
															// 두 예외를 메서드가 호출될때 처리하도록 미룸
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		// FileNotFoundException 발생가능
		FileInputStream fis = new FileInputStream(fileName);

		// ClassNotFoundException 발생가능
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		try {
			// 메소드를 호출할때 예외를 처리함 
			test.loadClass("a.txt", "java.lang.String");
		
			// 각 예외 상황마다 다른 방식으로 처리함 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) { // 다중예외처리 
			// 어떤 예외가 발생할지 미리 알 수 없지만 모든 예외상황을 처리하고자 한다면 
			// 맨 마지막 부분에 Exception 클래스를 활용하여 catch 블록 추가 
			e.printStackTrace();
		}
	}
}