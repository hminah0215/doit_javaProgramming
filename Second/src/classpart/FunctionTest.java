package classpart;

public class FunctionTest {
	
	// 나혼자 코딩! 사칙연산 함수 완성하기 
	
	public static int div(int n1, int n2) {
		int re = n1 / n2;
		return re;
	}
	
	public static int multi(int n1, int n2) {
		int re = n1 * n2;
		return re;
	}
	
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int sum = add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다.");
		
		int mi = minus(num1,num2);	// 빼기
		System.out.println(num1 + "-" + num2 + "=" + mi + "입니다.");
		int mul = multi(num1,num2);	// 곱하기
		System.out.println(num1 + "*" + num2 + "=" + mul + "입니다.");
		int div = div(num1,num2);	// 나누기
		System.out.println(num1 + "/" + num2 + "=" + div + "입니다.");
	}

}
