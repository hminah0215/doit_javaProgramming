package exercise4;

public class Test5 {

	public static void main(String[] args) {
//		*
// 	   ***
//    *****
//   *******
//    *****
//     ***
//      *
		
		for (int i = 0; i < 4; i++) {

			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// 가운데 ******* 기준 
		
		
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j < 4; j++) {
				System.out.print("*");
			}
			for (int j = i + 1; j < 4; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
