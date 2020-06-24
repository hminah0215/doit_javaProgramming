package array;

import java.util.ArrayList;

// 225쪽 나혼자 코딩! 
public class StudentArrayList {
	public static void main(String[] args) {
		
		ArrayList<Student> st = new ArrayList<Student>();
		
		st.add(new Student(100, "피카츄"));
		st.add(new Student(200, "파이리"));
		st.add(new Student(300, "꼬부기"));
		
		for(Student student : st) {
			student.showStudentInfo();
		}
	}
}
