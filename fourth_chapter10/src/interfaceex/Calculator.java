package interfaceex;

//Calc 인터페이스에 포함된 추상메서드를 구현하거나, 이걸 추상클래스로 만들어야함 
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
