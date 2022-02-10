package Car추상클래스만들기;

/*
 * 
 * 추상 클래스
 */

public abstract class Car {
	
	//추상메소드
	
	public abstract void drive();// {}가 없는 메소드를 추상메소드라함!!
	public abstract void stop();
	
	//일반 메소드
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
    public void turnOff() {
    	System.out.println("시동을끕니다.");
    }
	//[중요]템플릿 메소드 => 디자인 패턴중의 하나다.
	//run() 템플릿 메소드는 Car가 어떻게 달려야 하는지를 구현해야 한다.
	//즉 '싫행순서'와 '시나리오' 정의 할 때 적용
	 //final 시나리오 실행순서가 변함이없다.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
