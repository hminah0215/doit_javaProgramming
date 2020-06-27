package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			if (fis != null) {
				try {
					// 파일 입력 스트림 닫기
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally는 항상 수행됩니당");
		}
		System.out.println("여기도 수행됨? ");
	}
	
//	java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
//	finally는 항상 수행됩니당

}
