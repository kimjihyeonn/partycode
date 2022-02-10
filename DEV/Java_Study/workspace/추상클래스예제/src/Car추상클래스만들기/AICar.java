package Car추상클래스만들기;
/*
 * 실채 클래스
 */

public class AICar extends Car {
	@Override //어노테이션
	public void drive() { //'약속'을 지켜달라!=>자식 클래스 용도에 맞게 재정의해서 사용
		System.out.println("자율 주행합니다.");
		System.out.println("자율주행 자동차가 스스로 방향을 전환한다.");
		
		
	}

	@Override
	public void stop() { //'약속'을 지켜달라=> 자식 클래스 용도에 맞게 재정의해서 사용
		System.out.println("스스로 멈춘다.");
		
		
	}


}
