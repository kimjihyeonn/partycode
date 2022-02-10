package 삼항;

import java.util.Scanner;

public class OperatorEx02 {

	

	public static void main(String[] args) {
		System.out.println("정수입력>>>");
		
		/***
		 * 생성자(conster)란?
		 * 1. 클래스이름과 동일
		 * 2. 클래스이름()
		 * 3. 소괄호 안에는 어떤 인자값을 원하는데~~
		 * 4. 인자값이 0개, 1개, 2개, 3개, ....
		 * 5. 인자의 갯수가 같을 때는 데이터 타입이 달라야 한다.
		 */
		//scan은 Scanner 클래스 객참참조변수이다.  
		Scanner scan = new Scanner(System.in);
		//system.in , system.out 표준입력,표준출력(키보드로부터 입력을 받겠다.)
		int score =scan.nextInt();  //문자열 "90"이다. => 정수 90 변환 
		
		String grade = score >= 90 ? "A학점" :
			           score >= 80 ? "B학점" : "F학점";
			        	   
			           
		System.out.println(grade);	        	   
			            
		

	}

}
