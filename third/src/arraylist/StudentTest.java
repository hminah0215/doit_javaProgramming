package arraylist;

public class StudentTest {
	public static void main(String[] args) {
	
		Student st_one = new Student(100, "LEE");
		st_one.addSub("국어", 100);
		st_one.addSub("수학", 50);
		
		Student st_two = new Student(200, "KIM");
		st_two.addSub("영어", 100);
		st_two.addSub("수학", 85);
		st_two.addSub("국어", 70);
		
		st_one.showStudentInfo();
		System.out.println("==========================");
		st_two.showStudentInfo();
		
	}
}
