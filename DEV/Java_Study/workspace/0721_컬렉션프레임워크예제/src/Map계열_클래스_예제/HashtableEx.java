package Map�迭_Ŭ����_����;

import java.util.Hashtable;
import java.util.Scanner;

/*            Ű     ��
 *  �α��� ���=> ID, Password
 */

public class HashtableEx {

	public static void main(String[] args) {
		//ID,Password ��ü ����
		String[] userID= {"Lee","Kim","Jang","Wang","Ha"};
		String[] password= {"L123","K456","J234","W879","H12345"};
		
        //Hashtable ��ü ����
		Hashtable<String, String> ht 
		       = new Hashtable<String, String>(5);
		
		
		
		//ID, Password�� ��ü�� �߰��۾�
		for(int i=0; i<5; i++) {
			ht.put(userID[i], password[i]);
			
		
		}
		
		System.out.println(ht);
		//{Jang=J234, Ha=H12345, Lee=L123, Wang=W879, Kim=K456}
		//���� ó��
		
		boolean FLAG =true;  //����ġ ����=> �빮�ڷ�����! ����
        while(FLAG) {
        	System.out.print("���� ID�� >>>");
        	Scanner scan = new Scanner(System.in);
        	String user_key = scan.next();
        	String pw_value = ht.get(user_key);
        	
        	if(pw_value != null) {
        		System.out.println("�佺�����>>>");
        		
        		String passwordInput = scan.next();
        		if(pw_value.equals(passwordInput) ) {
        			System.out.println("��������! ��ġ�� ��ġ�մϴ�");
        			
        	    
        			
        		}else {
        			System.out.println("���� ����! ��ȣ����ġ ���� �ʽ��ϴ�.");
        		}}
        		else {
        			System.out.println("��ϵ��� ���� ID�Դϴ�.");
        		}
        	}
        	
        }
	}
	
	
	
	


