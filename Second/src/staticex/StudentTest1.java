package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); //serialNum 변수의 초기값 1000출력
		studentLee.serialNum++;					// static 변수값이 증가함 
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		
		// 증가된 변수값이 출력된다
		// 두개의 참조변수가 동일한 변수를 가리키고 있음 
		System.out.println(studentSon.serialNum); 
		System.out.println(studentLee.serialNum); 
	}
}

