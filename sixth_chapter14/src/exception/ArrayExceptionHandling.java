package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			for (int i = 0; i <= 5; i++) { // i = 5 가 되는 순간 프로그램이 멈춤
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외처리부분");
		}
		System.out.println("프로그램종료");
	}
}
