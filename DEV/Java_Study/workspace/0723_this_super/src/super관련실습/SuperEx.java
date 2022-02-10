package super관련실습;

class Man{   //부모(상위)클래스
	String name; //이름
	//디폴트 생성자
	public Man() {
		
	};
	
	//매개변수가 있는 생성자
	public Man(String name) {
		this.name=name;
	}
	//메소드 구현
	//접근제어자 리턴타입 
	public void tellYourName() {
		System.out.println("My name is" + name);
		
	}
}
/*
 * super: 부모 클래스 필드(멤버변수)에 접근하고자 할때
 * super():부모 클래스의 생성자를 요구할 때 사용[주의할점] 반드시 첫번째 문장에 와야함!
 */
class BusinessMan extends Man{//자식 클래스
	//필드 선언
	String company;  //근무 회사이름
	String position; //직급
	
	
	public BusinessMan(String name, String company, String position)
	{ super(name);
	this.company = company;
	this.position = position;
	}
	//메소드 구현
	public void tellYourInfo() {
		System.out.println("My company is" + company);
		System.out.println("My position is" + position);
		
	}
};
public class SuperEx {

	public static void main(String[] args) {
		//객체 생성
		BusinessMan man1= new BusinessMan("박태호", "LG디스플레이", "부장");
		BusinessMan man2= new BusinessMan("김태호", "LG디스플레이", "과장");
		System.out.println("First man info =>");
		man1.tellYourInfo();
		man1.tellYourName();
		
		
		System.out.println("Second man info =>");
		man2.tellYourInfo();
		man2.tellYourName();
		
		
	}

}
