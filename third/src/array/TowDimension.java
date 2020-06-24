package array;

public class TowDimension {

	public static void main(String[] args) {
		
		// 2행3열의 2차원 배열 
		int[][] arr = {{1,2,3},{4,5,6}};
		
		// 배열 인덱스용 for문 i는 행, j는 열
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
			System.out.println();	// 행사이에 한줄 띄움 
		}
		
		// 221쪽 나혼자 코딩!
		// 알파벳 소문자를 2글자씩 13줄(13행2열)로 출력하는 프로그램 
		char[][] alphabet = new char[13][2];
		char ch = 'a';
		
		for(int i =0; i < alphabet.length ; i++) {
			
			for(int j=0; j < alphabet[i].length; j++) {
				
				alphabet[i][j] = ch;
				System.out.print(alphabet[i][j] +" ");
				ch++;
			}
			System.out.println();
		}
	}

}
