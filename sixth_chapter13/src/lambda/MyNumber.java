package lambda;

// 함수형 인터페이스 선언하기 
@FunctionalInterface
public interface MyNumber {

	// 추상 메소드 선언
	int getMax(int num1, int num2);
}
