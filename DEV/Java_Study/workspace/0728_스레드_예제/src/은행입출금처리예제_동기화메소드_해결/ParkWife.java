package 은행입출금처리예제_동기화메소드_해결;

public class ParkWife extends Thread {
	@Override
	public void run() {
		
		BankMain.myBank.minusMoney(2000);
		
		
		System.out.println("아내 출금 후 잔액:"+BankMain.myBank.getMoney());
		
	}

}
