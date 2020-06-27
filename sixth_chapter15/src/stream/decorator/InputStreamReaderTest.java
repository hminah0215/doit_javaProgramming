package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;

			// 파일의 끝인 -1이 반환될때까지 보조스트림으로 자료읽음
			while ((i = isr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
