package collection.arraylist;

import java.util.ArrayList;

class MyQueue {

	private ArrayList<String> arrayQueue = new ArrayList<String>();

	// 큐의 맨 뒤에 추가 (First in First Out) 방식
	public void enQueue(String data) {
		arrayQueue.add(data);
	}

	// 큐의 맨 앞에서 꺼냄
	public String deQueue() {
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("큐가 비었음");
			return null;
		}

		return (arrayQueue.remove(0)); // 맨앞의 자료를 반환, 배열에서 삭제
	}
}

public class QueueTest {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
