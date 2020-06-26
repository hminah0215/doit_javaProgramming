package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("김동완"));
		hashSet.add(new String("신혜성"));
		hashSet.add(new String("이민우"));
		hashSet.add(new String("문정혁"));
		hashSet.add(new String("이선호"));
		
		// 같은 문자열은 중복되어 출력되지 않음!! HashSet은 중복된 값은 추가안됨
		hashSet.add(new String("박충재"));
		hashSet.add(new String("박충재"));

		
		System.out.println(hashSet);
	}
}
