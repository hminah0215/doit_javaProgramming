package generics;


// <T extends Material> extends 예약어로 사용할 수 있는 자료형에 제한을 둠 
// Material
public class GenericPrinter<T extends Material> {

	// T자료형으로 선언한 변수
	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	// T자료형 변수 MATERIAL을 반환하는 제네릭 메소드
	public T getMaterial() {
		return material;
	}

	public String toString() {
		return material.toString();
	}

	public void printing() {
		// 상위클래스 Material의 메소드 호출!
		material.doPrinting();
	}
}
