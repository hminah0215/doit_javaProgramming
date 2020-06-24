package array;

public class BookArray {

	public static void main(String[] args) {
		
		// book클래스형으로 객체 배열 선언 
		Book[] library = new Book[5];
		
		for(int i=0; i < library.length; i++){
			System.out.println(library[i]);
		}		
	}
}
