package Phone추상클래스만들기;
/*
 * 실행 클래스
 */

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		TelePhone telePhone = new TelePhone("박태호");
		
		System.out.println(smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.internectSearch();
		smartPhone.turnOff();
		
		System.out.println(); //줄바꿈
		
		System.out.println(telePhone.owner);
		telePhone.turnOn();
		telePhone.autoAnswering();
		telePhone.turnOff();
				
	}

}


