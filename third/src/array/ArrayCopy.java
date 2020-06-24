package array;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] array1 = {10 ,20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		// src, srcPos, dest, destPos, length
		//복사할 배열, 복사할 첫 위치, 대상배열, 붙여넣을 위치, 복사할요소개수 
		System.arraycopy(array1, 0, array2, 1, 4);
				
		for(int i=0; i<array2.length; i++){
			System.out.println(array2[i]);
			
			//1, 10, 20,30, 40 
			
			/*
			 * array2 배열(대상배열)에 array1(복사할배열)을 복사하는데
			 * array1[0] 부터 4개를 복사해서 array2[1]부터 붙여넣는다. 
			 * 
			 * src배열의 srcPos번째부터 length개를 복사하여, 
			 * dest배열의 destPos자리부터 붙여넣는다.
			 */
		}
	}
}
