package loopexample;

public class BreakExample {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) {
			sum += num;
			
			if(sum >= 100)	//sum이 100보다 크거나 같을때 반복문 중단 
				break;
		}
		System.out.println("num: "+ num);
		System.out.println("sum: "+ sum);
		
		// 1분복습
		int tot = 0;
		int n;
		
		for(n = 1; ; n++) {
			tot += n;
			if(tot >= 500) {
				break;
			}
		}
		System.out.println(tot);
		System.out.println(n);
	}
}
