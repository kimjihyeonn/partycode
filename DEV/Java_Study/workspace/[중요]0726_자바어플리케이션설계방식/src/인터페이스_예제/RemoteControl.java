package 인터페이스_예제;

public interface RemoteControl { //리모콘 역할
   //상수선언 초기화
	
	/*public static final*/ int MAX_VOLUMN =10;  //파란색이며 기울러져있다.
	
	int MIN_VOLUMN=0;
	
	//추상메소드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolum(int volumn);
	
	//자바 8버전부터 디폴트 메소드와 정적메소드 선언이 가능하다 => 자바8버전은 혁명계라고함
	//디폴트 메소드 구현가능 이유 => 기존 inteface를 확장하여 새로운 기능을 추가하기 위해서~~
	default void setMute(boolean mute) {
		
		if(mute) {
			System.out.println("무음처리합니다.");
		}else {
			System.out.println("무음해제합니다.");
		}
		
	}
	//정적 메소드 구현 이유=> 디폴트 메소드와 달리 객체가 없어도 인터페이스 만으로 호출이 가능하다.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
		
	}
	
}
