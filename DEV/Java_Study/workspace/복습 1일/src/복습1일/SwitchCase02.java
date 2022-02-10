package switch_case예제;

import java.util.Scanner;

/***
 * 
 *어느 회사에서 고객 관리 등급을 처리하고자 한다.
 *일반 고객(C) , 골드고객(B) ,VIP고객(A)
 *비교 판단문의 switch문으로 해결하자!
 *
 */

public class SwitchCase02 {

	public static void main(String[] args) {
		//입력 단계
		
      System.out.println("고객 등급 입력 >>>");
      
      Scanner scan = new Scanner(System.in);
      //"A" 즉 문자열로 입력받는다.
      //사용자가 "ABC"로 입력하면 
      //[중요] 왜 메소드 중첩해서 호출한 이유? => 이해요
       char grade = scan.next().charAt(0);
       //처리 단계
       
       switch(grade) {
       //"A'는 문자열
       case 'A' :
       case 'a':   
           System.out.println("VIP 고객입니다.");
            break;
            
       case 'B':
       case 'b':
    	   System.out.println("골드 고객입니다.");
    	   break;
       default:
    	   System.out.println("일반 고객입니다.");
    	 
    	
	 }
	}
}
