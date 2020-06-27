package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
class Person implements Externalizable{
	
	String name;
	String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
	}
	
}
*/

class Person implements Serializable {
	// 버전 관리를 위한 정보
	private static final long serialVersionUID = -1503252402544036183L;
	
	// 클래스 버전을 이클립스에서 자동생성시켜줌 
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 6412276319311846923L;
	
	
	String name;
	transient String job;	// 이러면 직급란이 null로 출력됨 , 직렬화하고싶지 않은 변수

	public Person() {

	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");

		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			// personAhn,personKim의 값을 파일에 씀 (직렬화)
			oos.writeObject(personAhn);
			oos.writeObject(personKim);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			// personAhn,personKim의 값을 파일에서 읽어들임 (역직렬화)
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();

			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
