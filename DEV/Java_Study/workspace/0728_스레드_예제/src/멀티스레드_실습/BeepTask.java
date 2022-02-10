package 멀티스레드_실습;

import java.awt.Toolkit;

/*
 * 작업 스레드 역할
 */

public class BeepTask implements Runnable {

	@Override
	public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //객체얻기
        
		for(int i=0; i<5;i++) {
			toolkit.beep();  //비프음 발생
			try {Thread.sleep(1000);}//1초간 일시 정지
			catch(Exception e) {
				
			}
		}
		
		
	}
	

}
