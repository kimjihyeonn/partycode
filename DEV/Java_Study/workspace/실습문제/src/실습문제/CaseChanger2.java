package �ǽ�����;

import java.util.Scanner;

public class CaseChanger2 {

	public static void main(String[] args) {
		System.out.print("���� ���ڸ� �Է��ϼ���>>");
		Scanner scan = new Scanner(System.in);
		char alpha=scan.nextLine().charAt(0);
		

		if(alpha>='a'&& alpha<='z') {
			alpha = (char)(alpha-32);
		}else if(alpha>='A'&& alpha<='Z') {
			alpha=(char)(alpha+32);
		}else {
			System.out.println("�����ڰ� �ƴմϴ�.");
			System.exit(0);
		}
       System.out.println(alpha);
       System.exit(0);
	}

}
