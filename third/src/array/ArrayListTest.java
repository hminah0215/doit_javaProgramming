package array;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();
		
		//	ArrayList클래스에 포함된  add 메소드 사용으로 요소값 추가 
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만헤세"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐페리"));
		library.add(new Book("어떻게살것인가", "유시민"));
		
		// 배열에 추가된 요소 개수만큼 출력 
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();

		System.out.println("=======향상된 for문 사용========");
		for (Book book : library) {
			book.showBookInfo();
		}
	}
}
