package classpart;

public class Student { // 클래스 이름 Student

	// 객체속성, 멤버변수 
	int studentId;		  // 학번
	String studentName;  // 학생이름
	int grade; 			// 학년
	String address;	   // 사는곳
	
	//학생 이름과 주소 출력하는 메서드 만들기 
	public void showStudentInfo() {
		System.out.println(studentName +" , "+ address);
	}
	
	//학생의 이름을 반환하는 메소드 
	public String getStudentName() {
		return studentName;
	}
	
	// 학생 이름을 부여하는 메소드
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// 클래스 내부에 main()함수 만들기
	public static void main(String[] args) {
		Student studentAhn = new Student();	// Student 클래스 생성
		studentAhn.setStudentName("안연수");
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}



