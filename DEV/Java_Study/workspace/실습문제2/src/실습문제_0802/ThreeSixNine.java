package �ǽ�����_0802;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreeSixNine {

	public static void main(String[] args) {
		System.out.print("1~9999���ڸ� �Է��ϼ��� ");
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		
			
			for(int j=0; j<number.length();j++) {
				
				char Num=number.charAt(j);
				if(Num=='3'|| Num=='6'||Num=='9') {
					System.out.print("¦");
				} else {
					System.out.println("�ԷµȰ��� 3,6,9�������ϴ�.");
					break;
				}
			
				
		   
			
		
		
   
		
			
		}
	}
}


