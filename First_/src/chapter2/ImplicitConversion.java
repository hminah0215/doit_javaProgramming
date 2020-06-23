package chapter2;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; 	// byte형 값이 int형 변수로 대입됨 
		
		System.out.println(bNum);	//10
		System.out.println(iNum);	//10
		
		int iNum2 = 20;
		float fNum = iNum2; // int 형 값이 float 변수로 대입됨 
		
		System.out.println(iNum);	//10
		System.out.println(fNum);	//20.0
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);	//30.0
		
		
	}
}
