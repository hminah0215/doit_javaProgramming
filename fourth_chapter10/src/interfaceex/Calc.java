package interfaceex;

public interface Calc {

	// 앞에 final이 없지만 인터페이스에서 선언한 변수는 컴파일 과정에서
	// 상수로 자동 변환됨
	double PI = 3.14;
	int ERROR = -999999999;

	// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상메서드로 변환됨
	// +,-,*,/
	int add(int num1, int num2);

	int substract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	int square(int num1);

	private void myMethod() {
		System.out.println("private 메서드.");
	}

	private static void myStaticMethod() {
		System.out.println("private static 메서드.");
	}

	// default 메소드 구현
	default void description() {
		System.out.println("정수 계산기 구현!");
		
		// private 메소드 호출 
		myMethod();
	}

	// 정적메소드 구현
	static int total(int[] arr) {

		int total = 0;

		for (int i : arr) {
			total += i;
		}
		
		// private static 메소드 호출 
		myStaticMethod();
		return total;
	}
}
