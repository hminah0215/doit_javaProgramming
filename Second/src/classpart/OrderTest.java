package classpart;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNum = 201803120001L;	// 자료형 long
		order.orderId = "abc123";
		order.orderDate = "2018년 3월12일";
		order.name = "홍길순";
		order.ProductNum = "PD0345-12";
		order.addr = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호: " + order.orderNum);
		System.out.println("주문자아이디: " + order.orderId);
		System.out.println("주문날짜: " + order.orderDate);
		System.out.println("주문이름: " + order.name);
		System.out.println("주문상품번호: " + order.ProductNum);
		System.out.println("베송주소: " + order.addr);
	}
}
