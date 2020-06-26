package generics;

public class Powder extends Material {
	
	// 상속받은 추상메소드
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}

	public String toString() {
		return "재료는 Powder 입니다";
	}
}
