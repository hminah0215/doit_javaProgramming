package class_ex;

public class ClassTest {
	
	// throws ClassNotFoundException : forName() 메소드에서 발생하는 예외를 처리 
	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();
		
		//Object의 getClass()메소드 사용
		Class pClass1 = person.getClass();  
		System.out.println(pClass1.getName());
		
		// 직접 class 파일 대입하기
		Class pClass2 = Person.class;    
		System.out.println(pClass2.getName());
		
		// class이름으로 가져오기 
		Class pClass3 = Class.forName("class_ex.Person");
		System.out.println(pClass3.getName());          
	}
}
