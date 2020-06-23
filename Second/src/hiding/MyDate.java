package hiding;

public class MyDate {
	
//	public int day;
//	public int month;
//	public int year;

	//mydateTest에서 2월31일이라고 했음.
	//클래스의 멤버변수를 public으로 선언하면 접근이 제한되지
	//않으므로 정보의 오류가 발생할 수 있다. 
	//이런경우에는 오류가 나더라도 그 값이 해당 변수에 대입되지
	//못하도록 private으로 변수를 바꾸고 public 메소드를 별도제공할것
	
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("2월은 28일까지입니다.오류!");
			}else {
				this.day = day;
			}
		}
	}
	
	/* 연습문제
	 * Q1. 클래스를 생성할때 호출하는 [생성자]는 멤버변수를 초기화 하는데 사용
	 * Q2. 클래스를 생성하여 메모리에 있는 상태를 [인스턴스]라 하고
	 * 멤버변수를 다른말로 [인스턴스변수] 라고 한다. 
	 * Q3. [메소드]는 일반함수에 객체 지향의 개념을 추가하여 
	 * 클래스 내부에 선언하고 클래스 멤버변수를 사용하여 클래스기능을 구현함
	 */

	
}
