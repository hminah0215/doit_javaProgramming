package array;

public class EnhancedForLoop {

	public static void main(String[] args) {

		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		// String 형 lang이라는 변수에 strArray 배열 요소값을 순서대로 꺼내서 대입 
		for(String lang : strArray){
			System.out.println(lang);
		}
		
		// 1분복습 218쪽 
		int[] numArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int number : numArray ) {
			System.out.println(number);
		}
	}
}
