package 복습1일;

import java.util.Scanner;

public class Yoonnyeon {

	public static void main(String[] args) {
		System.out.print("연도를 입력하세요>>");
		Scanner scan = new Scanner(System.in);
		int yyear = scan.nextInt();
		
		if(yyear%4!=0||yyear%400!=0&&yyear%100==0 ) {
			System.out.println("평년입니다.");
			
		}else {
			System.out.println("윤년입니다.");
		}


	}

}
