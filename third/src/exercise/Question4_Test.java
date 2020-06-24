package exercise;

public class Question4_Test {
	public static void main(String[] args) {

		Question4[] dog = new Question4[5];
		dog[0] = new Question4("멍뭉이", "포메라니안");
		dog[1] = new Question4("절미", "시고르자브종");
		dog[2] = new Question4("돌돌이", "진돗개");
		dog[3] = new Question4("뀨뀨", "치와와");
		dog[4] = new Question4("복슬이", "푸들");	
		
		
		for(int i =0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
	}
}
