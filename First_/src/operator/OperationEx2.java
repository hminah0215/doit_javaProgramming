package operator;

public class OperationEx2 {
	public static void main(String[] args) {
		int gameScore = 150;	// 게임 점수 
		
//		int lastScore1 = ++gameScore;
		int lastScore1 = gameScore++;
		System.out.println(lastScore1); // 151 150
		
//		int lastScore2 = --gameScore;
		int lastScore2 = gameScore--;
		System.out.println(lastScore2); // 150 151

	}
}
