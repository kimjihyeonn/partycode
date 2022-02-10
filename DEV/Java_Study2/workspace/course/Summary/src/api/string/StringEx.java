package api.string;

import java.util.Arrays;

public class StringEx {
	
	
	public static void main(String[] args) {
		String  str = "안녕하세요";
		
		
		String str2 = new String("안녕하세요");
		
		char[] arr = {'안','녕'};
		
		String str3 = new String(arr);
		
		char c = str.charAt(1);
		System.out.println(c);
		//문자열자르기
		
		String str4 = "자바는 왜 이름이 자바일까요? 자바의 어원은 커피집입니다.";
		
		String str5=str4.substring(4); //4미만 절삭
		
		System.out.println(str5);
		
		String str6 = str4.substring(0, 7); // 4~7이하 추출
		System.out.println(str6);
		
		String str7 = "010-300-3908";
		String[] str9 = str7.split("-");
		System.out.println(str9[0]);
		System.out.println(Arrays.toString(str9));
	
		
		//문자열 치환(원본 문자열을 변경)
		
		str4=str4.replace(" ", "");
		System.out.println(str4);
		
		Object obj = new String();
		
		
	}

}
