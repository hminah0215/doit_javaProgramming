package array;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥","조정래");
		bookArray1[1] = new Book("데미안","헤르만헤세");
		bookArray1[2] = new Book("토지","박경리");
 		
		//bookArray2 배열 0번째 부터 3개를 복사하여, bookArray1 배열에 0번째부터 붙여넣는다
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		
		for(int i=0; i<bookArray2.length; i++){
			bookArray2[i].showBookInfo();
		}
		
		
		
	}
}
