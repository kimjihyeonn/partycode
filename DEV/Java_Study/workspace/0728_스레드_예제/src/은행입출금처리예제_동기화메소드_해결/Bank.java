package 은행입출금처리예제_동기화메소드_해결;
/*
 * 스레드 동기화 예제 => 동기화 메소드
 */
public class Bank {
	//멤버변수
	private int money = 10000;// 원금(공유될 자원)
	//getter,setter메소드 
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	//필요한 메소드 구현
	public synchronized void saveMoney(int save) {
		
	
		int m = money;
		try {Thread.sleep(1000);
			
	}catch(Exception e) {
			System.out.println(e);
			
		}
		money = m + save;
		System.out.println("입금처리완료됨!");
	}
	public synchronized void  minusMoney(int minus) {
		int m = money;
		try {Thread.sleep(500);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		money=m-minus;
		System.out.println("출금처리완료됨!");
		
	}


}
