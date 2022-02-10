package 주민등록번호;

import java.util.Scanner;

/**
 * 코드 처리 => 주민등록번호
 * 입력==> 정상 유무 체크 
 * 유효성검사방법
 * 
 * 
 * [중요]
 * 
 * 주민번호 체크 공식
 *        ○○○○○○ - ○○○○○○(●=>check digit check 자리(검사숫자))
 * 1단계:  xxxxxx  -xxxxxx
 *    sum 234567   892345 => 가중치(weight)
 * 2단계: temp =11-(sum%11)
 * 3단계: result =temp%10
 * 
 *  if result == ● => 주빈번호 정상
 *  if result !=● => 주민번호 비정상 
 *  */

public class Humannumber {

	public static void main(String[] args) {
		   
	    
		System.out.println("주민등록번호입력>>>");
		
		Scanner scan= new Scanner(System.in);
		String agenums= scan.next();
		
		
		
		//String nums = agenums.replace("-", "").trim();
		
		
		
		

		int[] j = {2,3,4,5,6,7,8,9,2,3,4,5};
		int sum=0;
		
		int i=0;
		
		for(i=0;i<j.length;i++) {
			int temp =(agenums.charAt(i)-48)*j[i];
			sum += temp;
		}
		
		System.out.println(sum);
		

	}

}
