package thisTest;

class Person{
	String name;
	int age;
	
	Person(){
		this("이름없음", 1);  // Person(String, int)  생성자를 this를 이용해서 호출함 
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;	// this 반환 
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person noName = new Person();
		System.out.println(noName.name);	//이름없음
		System.out.println(noName.age);		//1
		
		Person p = noName.returnItSelf();	
		System.out.println(p);// noName.returnItSelf()의 반환값 this 출력 thisTest.Person@7d6f77cc
		System.out.println(noName);// 참조변수출력 thisTest.Person@7d6f77cc
	}
}