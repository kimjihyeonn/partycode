package method.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodEx04 {
	
	public static void main(String[] args) {
		
		//매개변수or 반환유형으로 배열을 전달하고 받는 방법.
		
		String[] arr= new String[3];
		String[] arr2 = {"가","나","다"};
		
		printArray(arr2);
		
		
		int[] arr3=printArray2();
		
		System.out.println(Arrays.toString(arr3));
	}
  //1.문자열 배열을 매개변수로 받아서, 배열안에 요소를 출력
	
	static void printArray(String[] arr) {
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	//2.int 배열을 반환하는 방법
   static int[] printArray2() {
	   
	   int[] arr = {1,2,3,4};
	   return arr;
   }
}
