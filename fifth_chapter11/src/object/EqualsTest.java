package object;

class Student {

	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String toString() {
		return studentId + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}

	// 해시코드 값으로 학번을 반환하도록 재정의
	@Override
	public int hashCode() {
		return studentId;
	}

}

public class EqualsTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");

		// 동일한 주소의 두 인스턴스 비교
		if (studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다르다.");

		// == 이나 equals로 비교가능
		if (studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일하다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않다");

		// 동일인이지만 인스턴스의 주소가 다른경우 비교
		if (studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 주소는 같다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다르다.");

		if (studentLee.equals(studentSang))
			System.out.println("studentLe와 studentSang은 동일하다.");
		else
			System.out.println("studentLee와  studentSang은 동일하지 않다.");

		System.out.println("studentLee의 hashCode :" + studentLee.hashCode());
		System.out.println("studentSang의 hashCode :" + studentSang.hashCode());

		System.out.println("studentLee의 실제주소값 :" + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제주소값"
				+ " :" + System.identityHashCode(studentSang));

	}
}
