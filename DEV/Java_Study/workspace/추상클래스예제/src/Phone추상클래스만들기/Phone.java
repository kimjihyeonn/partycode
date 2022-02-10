package Phone추상클래스만들기;
/**
 * 추상클래스!!!
 * 
 * 
 * abstract = 추상!!
 */

public abstract class Phone {
	//필드 선언
	public String owner;  //폰의 소유자 이름
	
	
    
	//생성자
	public Phone(String owner) {
		this.owner=owner;
	}
	//메소드 구현
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
