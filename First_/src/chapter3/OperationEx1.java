package chapter3;

public class OperationEx1 {
	public static void main(String[] args) {
		
		//연습문제 1
		
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);	//false
		
		System.out.println(myAge <= 25);	//true
		System.out.println(myAge == teacherAge);	//false
		
		char ch; 
		ch = (myAge > teacherAge) ? 'T':'F';
		System.out.println(ch);	//F
		
//		int num =8 ;
//		System.out.println(num -= 10);
//		System.out.println(num >>= 2); //2
	
		/*
		 	연습문제 2 (10)
		 	연습문제 3 (10, 10, 11, 10)
		 	연습문제 4 (false, true, false)
		 	연습문제 5	(2, 10, 8, -3)
		 	연습문제 6	(18, -2, 2진법 어렵... 답은 2)
		 	연습문제 7	(30)
		 */
	}
}	
