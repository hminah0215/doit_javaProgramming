package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		// 명시적 형변환으로 1 + 0
		
		int iNum4 = (int)(dNum1 + fNum2);
		// + 먼저 계산 후 명시적 형변환 
		// 1.2 + 0.9 = 2.1 ==> 형변환 ==> 2 
		
		System.out.println(iNum3);	//1
		System.out.println(iNum4);	//2

	}

}
