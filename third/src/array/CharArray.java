package array;

public class CharArray {

	public static void main(String[] args) {
		
		// 대문자 알파벳 26개를 저장하기 위한 배열
		char[] alpahabets = new char[26];
		char ch = 'A';
		
		for(int i=0 ; i < alpahabets.length; i++, ch++){
			alpahabets[i] = ch;	// 아스키값으로 배열의 요소에 각각 저장 
		}
		
		for(int i=0; i<alpahabets.length; i++){
			// 배열에 저장된 문자 , 정수로 변환한 문자값 
			System.out.println(alpahabets[i] + "," + (int)alpahabets[i]);
		}
	}
}