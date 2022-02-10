package 인터페이스_예제;

public class myClass {

	public static void main(String[] args) {
		RemoteControl rc = null;
		//객체 생성
		rc = new Television();
		rc.turnOn();
		rc.setVolum(12);
		rc.setMute(true);
		RemoteControl.changeBattery();
		rc.turnOff();
		
		
		rc= new Audio();
		rc.turnOn();
		rc.setVolum(12);
		rc.setMute(true);
        RemoteControl.changeBattery();
        rc.turnOff();

	}

}
