package staticex;

public class Student2 {
	
	private static int serialNum = 1000;	// private 변수로 바꿈 
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2(){
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}
	
	// serialNum get()메소드
	public static int getSerialNum() {
		int i = 10;	// 메소드 내부에서 선언한 변수를 그 지역에서만 사용한다고 지역변수라함
		
//		studentName = "이지원"; 오류!! 클래스의 멤버변수(인스턴트 변수) 이기 때문! 
		
		return serialNum;
	}
	
	// serialNum set()메소드
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
