package ��ӿ���;
/*
 *  DecimalFormat (java.text��Ű��)
 *  ������ DecimalFormat(String pattern)
 *  �޼ҵ� String format(long number)
 *  
 */
public class CustomerTest {
	//�߰�
	public static String price_value;  //Ŭ���� ����(static ����)

	public static void main(String[] args) {
		
		
		Customer customerPark =new Customer(10010,"����ȣ");
		
		customerPark.bonusPoint =1000;
		System.out.println(customerPark.showCustomerInfo());
		//����ȣ���� ������� GENERAL�̸�,���ʽ� ����Ʈ��1000�Դϴ�.
		
		int pricePark=customerPark.calcPrice(20000);
		
		price_value=Utils.toNumberFormat(pricePark);
		
		System.out.println("��ǰ ���� �ݾ�:" + pricePark);
		//��ǰ ���� �ݾ�:20000
		System.out.println(customerPark.showCustomerInfo());
		//����ȣ���� ������� GENERAL�̸�,���ʽ� ����Ʈ��1200�Դϴ�.
		
		System.out.println(customerPark.bonusPoint);
		
		VIPCustomer customerSon=new VIPCustomer(10020, "�����", 12345);
		
		customerSon.bonusPoint =50000;
		System.out.println(customerSon.showCustomerInfo());
		int priceSon = customerSon.calcPrice(200000);
		System.out.println("��ǰ���ұݾ�:"+priceSon);
		
		int agentID=customerSon.getAgentID();
		System.out.println("VIP���������� ID :"+ agentID);
		
		
		
//		����δ��� ������� VIP�̸�,���ʽ� ����Ʈ��50000�Դϴ�.
//		��ǰ���ұݾ�:180000
//		VIP���������� ID :12345
		System.out.println();
		
		GoldCustomer customerKim= new GoldCustomer(10030,"������");
		customerKim.bonusPoint =10000;
		System.out.println(customerKim.showCustomerInfo());
		int priceKim=customerKim.calcPrice(20000);
		System.out.println("��ǰ���ұݾ�:"+priceKim);
		System.out.println("���ʽ� ��������:"+customerKim.bonusPoint);
	}

	

}
