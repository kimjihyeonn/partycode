package 실습문제_0802;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreeSixNine {

	public static void main(String[] args) {
		System.out.print("1~9999숫자를 입력하세요 ");
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		
			
			for(int j=0; j<number.length();j++) {
				
				char Num=number.charAt(j);
				if(Num=='3'|| Num=='6'||Num=='9') {
					System.out.print("짝");
				} else {
					System.out.println("입력된값에 3,6,9가없습니다.");
					break;
				}
			
				
		   
			
		
		
   
		
			
		}
	}
}


