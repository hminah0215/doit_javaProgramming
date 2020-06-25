package abstractex;

public class MyNoteBook extends NoteBook {

	// 모든 추상메서드가 구현된 클래스이므로 abstract 예약어를 사용하지않음 
	@Override
	public void typing() {
		System.out.println("MyNoteBook Typing()");
	}

}
