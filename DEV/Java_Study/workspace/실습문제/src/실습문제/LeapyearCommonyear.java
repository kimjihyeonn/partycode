package 실습문제;

import java.util.Scanner;

public class LeapyearCommonyear {

	public static void main(String[] args) {
		int year;
		
		System.out.println("년도를 입력하세요>>>");
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		
		//처리 => 논리연산자&&와||
		if(year%4 ==0 && year%100!=0||year%400==0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}

	}

}
