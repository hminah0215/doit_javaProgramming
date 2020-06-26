package object;

class Book {

	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// toString( ) 메소드 재정의 
	@Override
	public String toString() {

		return bookTitle + "," + bookNumber;
	}
	// 재정의하면 아래 출력 결과가
	// 개미,200 으로 둘다 변경됨 

}

public class ToStringEx {

	public static void main(String[] args) {

		Book book1 = new Book(200, "개미");
		
		// 인스턴스 정보 (클래스이름,주소값) object.Book@7d6f77cc
		System.out.println(book1);
		
		// toString( ) 메소드로 인스턴스 정보(클래스이름,주소값)을 보여줌 object.Book@7d6f77cc 
		System.out.println(book1.toString());
	}
}
