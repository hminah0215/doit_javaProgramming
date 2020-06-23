package staticex;

public class Student {
	
	// static 변수는 인스턴스 생성과 상관없이 먼저 생성됨 
	public static int serialNum = 1000;	// 기준값 역할의 serialNum 기준값으로 1000 대입 
	int studentID;
	String studentName;
	int grade;
	String address;
	

	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;

		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
