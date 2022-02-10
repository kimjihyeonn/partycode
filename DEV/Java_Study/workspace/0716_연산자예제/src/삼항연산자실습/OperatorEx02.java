package 삼항연산자실습;

import java.util.Scanner;

/***
 * 
 * 키보드로부터 점수를 입력받아 학점을 평가하는 프로그램
 *
 */
public class OperatorEx02 {

	public static void main(String[] args) {
		
       System.out.print("점수 입력>>>");
       
       
       Scanner scan = new Scanner(System.in);
       int score = scan.nextInt();
       
       String grade = score >= 90 ? "A학점" :
                      score >= 80 ? "B학점" :   
                      score >= 70 ? "C학점" :
                      score >= 60 ? "D학점" : "F학점";
                      
       System.out.println("교육생의 학점은" + grade + "입니다.");  
       
       
	}

}
