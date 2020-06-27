package lambda;

// 람다식 구현과 호출 
public class TestMyNumber {

	public static void main(String[] args) {

		// 람다식 인터페이스형 max변수에 대입 (매개변수) -> {실행문;}
		MyNumber max = (x, y) -> (x >= y) ? x : y;

		// 인터페이스형 변수로 메소드 호출
		System.out.println(max.getMax(10, 20));

		// MyNumber max2 = (x, y)-> x>=y ?x:y;
		// System.out.println(max2.getMax(10, 20));
	}
}
