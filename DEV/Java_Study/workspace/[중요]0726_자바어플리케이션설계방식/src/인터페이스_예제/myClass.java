package �������̽�_����;

public class myClass {

	public static void main(String[] args) {
		RemoteControl rc = null;
		//��ü ����
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
