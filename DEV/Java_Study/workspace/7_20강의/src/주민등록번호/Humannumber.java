package �ֹε�Ϲ�ȣ;

import java.util.Scanner;

/**
 * �ڵ� ó�� => �ֹε�Ϲ�ȣ
 * �Է�==> ���� ���� üũ 
 * ��ȿ���˻���
 * 
 * 
 * [�߿�]
 * 
 * �ֹι�ȣ üũ ����
 *        �ۡۡۡۡۡ� - �ۡۡۡۡۡ�(��=>check digit check �ڸ�(�˻����))
 * 1�ܰ�:  xxxxxx  -xxxxxx
 *    sum 234567   892345 => ����ġ(weight)
 * 2�ܰ�: temp =11-(sum%11)
 * 3�ܰ�: result =temp%10
 * 
 *  if result == �� => �ֺ��ȣ ����
 *  if result !=�� => �ֹι�ȣ ������ 
 *  */

public class Humannumber {

	public static void main(String[] args) {
		   
	    
		System.out.println("�ֹε�Ϲ�ȣ�Է�>>>");
		
		Scanner scan= new Scanner(System.in);
		String agenums= scan.next();
		
		
		
		//String nums = agenums.replace("-", "").trim();
		
		
		
		

		int[] j = {2,3,4,5,6,7,8,9,2,3,4,5};
		int sum=0;
		
		int i=0;
		
		for(i=0;i<j.length;i++) {
			int temp =(agenums.charAt(i)-48)*j[i];
			sum += temp;
		}
		
		System.out.println(sum);
		

	}

}
