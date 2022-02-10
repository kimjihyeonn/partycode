package 상속예제;

import java.text.DecimalFormat;

/*
 * 금액에 천단위 마다 콤마 넣기 클래스
 * 
 */

public class Utils {
	//정적(static) 메소드 구현
	public static String toNumberFormat(long Amount) {
		DecimalFormat df= new DecimalFormat("#,###");
		return df.format(Amount);
	}

}
