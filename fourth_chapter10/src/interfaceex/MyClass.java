package interfaceex;

public class MyClass implements MyInterface {

	// x인터페이스에서 x() 상속받은 메소드 구현
	@Override
	public void x() {
		System.out.println("x()");
	}

	// y인터페이스에서 y() 상속받은 메소드 구현
	@Override
	public void y() {
		System.out.println("y()");
	}

	// MyInterface 인터페이스의 myMethod() 메소드 구현
	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}

}
