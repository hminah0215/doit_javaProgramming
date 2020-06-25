package abstractex;

public class ComputerTest {

	// 추상클래스는 인스턴스로 만들수 없으므로 나는 오류
	// 주석막아놓은 c1, c3 
	public static void main(String[] args) {
//		Computer c1 = new Computer(); // Cannot instantiate the type Computer
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook(); // Cannot instantiate the type NoteBook
		Computer c4 = new MyNoteBook();
	}
}
