package 모델링실습;

public class Car {
	//필드 선언
	private int speed;  //현재속도
	private int wheelNum; // 바퀴의 갯수
	private String carName; //자동차 이름
	//생성자 구현
	
	public Car(String name) {
		carName = name;
	}
	public Car(int velocity) {
		speed = velocity;
	}
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;
	}
	//메소드
	public void speedUp() {//속도를 올리는 기능
		speed = speed+1;
	}
	public void speedUp(int velocity) {
		speed = speed + velocity;
	}
		
		
	

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car("제너시스");
		//객체사용
		
		System.out.println("마이카는"+myCar.carName);
		//마이카는제너시스
		Car yourCar = new Car(120);
		
		System.out.println("마이카의속도"+yourCar.speed);
        //마이카의속도120
		Car hisCar= new Car("에쿠스",150);
		
		System.out.println("마이카는"+hisCar.carName+"속도는"+
		hisCar.speed);

	}

}
