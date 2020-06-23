package chapter2;

public class CharacterEx1 {
	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);		//문자출력
		System.out.println((int)ch1);	// 문자에 해당하는 아스키코드 값 65 출력
		
		char ch2 = 66;					//정수 값 대입
		System.out.println(ch2);		// 정수 값에 해당하는 문자 출력
		
		int ch3 = 67;
		System.out.println(ch3);		//문자 정수값 출력
		System.out.println((char)ch3);	//정수 값에 해당하는 문자 C 출력 
		
		char ch4 = 'Z';		// 90
		char ch5 = 38;		// &
		char ch6 = 97;		// a
		System.out.println((int)ch4+" , "+ch5+" , "+ch6);
	}
}
