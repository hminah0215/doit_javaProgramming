package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		// 스트림 생성
		Stream<String> stream = sList.stream();
		
		// 배열의 요소 하나씩 출력 Tomas Edward Jack 
		stream.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		// 스트림새로생성/ 정렬/   요소를 하나씩 꺼내어 출력
		sList.stream().sorted().forEach(s->System.out.print(s+ " "));
		// Edward Jack Tomas 
		
	}
}
