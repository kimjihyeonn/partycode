package 은행입금처리예제;

/*
 * 계좌클래스
 */

public class Account {

	private int balance=0;
    
	//메소드 구현
	//예금을 처리하는 메소드
		
	public synchronized void add(int deposit) {
		
		int current_amount=balance;
	
		System.out.println(Thread.currentThread().getName()+
				":이전잔액="+ balance+" "+"가산액="+deposit+
				" "+ "합계액:"+(current_amount+deposit) );
		 current_amount=current_amount +deposit;
		balance=current_amount;
		//추가
		
	  
		
	}
	//잔액을 가져오는 메소드
	public int getBalance() {
		return balance;
}
	
}
