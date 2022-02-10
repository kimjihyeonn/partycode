package 인터페이스_예제;

public class Audio implements RemoteControl{

	private int volumn;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolum(int volumn) {
		if(volumn>RemoteControl.MAX_VOLUMN) {
			this.volumn=RemoteControl.MAX_VOLUMN;
		}else if(volumn<RemoteControl.MIN_VOLUMN) {
			this.volumn=RemoteControl.MIN_VOLUMN;
		}else {
			 this.volumn=volumn;
		}
		System.out.println("볼륨은"+this.volumn+"입니다.");
		
	}

	
}
