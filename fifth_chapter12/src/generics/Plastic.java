package generics;

public class Plastic extends Material {
	
	// 상속받은 추상메소드
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}

	public String toString() {
		return "재료는 Plastic 입니다";
	}
}
