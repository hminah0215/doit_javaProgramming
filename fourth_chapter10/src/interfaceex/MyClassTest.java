package interfaceex;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass mClass = new MyClass();
		
		// 상위인터페이스 X형으로 대입하면 X에 선언한 메소드만 호출가능 
		X xClass = mClass;
		xClass.x();

		Y yClass = mClass;
		yClass.y();
		
		// 구현한 인터페이스형 변수에 대입하면 인터페이스가 상속한 
		// 모든 메소드 호출가능 
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
	
	/*
		x()
		y()
		myMethod()
		x()
		y()
	 */
}
