package 상속예제;
/*
 *  DecimalFormat (java.text패키지)
 *  생성자 DecimalFormat(String pattern)
 *  메소드 String format(long number)
 *  
 */
public class CustomerTest {
	//추가
	public static String price_value;  //클래스 변수(static 변수)

	public static void main(String[] args) {
		
		
		Customer customerPark =new Customer(10010,"박태호");
		
		customerPark.bonusPoint =1000;
		System.out.println(customerPark.showCustomerInfo());
		//박태호님의 고객등급은 GENERAL이며,보너스 포인트는1000입니다.
		
		int pricePark=customerPark.calcPrice(20000);
		
		price_value=Utils.toNumberFormat(pricePark);
		
		System.out.println("상품 지불 금액:" + pricePark);
		//상품 지불 금액:20000
		System.out.println(customerPark.showCustomerInfo());
		//박태호님의 고객등급은 GENERAL이며,보너스 포인트는1200입니다.
		
		System.out.println(customerPark.bonusPoint);
		
		VIPCustomer customerSon=new VIPCustomer(10020, "손흥민", 12345);
		
		customerSon.bonusPoint =50000;
		System.out.println(customerSon.showCustomerInfo());
		int priceSon = customerSon.calcPrice(200000);
		System.out.println("상품지불금액:"+priceSon);
		
		int agentID=customerSon.getAgentID();
		System.out.println("VIP고객전문상담원 ID :"+ agentID);
		
		
		
//		손흥민님의 고객등급은 VIP이며,보너스 포인트는50000입니다.
//		상품지불금액:180000
//		VIP고객전문상담원 ID :12345
		System.out.println();
		
		GoldCustomer customerKim= new GoldCustomer(10030,"김지현");
		customerKim.bonusPoint =10000;
		System.out.println(customerKim.showCustomerInfo());
		int priceKim=customerKim.calcPrice(20000);
		System.out.println("상품지불금액:"+priceKim);
		System.out.println("보너스 누적액은:"+customerKim.bonusPoint);
	}

	

}
