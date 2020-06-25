package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;

		CompleteCalc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		calc.showInfo();

		Calc newCalc = calc;
		
		// default 메소드 호출 
		calc.description(); 

		int[] arr = { 1, 2, 3, 4, 5 };
		
		// 정적메소드 사용 1~5를 모두 더한 값 15 반환 
		System.out.println(Calc.total(arr)); 
		
		System.out.println(calc.square(num1));  //나혼자코딩 추가 메서드

	}
}
