package 실습문제;

import java.util.Scanner;

public class CaseChanger {

	public static void main(String[] args) {
		
		System.out.print("문자 한자를 입력하세요>>");
		Scanner scan = new Scanner(System.in);
		char english=scan.nextLine().charAt(0);
		

		int ENG=(int)english-32;
		int eng=(int)english+32;
		if(english<97){
			System.out.println((char)eng);}
		
		
		if(english>=97) {
			System.out.println((char)ENG);
		}
		
		
			}
		
		
	}


