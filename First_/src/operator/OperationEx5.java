package operator;

public class OperationEx5 {
	public static void main(String[] args) {
		int num = 0B00000101;	// 5를 8비트 2진수로 나타낸것
		
		System.out.println(num << 2);	//20
		//왼쪽으로 2비트 이동 00010100
		
		System.out.println(num >> 2);	//1
		// 오른쪽으로 2비트이동 00000001(1)
		
		System.out.println(num >>> 2);	//1
		// 오른쪽으로 2비트이동 00000001(1)
		
		System.out.println(num);		//5
		// num에 값을 대입하지 않았으니, 비트이동연산자와 관계없이 기존값 출력
		
		num = num << 2; 
		System.out.println(num);		//20
		// 왼쪽으로 2 비트 이동한 값 출력
	}
}
