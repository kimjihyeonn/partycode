package ½Ç½À¹®Á¦_0802;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreeSixNine2 {

	public static void main(String[] args) {
		System.out.print("1~9999¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä ");
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
			System.out.println("¹Ú¼öÂ¦");
			
		}
		else if(sum==2) {
			System.out.println("¹Ú¼öÂ¦Â¦");
		}
		else if(sum==3) {
			System.out.println("¹Ú¼öÂ¦Â¦Â¦");
			
		}
		else if(sum==4) {
			System.out.println("¹Ú¼öÂ¦Â¦Â¦Â¦");
			
		}
		else {System.out.println("ÀÔ·ÂµÈ°ª¿¡ 3,6,9°¡ ¾ø½À´Ï´Ù.");
}

}			
	
}
			
	
	
  


