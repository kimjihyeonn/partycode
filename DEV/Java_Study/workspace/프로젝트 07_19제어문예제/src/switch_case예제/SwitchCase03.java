package switch_case����;

import java.util.Scanner;

/***
 * 
 * 
 * ��� ȸ���� ������ ������ �Է��ϸ� �� ���޿� �ش��ϴ� �޿����� 
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 *
 */
public class SwitchCase03 {

	public static void main(String[] args) {
		
		System.out.print("���� �Է� >>>");
		
		Scanner scan = new Scanner(System.in);
		String position = scan.next();
		String pay;
		/*
		 * �ڹ� ����6������ switch���� �Ұ�ȣ �ȿ��� 
		 * �⺻Ÿ����(byte, char, short, int , long)������ �������� �����ϴ�
		 * ����ĸ� �� �� �־���.
		 * ������, �ڹٹ���7���ʹ� String Ÿ���� ������ �� �� �ִ�.
		 */
		
		
		switch(position) {
		//position,pay,scan ��ü��������
		
		case "����" : pay = "700����";
		  break;
		  
		case "����" : pay = "500����";
		  break;
		case "�븮" : pay = "350����";
		  break;
	
		default :
			pay="280";
			
		
		}
		System.out.println(position+"���� ������"+pay+"�Դϴ�");
	}

}
