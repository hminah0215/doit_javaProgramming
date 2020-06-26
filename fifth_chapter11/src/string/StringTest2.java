package string;

public class StringTest2 {

	public static void main(String[] args) {

		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: "+ System.identityHashCode(javaStr));
		
		// 문자열 javaStr과 문자열 androidStr을 연결하여 javaStr에 대입
		javaStr = javaStr.concat(androidStr); 
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소값: " +System.identityHashCode(javaStr));
	}
}
