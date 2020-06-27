package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {

			byte[] bs = new byte[26];
			byte data = 65; // 'A' 의 아스키코드 값
			for (int i = 0; i < bs.length; i++) { // A-Z까지 배열에 넣음
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); // 배열의 3번째 위치(0 1 2)부터 10개의 바이트를 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력완료.");
	}
}
