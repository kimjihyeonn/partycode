package 상속예제;

public class GoldCustomer extends Customer{
	
	double discount;
	
	
	

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade="GOLD";
		bonusRatio=0.02;
		discount = 0.1;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return price=price-(int)(price*discount);
	}

	

}
