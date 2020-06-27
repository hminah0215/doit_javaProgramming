package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("여러개의 알파벳을 쓰고 엔터를 누르세요");

		int i;
		try {
			// read()메소드로 한 바이트를 반복해서 읽음  
			while ((i = System.in.read()) != '\n') {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
