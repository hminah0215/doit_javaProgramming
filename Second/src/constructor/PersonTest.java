package constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person personLee = new Person();
		personLee.name ="이순신";
		personLee.height = 180;
		personLee.weight = 80;
		
		Person personKim = new Person("김뫄뫄",160,60);
		
	}
}
