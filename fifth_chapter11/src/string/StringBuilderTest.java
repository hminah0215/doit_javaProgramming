package string;

public class StringBuilderTest {

	public static void main(String[] args) {

		String javaStr = new String("Java");
		
		// System.identityHashCode(javaStr) 인스턴스가 처음 생성됐을때의 메모리주소
		System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));
		
		// String 으로부터 StringBuilder 생성
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		// 문자열 추가 
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun...???ㅋㅋ");
		
		System.out.println("연산 후 buffer 메모리 주소 : "+ System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소: "+ System.identityHashCode(javaStr));
	}
	/*
		javaStr 문자열 주소: 758529971
		연산 전 buffer 메모리 주소: 2104457164
		연산 후 buffer 메모리 주소 : 2104457164
		Java and android programming is fun...???ㅋㅋ
		연결된 javaStr 문자열 주소: 1521118594
	 */
}
