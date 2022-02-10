package object.basic;

public class Account {
	String name;
	String password;
	int balance;
	Account(){
		
	}
	Account(String name,String password,int balance){
		this.name= name;
		this.password=password;
		this.balance=balance;
		
	}
	
	void withdrow(int a) {
		
		balance = balance -a;
		
		
	}
	void  deposit(int b) {
		balance = balance +b;
	}
	
	int getBalance() {
		return this.balance;
	}

}
