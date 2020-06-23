package classpart;

// Student 클래스를 실행할 외부 테스트 클래스 
public class StudentTest {
	public static void main(String[] args) {
		Student studentAhn = new Student();	// Student 클래스 생성
		studentAhn.setStudentName("안승연");
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
