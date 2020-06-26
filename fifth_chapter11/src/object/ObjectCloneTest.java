package object;

// 원점을 의미하는 클래스 
class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x = " + x + "," + "y = " + y;
	}

}

// 객체를 복제해도 된다는 의미로 Cloneable 인터페이스를 함께 선언  
class Circle implements Cloneable {

	Point point;
	int radius;

	Circle(int x, int y, int radius) {
		point = new Point(x, y);
	}

	public String toString() {
		return "원점은 " + point + "이고," + "반지름은 " + radius + "입니다.";
	}
	
	// clone메소드 사용시 발생할 수 있는 오류를 예외처리함 
	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle = new Circle(10, 20, 30);
		
		// clone()메서드를 사용해서 circle 인스턴스를 copCircle에 복제 
		Circle copyCircle = (Circle) circle.clone();

		System.out.println(circle);
		System.out.println(copyCircle);
		
		// 인스턴스의 멤버변수 값은 같고, 주소값은 다름을 알 수 있음 
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
