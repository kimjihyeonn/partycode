package 가상로봇_릴레이경주하기;

import java.util.Random;

/*
 * 작업스레드
 */
//RobotRace 클래스는 스레드를 처리할 수 있는 스레드 클래스가 된것이다.
public class RobotRace extends Thread {
     //생성자
	public RobotRace(String name) {
		super(name);
		
		
	}
	//run() 메소드를 수동으로 오버라이딩시키는 방법=> 소문자r만 입력시키고 컨트롤 스페이스바
     @Override
    public void run() {
    	 for(int i=1; i<=10;i++) {
    		 System.out.println(getName() +"가"+i*10+"m전진");
    		 try {sleep(1000);
    		 
    		 }catch(InterruptedException e) {
    			 System.out.println(e.toString());
    		 }
    	 }
    	  
    }	
}
