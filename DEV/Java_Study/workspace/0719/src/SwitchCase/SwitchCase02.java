package SwitchCase;

import java.util.Scanner;

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
