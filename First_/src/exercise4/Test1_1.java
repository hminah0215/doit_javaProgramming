package exercise4;

public class Test1_1 {
	public static void main(String[] args) {

		// 연습1
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}
		System.out.println("결과 값은 " + result + "입니다");
	}
}
