package loopexample;

public class WhileExample1 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 "+ sum + "입니다.");
		
		// 1분복습 1~50까지 더하는 프로그램 
		int n = 1;
		int tot = 0;
		
		while(n <= 50) {
			tot += n;
			n++;
		}
		System.out.println("1부터 50까지의 합은 "+ tot + "입니다.");
	}
}
