package array;

// 211쪽 나혼자 코딩!
public class Student {
	int studentID;
	String name;
		
	public Student(int studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showStudentInfo(){
		System.out.println(studentID+" , "+name);
	}
	
}
