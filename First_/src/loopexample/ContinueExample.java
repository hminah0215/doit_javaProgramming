package loopexample;

public class ContinueExample {
	public static void main(String[] args) {
		// 1~100까지 홀수일때만 더하고 짝수일때는 더하지 않는 프로그램
		int total = 0;
		int num;

		for (num = 1; num <= 100; num++) {
			if (num % 2 == 0)
				continue;
			total += num;
		}
		System.out.println("1부터 100까지 홀수의 합은 " + total);

		// 1분복습
		int n;

		for (n = 1; n <= 100; n++) {
			if (n % 3 != 0)
				continue;
			System.out.println(n);
		}

	}
}
