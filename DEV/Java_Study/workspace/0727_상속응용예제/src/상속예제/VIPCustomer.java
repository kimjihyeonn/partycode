package 상속예제;
/*
 * 
 */

public class VIPCustomer extends Customer{
	//VIP 고객에게만 필요한 맴버변수 => 부모거5개 자신거2개=총7개를 접근할 수 있다.
	
	double saleRatio;  // 할인률
	private int agentID; //전문상담원의 ID
	
	
	
	//생성자
	public VIPCustomer(int customerID,String customerName,int agentID) {
		super(customerID,customerName);
		customerGrade ="VIP";
		bonusRatio = 0.05;
		saleRatio =0.1; //할인율
		this.agentID=agentID;
		
	}
   //메소드 구현
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return (price -(int)(price*saleRatio));
		
	}
	public int getAgentID() {
		return agentID;
	}
	
}
