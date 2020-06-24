package exercise;

import java.util.ArrayList;

public class Question5_Test {
	public static void main(String[] args) {
		ArrayList<Question5> dogList = new ArrayList<Question5>();
		
		dogList.add(new Question5("웅웅", "삽살개"));
		dogList.add(new Question5("미미", "비숑"));
		dogList.add(new Question5("치치", "푸들"));
		dogList.add(new Question5("라라", "닥스훈트"));
		dogList.add(new Question5("방방", "비글"));
		
		for(Question5 ok : dogList) {
			System.out.println(ok.showDogInfo());
		}
	}
}
