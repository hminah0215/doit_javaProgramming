package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			
			// java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
			System.out.println(e); // 예외클래스의 toString()메소드 호출
			
//			e.printStackTrace();
		}
		System.out.println("여기도 수행됩니다.");
	}
}
