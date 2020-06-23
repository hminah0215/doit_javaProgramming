package singleton;

public class Company {
	
	//1. 디폴트 생성자는 항상 public, 싱글톤 패턴에서는 생성자를 반드시 명시적으로 만들고
	// 그 접근제어자를 private으로 지정해주어야 한다.
	private Company() {

	}
	
	//2. 클래스 내부에 static으로 유일한 인스턴스 생성하기 
	private static Company instance = new Company();
	
	//3. 외부에서 참조할 수 있는 public 메소드 만들기
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
