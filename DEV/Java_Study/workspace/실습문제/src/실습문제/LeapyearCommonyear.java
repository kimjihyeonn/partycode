package �ǽ�����;

import java.util.Scanner;

public class LeapyearCommonyear {

	public static void main(String[] args) {
		int year;
		
		System.out.println("�⵵�� �Է��ϼ���>>>");
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		
		//ó�� => ��������&&��||
		if(year%4 ==0 && year%100!=0||year%400==0) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("����Դϴ�.");
		}

	}

}
