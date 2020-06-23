package classpart;

public class StudentTest2 {
	public static void main(String[] args) {
		
		Student student1 = new Student(); //첫번째 학생 생성
		student1.studentName = "안연수";
		
		Student student2 = new Student(); //두번째 학생 생성
		student2.studentName = "안승연";
		
		// 클래스이름@주소값, 힙메모리에 생성된 인스턴스의 메모리 주소출력 
		System.out.println(student1);
		System.out.println(student2);
//		classpart.Student@7d6f77cc
//		classpart.Student@5aaa6d82
		
	}
}
