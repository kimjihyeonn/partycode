package �ǽ�����_0802;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreeSixNine2 {

	public static void main(String[] args) {
		System.out.print("1~9999���ڸ� �Է��ϼ��� ");
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		
     
		
		String[] clap = {"3","6","9"};
		
		int[] result = new int[clap.length];
		
		for(int j=0;j<clap.length;j++) {
			 
			Pattern p = Pattern.compile(clap[j]);
						
			Matcher m = p.matcher(number);
			
			int count =0;
			
			while(m.find()) {
				
				count++;
				
			
				}
			result[j] += count;
	      
		}
		int sum=0;
		for(int i=0; i<result.length;i++) {
			
	    	sum = sum + result[i];
	    	
	}
		if(sum==1) {
			System.out.println("�ڼ�¦");
			
		}
		else if(sum==2) {
			System.out.println("�ڼ�¦¦");
		}
		else if(sum==3) {
			System.out.println("�ڼ�¦¦¦");
			
		}
		else if(sum==4) {
			System.out.println("�ڼ�¦¦¦¦");
			
		}
		else {System.out.println("�ԷµȰ��� 3,6,9�� �����ϴ�.");
}

}			
	
}
			
	
	
  


