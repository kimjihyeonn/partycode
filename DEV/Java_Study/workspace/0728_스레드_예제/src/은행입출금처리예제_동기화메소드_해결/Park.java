package 은행입출금처리예제_동기화메소드_해결;
/*
 * 스레드 동기화 예제 => 
 */

public class Park extends Thread {
	
	@Override
	public void run() {
		BankMain.myBank.saveMoney(5000);
			
		
		System.out.println("남편 예금 후 잔고확인"+BankMain.myBank.getMoney());
	}

}
