package method.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodEx04 {
	
	public static void main(String[] args) {
		
		//�Ű�����or ��ȯ�������� �迭�� �����ϰ� �޴� ���.
		
		String[] arr= new String[3];
		String[] arr2 = {"��","��","��"};
		
		printArray(arr2);
		
		
		int[] arr3=printArray2();
		
		System.out.println(Arrays.toString(arr3));
	}
  //1.���ڿ� �迭�� �Ű������� �޾Ƽ�, �迭�ȿ� ��Ҹ� ���
	
	static void printArray(String[] arr) {
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	//2.int �迭�� ��ȯ�ϴ� ���
   static int[] printArray2() {
	   
	   int[] arr = {1,2,3,4};
	   return arr;
   }
}
