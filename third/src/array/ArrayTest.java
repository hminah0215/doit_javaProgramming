package array;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		
		// 자바의 배열은 배열길이를 나타내는 length 속성을 가진다. 
		for(int i=0; i < num.length; i++) {
//			System.out.println(num[i]);
			sum += num[i];
		}
		
		System.out.println(sum);
		
		// 1분복습, 이 예제에 int sum =0; 을 작성하고 코드를 수정하여
		// 배열의 모든 요소합을 계산하는 프로그램을 만들어 보세요. 
	}
}
