package 인터페이스_예제;

/*/
 * 구현클래스=> 인터페이스를 구현시킨 클래스
 */
public class Television implements RemoteControl{
   //멤버변수 선언
	private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("텔레비전 전원을 킵니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전 전원을 끕니다");
		
	}

	@Override
	public void setVolum(int volumn) {
		if(volumn> RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
			
		}else if(volumn <RemoteControl.MIN_VOLUMN) {
			this.volumn=RemoteControl.MIN_VOLUMN;
		}else {
			this.volumn = volumn;
		}
			System.out.println("현재 TV볼륨은"+this.volumn);
		
		
	}

}
