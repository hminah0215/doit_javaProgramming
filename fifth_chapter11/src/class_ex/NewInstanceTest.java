package class_ex;

public class NewInstanceTest {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person1 = new Person();
		System.out.println(person1);

		Class pClass = Class.forName("class_ex.Person");
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);
		
		/*class_ex.Person@7d6f77cc
			class_ex.Person@5aaa6d82*/
	}
}
