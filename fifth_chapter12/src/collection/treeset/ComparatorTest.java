package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class MyCompare implements Comparator<String> {

	// 내림차순으로 정렬
	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
	}
}

public class ComparatorTest {

	public static void main(String[] args) {
		// Comparator 사용시 TreeSet 생성자에 Comparator를 구현한 객체를 매개변수로 전달해야함
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");

		System.out.println(set);	// [ccc, bbb, aaa]

	}
}
