package array;

//211쪽 나혼자 코딩!
public class StudentArray {
	public static void main(String[] args) {

		Student[] st = new Student[3];

		st[0] = new Student(1, "둘리");
		st[1] = new Student(2, "길동");
		st[2] = new Student(3, "희동");

		for (int i = 0; i < st.length; i++) {
			st[i].showStudentInfo();
		}
	}
}
