package quiz16;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	
	KeyBoard keyboard;
	Monitor monitor;
	Mouse mouse;
	

	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	
	Computer(){
//		this.keyboard = new KeyBoard();
//		this.monitor = new Monitor();
//		this.mouse = new Mouse();
	}

	//생성자
	public Computer(KeyBoard keyboard, Monitor monitor, Mouse mouse) {
		
		this.keyboard = keyboard;
		this.monitor = monitor;
		this.mouse = mouse;
	}
	


	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo(){
		
		keyboard.info();
		monitor.info();
		mouse.info();
		
	}
	

	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	(자동완성)
	public KeyBoard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(KeyBoard keyboard) {
		this.keyboard = keyboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	
		
	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
