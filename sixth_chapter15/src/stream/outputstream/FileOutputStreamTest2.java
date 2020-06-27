package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		// try -with -resources 문, 자바 9뷰ㅜ터 제공 
		FileOutputStream fos = new FileOutputStream("output2.txt",true);
		
		try(fos){ 		
			byte[] bs = new byte[26];
			byte data = 65;        //'A' 의 아스키코드 값 
			
			for(int i = 0; i < bs.length; i++){  // A-Z까지 배열에 넣음 
				bs[i] = data;
				data++;
			}
			
			fos.write(bs);  //배열을 한번에 출력
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력완료.");
	}
}
