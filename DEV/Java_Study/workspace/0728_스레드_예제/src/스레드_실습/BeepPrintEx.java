package 스레드_실습;

import java.awt.Toolkit;

/*
 * 싱글스레드 어플리케이션 구현
 * Toolkit 클래스는"시스템 정보"를 얻는 것으로 시스템 자원
 */

public class BeepPrintEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //객체얻기
        
		for(int i=0; i<5;i++) {
			toolkit.beep();  //비프음 발생
			try {Thread.sleep(1000);}//1초간 일시 정지
			catch(Exception e) {
				
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(1000);}
			catch(Exception e) {
				
			}
		}	
		/*
		 * [실행결과]
		 * 비프음이 5번올리고나서 콘솔창에 '띵'을 5번 출력하고있다.
		 */
		
		
	}

}
