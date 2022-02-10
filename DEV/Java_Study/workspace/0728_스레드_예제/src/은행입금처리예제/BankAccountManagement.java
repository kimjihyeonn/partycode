package 은행입금처리예제;

public class BankAccountManagement {

	public static void main(String[] args) {
		 Account acntData= new Account();
		 
		 Customer cus1=new Customer("thread1", acntData);
		 Customer cus2=new Customer("thread2", acntData);
			
		 cus1.start();
		 
		 cus2.start();
		 
		 try {
			 cus1.join();
			 cus2.join();
		 }catch(InterruptedException e) {
		 System.out.println(e);
		 }
		 System.out.println("최종잔액="+acntData.getBalance());
	}
   
	/*thread2:이전잔액=0 가산액=10000 합계액:10000
thread1:이전잔액=10000 가산액=10000 합계액:20000
thread2:이전잔액=20000 가산액=10000 합계액:30000
thread1:이전잔액=30000 가산액=10000 합계액:40000
thread2:이전잔액=40000 가산액=10000 합계액:50000
thread1:이전잔액=50000 가산액=10000 합계액:60000
최종잔액=60000
*/
	}

