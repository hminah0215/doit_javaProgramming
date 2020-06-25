package interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {

		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;	// num2가 0이면 오류 반환, 0으로 나눌수는 없으니까.
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스 구현!");
	}
	
	// 디폴트 메소드 재정의
	@Override
	public void description() {
		super.description();
	}
	
	// 319쪽 나혼자 코딩!
	@Override
	public int square(int num1) {
		// TODO Auto-generated method stub
		System.out.println("제곱!");
		return num1*num1;
	}
}
