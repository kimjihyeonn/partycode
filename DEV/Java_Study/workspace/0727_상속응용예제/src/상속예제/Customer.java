package ��ӿ���;

/*
 * �θ� Ŭ���� ����
 */
public class Customer {
   //������� ����=>��ü�� �Ӽ�
	protected int customerID;  //�� ���̵�
	protected String customerName; // ���� �̸�
	protected String customerGrade; //�� ���
	protected int bonusPoint; //���ʽ� ����Ʈ
	protected double bonusRatio; //���� ����
	
	
	//������ ����

	public Customer(int customerID,String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade = "GENERAL"; //�Ϲݰ�
		bonusRatio= 0.01; //1%
		
		
	}
	//�޼ҵ� ����
	public int calcPrice(int price) {
		bonusPoint +=price *bonusRatio;
		return price;
	}
	//���� ������ ����� �޼ҵ�
	
	public String showCustomerInfo() {
		return customerName + "���� ������� "+ customerGrade+"�̸�,"
				+"���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�.";
		
	}
	//�� ������� �ϳ��� getter setter �޼ҵ屸��
	
	//getter setter �޼ҵ� ����� ��Ģ
	//getter�޼ҵ�� ��ȯŸ���� �ִ�.(����) return���� �ݵ�� �����ؾ��Ѵ�. �Ű�������  ���� �ʴ´�.
	//setter �޼ҵ�� ����(void=���ϰ��̾���) �̰�,�Ű������� �޾ƾ��Ѵ�.
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
	
}
