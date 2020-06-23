package thisTest;

class BirthDay {
	int day;
	int month;
	int year;

	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);
	}

}

// 퍼블릭 클래스는 하나뿐이고 자바 파일의 이름과 같아야하는 건 필수! 
public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		
		System.out.println(bDay);
		bDay.printThis();
//		thisTest.BirthDay@7d6f77cc
//		thisTest.BirthDay@7d6f77cc
// 		메모리 주소가 같음. 즉 클래스 코드에서 사용하는 this는 생성된 인스턴스 자신을 가리킴.
	}
}
