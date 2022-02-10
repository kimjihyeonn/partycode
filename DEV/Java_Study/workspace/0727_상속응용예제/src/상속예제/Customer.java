package 상속예제;

/*
 * 부모 클래스 설계
 */
public class Customer {
   //멤버변수 선언=>객체의 속성
	protected int customerID;  //고객 아이디
	protected String customerName; // 고객의 이름
	protected String customerGrade; //고객 등급
	protected int bonusPoint; //보너스 포인트
	protected double bonusRatio; //적립 비율
	
	
	//생성자 구현

	public Customer(int customerID,String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade = "GENERAL"; //일반고객
		bonusRatio= 0.01; //1%
		
		
	}
	//메소드 구현
	public int calcPrice(int price) {
		bonusPoint +=price *bonusRatio;
		return price;
	}
	//고객의 정보를 출력할 메소드
	
	public String showCustomerInfo() {
		return customerName + "님의 고객등급은 "+ customerGrade+"이며,"
				+"보너스 포인트는"+bonusPoint+"입니다.";
		
	}
	//각 멤버변수 하나당 getter setter 메소드구현
	
	//getter setter 메소드 만드는 규칙
	//getter메소드는 반환타입이 있다.(리턴) return문이 반드시 존재해야한다. 매개변수를  받지 않는다.
	//setter 메소드는 무형(void=리턴값이없다) 이고,매개변수는 받아야한다.
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
