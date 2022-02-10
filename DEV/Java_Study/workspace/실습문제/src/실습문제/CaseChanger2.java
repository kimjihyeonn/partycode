package 실습문제;

import java.util.Scanner;

public class CaseChanger2 {

	public static void main(String[] args) {
		System.out.print("문자 한자를 입력하세요>>");
		Scanner scan = new Scanner(System.in);
		char alpha=scan.nextLine().charAt(0);
		

		if(alpha>='a'&& alpha<='z') {
			alpha = (char)(alpha-32);
		}else if(alpha>='A'&& alpha<='Z') {
			alpha=(char)(alpha+32);
		}else {
			System.out.println("영문자가 아닙니다.");
			System.exit(0);
		}
       System.out.println(alpha);
       System.exit(0);
	}

}
