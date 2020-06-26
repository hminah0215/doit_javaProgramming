package generics;

// 한점을 나타내는 두좌표 x,y는 정수일 수도 있고 실수일수도 있어 
// T,V라는 자료형 매개변수로 표현
public class Point<T, V> {

	T x;
	V y;

	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	// 제네릭 메소드
	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
}
