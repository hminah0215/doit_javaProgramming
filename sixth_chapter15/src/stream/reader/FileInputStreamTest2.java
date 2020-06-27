package stream.reader;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
	// ìëíì¸ìend 다 깨져서 출력! 한글을 바이트 단위로 읽어오니까 
	// 이때는 문자 스트림을 사용해서 읽어야 한다.  
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		
		fis = new FileInputStream("reader.txt");
		int i;
		while ( (i = fis.read()) != -1){
			System.out.print((char)i);
		}
		fis.close();
		System.out.println("end");
	}
}
