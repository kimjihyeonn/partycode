package ����;

import java.util.Scanner;

public class OperatorEx02 {

	

	public static void main(String[] args) {
		System.out.println("�����Է�>>>");
		
		/***
		 * ������(conster)��?
		 * 1. Ŭ�����̸��� ����
		 * 2. Ŭ�����̸�()
		 * 3. �Ұ�ȣ �ȿ��� � ���ڰ��� ���ϴµ�~~
		 * 4. ���ڰ��� 0��, 1��, 2��, 3��, ....
		 * 5. ������ ������ ���� ���� ������ Ÿ���� �޶�� �Ѵ�.
		 */
		//scan�� Scanner Ŭ���� �������������̴�.  
		Scanner scan = new Scanner(System.in);
		//system.in , system.out ǥ���Է�,ǥ�����(Ű����κ��� �Է��� �ްڴ�.)
		int score =scan.nextInt();  //���ڿ� "90"�̴�. => ���� 90 ��ȯ 
		
		String grade = score >= 90 ? "A����" :
			           score >= 80 ? "B����" : "F����";
			        	   
			           
		System.out.println(grade);	        	   
			            
		

	}

}
