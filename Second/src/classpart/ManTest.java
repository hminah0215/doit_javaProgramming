package classpart;

public class ManTest {
	public static void main(String[] args) {
		Man man = new Man();
		man.age = 40;
		man.name ="James";
		man.isMarried = true;
		man.cntOfChild = 3;
		
		System.out.println("나이: "+ man.age);
		System.out.println("이름: "+ man.name);
		System.out.println("결혼여부: "+ man.isMarried);
		System.out.println("자식수: "+ man.cntOfChild);
	}
}
