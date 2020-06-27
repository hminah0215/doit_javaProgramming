package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("하나의 알파벳을 쓰고 엔터를 누르세요");

		int i;

		try {
			// read()에서 한 바이트를 읽는다
			i = System.in.read();

			System.out.println(i);
			System.out.println((char) i); // 문자로 변환하여 출력
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
