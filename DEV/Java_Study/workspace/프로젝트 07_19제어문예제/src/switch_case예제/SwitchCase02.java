package switch_case����;

import java.util.Scanner;

/***
 * 
 *��� ȸ�翡�� �� ���� ����� ó���ϰ��� �Ѵ�.
 *�Ϲ� ��(C) , ����(B) ,VIP��(A)
 *�� �Ǵܹ��� switch������ �ذ�����!
 *
 */

public class SwitchCase02 {

	public static void main(String[] args) {
		//�Է� �ܰ�
		
      System.out.println("�� ��� �Է� >>>");
      
      Scanner scan = new Scanner(System.in);
      //"A" �� ���ڿ��� �Է¹޴´�.
      //����ڰ� "ABC"�� �Է��ϸ� 
      //[�߿�] �� �޼ҵ� ��ø�ؼ� ȣ���� ����? => ���ؿ�
       char grade = scan.next().charAt(0);
       //ó�� �ܰ�
       
       switch(grade) {
       //"A'�� ���ڿ�
       case 'A' :
       case 'a':   
           System.out.println("VIP ���Դϴ�.");
            break;
            
       case 'B':
       case 'b':
    	   System.out.println("��� ���Դϴ�.");
    	   break;
       default:
    	   System.out.println("�Ϲ� ���Դϴ�.");
    	 
    	
	 }
	}
}
