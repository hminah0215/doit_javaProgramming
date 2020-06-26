package object;

// 357쪽 나혼자 코딩 ! 
public class Self_Student{
	int ID;
	String name;

	public Self_Student(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	// toString메소드 재정의 하여 학생이름,학번 출력 하기 
	public String toString() {
		return ID + "," + name;
	}
}
