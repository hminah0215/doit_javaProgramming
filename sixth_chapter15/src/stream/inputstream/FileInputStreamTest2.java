package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("input.txt")) {
			int i;

			// i값이 -1이 아닌동안 read()메소드로 한바이트를 반복해서 읽음
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
		A
		B
		C
		end
	 */
	
}
