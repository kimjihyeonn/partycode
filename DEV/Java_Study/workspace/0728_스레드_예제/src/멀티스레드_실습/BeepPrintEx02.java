package 멀티스레드_실습;
/*
 * 메인스레드 역할
 */

import java.awt.Toolkit;

public class BeepPrintEx02 {
	//메인스레드 

	public static void main(String[] args) {
    //[방법1]
		/*
    //인터페이스 이름  참조변수    =new  생성자();
	  Runnable beepTask = new BeepTask();
      Thread thread = new Thread(beepTask);
      
      
     
      //이 시점에서 작업스레드를 시작시켜라 =>메인스레드 작업스레드가 동시에 수행
      thread.start();
      
      for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(1000);}
			catch(Exception e) {
				
			}
		}	*/
      //[방법2] 중요
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() { Toolkit toolkit = Toolkit.getDefaultToolkit(); //객체얻기
	        
			for(int i=0; i<5;i++) {
				toolkit.beep();  //비프음 발생
				try {Thread.sleep(1000);}//1초간 일시 정지
				catch(Exception e) {
					
				}
			 
			 }
			}
		});
		thread.start();
		 for(int i=0;i<5;i++) {
				System.out.println("띵");
				try {Thread.sleep(1000);}
				catch(Exception e) {
					
				}
		 }
		
      
	}
    
}
