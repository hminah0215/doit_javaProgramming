package exercise4;

public class Test5_3 {
	public static void main(String[] args) {
		
		for(int i =1; i <= 4; i++) {
			String star = "";
			
			for(int j = i; j <= 4-1; j++) {
				star += " ";
			}
			for(int j = 1; j <= 2 * i-1; j++) {
				star += "*";
			}
			System.out.println(star);
		}
		for(int i =1; i <=3; i++) {
			String star = "";
			
			for(int j = 1; j <= i; j++) {
				star += " ";
			}
			for(int j = i; j <= 6 - i; j++) {
				star +="*";
			}
			System.out.println(star);
		}
	}
}
/*
별모양을 다시보자
0001
00111
011111
1111111
011111
00111
0001
이런모양이다 
잘보면 가운대 기준으로 즉 공백이 없는기준으로 
대칭의 모양이다 
4번에서 한코딩에 이어서 만들자
011111
00111
0001
만 만들면끝이니 요기 부분만 다시보자
1번쨰 줄일때 공백이 1개
2번쨰 줄일때 공백이 2개
3번쨰 줄일때 공백이 3개
즉공백은 줄수랑 같다 
int j = 1 ; j <= i ; j++
별을 보자 
1번째 줄일때 별이 5개
2번째 줄일때 별이 3개
3번째 줄일때 별이 1개
즉 6 -줄수이다 
int j = i ; j <= 6 - i  ; j++
*/
