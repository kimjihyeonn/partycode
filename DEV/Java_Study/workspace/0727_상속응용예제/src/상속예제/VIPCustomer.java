package ��ӿ���;
/*
 * 
 */

public class VIPCustomer extends Customer{
	//VIP �����Ը� �ʿ��� �ɹ����� => �θ��5�� �ڽŰ�2��=��7���� ������ �� �ִ�.
	
	double saleRatio;  // ���η�
	private int agentID; //���������� ID
	
	
	
	//������
	public VIPCustomer(int customerID,String customerName,int agentID) {
		super(customerID,customerName);
		customerGrade ="VIP";
		bonusRatio = 0.05;
		saleRatio =0.1; //������
		this.agentID=agentID;
		
	}
   //�޼ҵ� ����
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return (price -(int)(price*saleRatio));
		
	}
	public int getAgentID() {
		return agentID;
	}
	
}
