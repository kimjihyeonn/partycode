package 실습문제;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminCheck {

	public static void main(String[] args) {
		
		int[] weight= {2,3,4,5,6,7,0,8,9,2,3,4,5};
		String juminNum;
		int sum= 0;
		int temp, result;
		
		
		System.out.println("주민번호 입력>>>");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();
		
		String regex ="^[0-9]{2}([0][1-9]|[1][0-2])([0][1-9]|[12][0-9]|[3][01])-[1234][0-9]{6}$";
		
		boolean check = Pattern.matches(regex, juminNum);
		
		if(check ==false) {
			System.out.println("입력된 주민번호는 패턴에 맞지 않습니다.");
			return;
		}
		System.out.println("패턴에 적합합니다.");
		
		
		for(int i=0; i<weight.length;i++) {
			if(juminNum.charAt(i)=='-')continue;
			sum=sum+(juminNum.charAt(i)-'0')*weight[i];
		}
		temp=11-(sum%11);
		result = temp%10;
		if(result==juminNum.charAt(13)-'0') {
			System.out.println("주민번호 정상입니다.");
		}
		Calendar cal = Calendar.getInstance(Locale.KOREA);
		int year = cal.get(Calendar.YEAR);
		int yy=Integer.parseInt(juminNum.substring(0,2));
		if(juminNum.charAt(7)-'0'<3) {
			yy= yy+1900;
		}else
		{yy=yy+2000;
		
		}
		int age=year-yy+1;
		System.out.println("나이:"+age);
		if((juminNum.charAt(7)-'0')%2==0) {
			System.out.println("성별:여자");
		}else {
			System.out.println("성별:남자");
		}
		String[][] localeCode = {{"서울","00","08"},{"부산","09","12"},{"인천","13","15"},{"경기","16","25"},
				{"강원","26","34"},{"충북","35","39"},{"대전","40","40"},{"충남","41","43"},{"충남","45","47"},{
					"세종","44","44"},{"세종","96","96"},{"전북","48","54"},{"광주","65","66"},{"대구","67","70"}
					,{"경북","71","80"},{"경남","81","84"},{"경남","86","90"},{"울산","85","85"},{"제주","91","95"}
				};
		String localeString = juminNum.substring(8,10);
		int locale = Integer.parseInt(localeString);
		String birthPlace=null;
		for(int j=0; j<=localeCode.length-1;j++) {
			if(locale>=Integer.parseInt(localeCode[j][1]) && locale <=Integer.parseInt(localeCode[j][2])) {
				birthPlace = localeCode[j][0];
			}
		}
			System.out.println("출생지역:"+birthPlace);	
	}

}
