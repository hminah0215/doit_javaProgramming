package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	// 따로 생성자를 만들지 않아도 자동으로 만들어지는 
	// 디폴트 생성자는 이렇게 생김, 직접 추가해봄 
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	
	// 나혼자 코딩! 
	// 매개변수가 있는 생성자 추가하기 
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
