package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일포인터 위치1:" + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일포인터 위치2:" + rf.getFilePointer());
		rf.writeUTF("안녕하세용");
		System.out.println("파일포인터 위치3:" + rf.getFilePointer());
		
		// 파일 포인터 위치를 맨 처음으로 옮기고 그 위치 출력
		rf.seek(0);
		System.out.println("파일포인터 위치4:" + rf.getFilePointer());

		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();

		System.out.println("파일포인터 위치5:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
	/*
		파일포인터 위치1:4
		파일포인터 위치2:12
		파일포인터 위치3:29
		파일포인터 위치4:0
		파일포인터 위치5:29
		100
		3.14
		안녕하세용 
	 */
}
