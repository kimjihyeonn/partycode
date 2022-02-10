package 상속_예제;


/*
 * 자식클래스
 * =>main()메소드 포함 =>실행클래스
 */

public class Taxi extends Car2{
   
   //메소드 오버라이딩 개념;
	//재정의하겠다.
   public void speedUp(int velocity) {
	   speed= speed+ velocity;
	   
	   if(speed >110) {//중부 고속도로라고 하자
		   speed = 100;
	   }
   }

	public static void main(String[] args) {
		Taxi myTaxi=new Taxi();
		
		myTaxi.speedUp(150);
		System.out.println("Taxi speed is"+myTaxi.speed);

	}

}
