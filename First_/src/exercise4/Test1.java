package exercise4;

public class Test1 {
	public static void main(String[] args) {

		// 연습1
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		int result = 0;

		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else {
			return;
		}
		System.out.println("결과 값은 " + result + "입니다");
	}
}
