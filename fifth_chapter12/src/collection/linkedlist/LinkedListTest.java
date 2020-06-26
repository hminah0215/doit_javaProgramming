package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();

		// LinkedList에 요소 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");

		// 리스트 전체 출력 [A, B, C]
		System.out.println(myList);

		// LinkedList 첫번째위치에 D 추가후 리스트 전체출력
		// [A, D, B, C]
		myList.add(1, "D");
		System.out.println(myList);

		// 연결리스트의 맨 앞에 0 추가 후 리스트 출력
		// [O, A, D, B, C]
		myList.addFirst("O");
		System.out.println(myList);

		// 연결리스트의 맨 뒤 요소 삭제 후 해당요소 출력
		System.out.println(myList.removeLast()); // C
		System.out.println(myList); // [O, A, D, B]

	}
}
