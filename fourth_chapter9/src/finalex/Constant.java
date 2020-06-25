package finalex;

public class Constant {

	int num = 10;

	// 상수 선언!
	final int NUM = 100;

	public static void main(String[] args) {

		Constant cons = new Constant();
		cons.num = 50;
		// cons.NUM = 200; // 상수는 변하지 않는 수! 값을 대입하면 오류남

		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}