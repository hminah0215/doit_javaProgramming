package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다. ");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}

public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}

	// 매개변수의 자요형이 상위클래스
	public void moveAnimal(Animal animal) {
		// 재정의된 메서드를 호출
		animal.move();
	}

}
