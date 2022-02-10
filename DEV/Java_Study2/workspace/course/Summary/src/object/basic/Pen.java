package object.basic;

//설계도는 main이 없습니다.
public class Pen {
	//멤버변수
	
	String ink;
	int price;
	
	//생성자 = 인위적으로 생성자를 만들면 자동으로 생성자를 생성하지 않는다.
	
	Pen(){
          ink="파랑";
          price=3000;
          
          
	}
	
	Pen(String ink, int price){
		this.ink = ink;
		this.price =price;
	}
	//메서드
	
	void write() {
		
		System.out.println(ink + " 색 글씨를 씁니다.");
	}
	void info() {
		
		System.out.println("===펜의정보===");
		System.out.println("펜의색상:" +ink);
		System.out.println("펜의가격:"+price);
	}
	
	

}
