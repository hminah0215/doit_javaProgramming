package string;

public class StringTest1 {

	public static void main(String[] args) {
		
		// 문자열을 생성자의 매개변수로 생성하는 방식
		String str1 = new String("abc");
		String str2 = new String("abc");
		

		System.out.println(str1 == str2); // false 인스턴스가 매번 새로 생성되므로 주소값이 다름 
		System.out.println(str1.equals(str2)); // true 문자열값은 같음 
		
		// 문자열 상수를 가리키는 방식
		String str3 = "abc";
		String str4 = "abc";

		System.out.println(str3 == str4); // true 상수풀에 저장되어있어 주소값이 같음
		System.out.println(str3.equals(str4)); // true 문자열 값도 같음 
	}
}
