package 상속_예제;
/*
 * 부모클래스 => main()메소드 포함x
 * (상위클래스)
 */

public class Car2 {
	//필드 선언
		protected int speed;  //현재속도
		protected int wheelNum; // 바퀴의 갯수
		protected String carName; //자동차 이름
		//생성자 구현
		//디폴트 생성자 구현 => 인자값도 없고 ,실행내용도 없다
		public Car2() {
			
		}
		public Car2(String name) {
			carName = name;
		}
		public Car2(int velocity) {
			speed = velocity;
		}
		public Car2(String name, int velocity) {
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

}
