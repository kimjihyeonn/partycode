package switch_case����;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
	   //���� ���� �� �ʱ�ȭ
	  char medalColor;
	  System.out.println("��� �Է�>>>");
		
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
		int ranking =scan.nextInt();  //���ڿ� "90"�̴�. => ���� 90 ��ȯ 
		
	  
	  
	  
	  switch(ranking) {
		  case 1 : medalColor = 'G';
		      break;
		  case 2 : medalColor = 'S';
	        break;
		  case 3 : medalColor = 'B';
	       break;
	      default:
	    	  medalColor = 'A';
	  }
          System.out.println(ranking + "�� �޴��� ������" +medalColor + "�Դϴ�.");
	}

}
