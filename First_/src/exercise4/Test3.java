package exercise4;

public class Test3 {
	public static void main(String[] args) {
		int dan;
		int num;

		for (dan = 2; dan <= 9; dan++) {
			for (num = 1; num <= 9; num++) {
				if (num > dan)	// 단보다 곱하는 수가 크면 break
					break;
				System.out.println(dan + "x" + num + "=" + dan * num);
			}
			System.out.println();
		}
	}
}
