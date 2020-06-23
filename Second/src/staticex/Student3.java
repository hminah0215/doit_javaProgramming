package staticex;

public class Student3 {
	
	// 190쪽 나혼자 코딩! 
	// 학생마다 각각 다른 학생카드가 발급됨, 학생카드번호는 학번에 100을 더한 값
	// 학생카드번호 멤버변수를 추가하고, 학생이 생성될때마다 학생카드 번호 부여

	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	int cardNumber;
	
	public Student3(){
		serialNum++;
		studentID = serialNum;
		cardNumber = studentID + 100;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
}
