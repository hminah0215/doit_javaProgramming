package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "이무무";
		// 변수 접근제어자가 private으로 바뀌면서 외부클래스의
		// 접근이 허용되지 않았으므로 오류! 
		
		studentLee.setStudentName("이무무");
		
		System.out.println(studentLee.getStudentName());
	}
}

