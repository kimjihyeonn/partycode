package �ǽ�����_0802;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminNum {

	public static void main(String[] args) {
		System.out.print("�ֹι�ȣ �Է�>>>>��) 000000-0000000>>> ");
		Scanner scan = new Scanner(System.in);
		String juminNum = scan.next();
		
		String regex = "^[0-9]{2}([0][1-9]|[1][0-2])([0][1-9]|[12][0-9]|[3][01])-[1234][0-9]{6}$";
        boolean check = Pattern.matches(regex, juminNum);
		
		if(check == false) {
			System.out.println("�Էµ� �ֹι�ȣ�� ����ǥ���� ���Ͽ� ���� �ʽ��ϴ�.");
			return;
		}
		System.out.println("�Էµ� �ֹι�ȣ�� ���� ǥ���� ���Ͽ� �����մϴ�.");
		
		
		String juminNew=juminNum.replace("-","");
		
		String JuminFront = juminNew.substring(0, 6);
		String JuminBack = juminNew.substring(6,13);
		System.out.println(JuminFront);
	    System.out.println(JuminBack);
	    
	    
	    
		System.out.print(" - �����Ͽ� �ֹι�ȣ �Է�>>>> ");
		Scanner sc = new Scanner(System.in);
		String juminNum2 = sc.next();
		
		String[] jumindivide=juminNum2.split("-");
		String jumin1 =jumindivide[0];
		String jumin2 =jumindivide[1];
		System.out.println(jumin1);
		System.out.println(jumin2);
	}

	
}
