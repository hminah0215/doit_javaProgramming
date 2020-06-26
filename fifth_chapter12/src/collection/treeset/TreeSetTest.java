package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");

		for (String str : treeSet) {
			System.out.println(str);
		}
	}
	
	/* 결과값이 정렬되어 출력! 여기서는 String 클래스안에 있는 정렬방식 대로 출력 
		강감찬
		이순신
		홍길동
	 */
}
