package staticex;

public class Student1 {
	
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student1(){
		serialNum++;	// 학생이 생성될때마다 serialNum 증가
		studentID = serialNum;	// 증가된 값이 학번이 됨 
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student1.serialNum = serialNum;
	}
}
