package switch_case예제;

import java.util.Scanner;

/***
 * 
 * 
 * 어느 회사의 직원의 직급을 입력하면 그 직급에 해당하는 급여액을 
 * 출력하는 프로그램을 작성하시오
 *
 */
public class SwitchCase03 {

	public static void main(String[] args) {
		
		System.out.print("직급 입력 >>>");
		
		Scanner scan = new Scanner(System.in);
		String position = scan.next();
		String pay;
		/*
		 * 자바 버전6까지는 switch문의 소괄호 안에는 
		 * 기본타입인(byte, char, short, int , long)변수인 정수값을 산출하는
		 * 연산식만 올 수 있었다.
		 * 하지만, 자바버전7부터는 String 타입의 변수도 올 수 있다.
		 */
		
		
		switch(position) {
		//position,pay,scan 객체참조변수
		
		case "부장" : pay = "700만원";
		  break;
		  
		case "과장" : pay = "500만원";
		  break;
		case "대리" : pay = "350만원";
		  break;
	
		default :
			pay="280";
			
		
		}
		System.out.println(position+"님의 월급은"+pay+"입니다");
	}

}
