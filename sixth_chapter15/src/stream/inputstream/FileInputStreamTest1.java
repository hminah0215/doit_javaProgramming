package stream.inputstream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
		
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		
		} catch (IOException e) {
			System.out.println(e);
		} finally{
			try {
				fis.close(); // finally 블록은 항상 동작! 여기서 열린 스트림 닫아주기
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e){	// 스트림이 null 인경우 
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
	
	/*java.io.FileNotFoundException: input.txt (지정된 파일을 찾을 수 없습니다)
		java.lang.NullPointerException
		end
	 */
}
