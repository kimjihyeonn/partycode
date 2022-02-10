package Car추상클래스만들기;

public class CarTest {
	public static void main(String[] args) {
		
		System.out.println("<<<자율주행하는 자동차>>>");
		//객체 생성
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println();
		
		System.out.println("<<<사람이 운전하는 일반자동차>>>");
        
		Car hisCar= new ManualCar();
		hisCar.run();
	}

}

