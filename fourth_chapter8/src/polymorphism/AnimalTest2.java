package polymorphism;

import java.util.ArrayList;

public class AnimalTest2 {

	// 배열의 자료형은 Animal로 지정
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅!");
		aTest.testCasting();

	}

	// ArrayList에 추가되면서 Animal 자료형으로 형 변환
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());

		for (Animal ani : aniList) {
			ani.move();
		}
	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) { // 모든 배열요소를 하나씩 돌면서

			Animal ani = aniList.get(i); // Animal형으로 가져옴
			if (ani instanceof Human) { // human이면
				Human h = (Human) ani; // human형으로 다운 캐스팅 해랏!
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("지원되지않는 형입니다. ");
			}
		}
	}
}
