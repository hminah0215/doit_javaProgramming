package innerclass;

class Outter {

	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {

		int num = 100; // 지역변수

		// Runnable 인터페이스를 구현하는 클래스를 지역 내부 클래스로 만듬
		class MyRunnable implements Runnable {

			int localNum = 10; // 지역 내부 클래스의 인스턴스 변수

			@Override
			public void run() {
				// num = 200; 지역변수는 상수로 바뀌므로 값을 변경할 수 없다.
				// i = 100; 매개변수도 지역변수처럼 상수로 바뀌니 값 변경 불가
				System.out.println("i =" + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);

				System.out.println("outNum = " + outNum + "(외부클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outter.sNum + "(외부클래스 정적변수)");
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outter out = new Outter();
		Runnable runner = out.getRunnable(10); // 메서드 호출
		runner.run();
	}
}
