package innerclass;

// 외부클래스 
class OutClass {

	private int num = 10;
	private static int sNum = 20;

	// 내부클래스의 자료형 변수를 먼저 선언
	private InClass inClass;

	// 외무 클래스 디폴트 생성자. 외부클래스가 먼저 생성된 후에 내부클래스 생성가능
	public OutClass() {
		inClass = new InClass();
	}

	// 인스턴스 내부클래스
	class InClass {

		int inNum = 100;
//		static int sInNum = 200; 인스턴스 내부클래스에 정적변수 선언 불가능 

		void inTest() {
			System.out.println("OutClass num = " + num + "(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적변수)");
		}

//		static void sTest() {
//			인스턴스 내부 클래스에 정적 메소드 역시 정의 불가능.
//		}

	}

	public void usingClass() {
		inClass.inTest();
	}

	// 정적 내부 클래스
	static class InStaticClass {

		int inNum = 100;
		static int sInNum = 200;

		// 정적 내부 클래스의 일반 메소드
		void inTest() {
//			num += 10; 외부 클래스의 인스턴스 변수는 사용할 수 없다.
			System.out.println("InStaticClass inNum = " + inNum + "(내부클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}

		// 정적 내부 클래스의 정적 메소드
		static void sTest() {
//			num += 10;		외부클래스와 내부클래스의 인스턴스 변수는 사용 불가
//			inNum += 10;

			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부클래스의 정적변수 사용)");

		}
	}
}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		System.out.println("외부클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass(); // 내부 클래스 기능 호출
		System.out.println();

		// 외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성가능
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();

		System.out.println("정적 내부 클래스 일반 메소드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메소드 호출");
		OutClass.InStaticClass.sTest();
	}
}