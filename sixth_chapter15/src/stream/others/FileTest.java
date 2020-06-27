package stream.others;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// 해당 경로에 File클래스 생성, 아직 실제 파일이 생성되는것은 아님 
		File file = new File("C:\\_Study\\newFile.txt");
		
		// 파일생성
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
	/*
		true
		false
		newFile.txt
		C:\_Study\newFile.txt
		C:\_Study\newFile.txt
		true
		true

	 */
		// 파일삭제 
		file.delete();
	}
}
