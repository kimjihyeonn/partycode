package quiz16;

public class Computer {
	//Ű����, ���콺, ����� Ŭ������ �����ϴ� ������ �����ϼ���
	
	KeyBoard keyboard;
	Monitor monitor;
	Mouse mouse;
	

	//�⺻�����ڸ� �����ϰ�, ������ Ŭ������ �ʱ�ȭ �ϼ���
	
	Computer(){
//		this.keyboard = new KeyBoard();
//		this.monitor = new Monitor();
//		this.mouse = new Mouse();
	}

	//������
	public Computer(KeyBoard keyboard, Monitor monitor, Mouse mouse) {
		
		this.keyboard = keyboard;
		this.monitor = monitor;
		this.mouse = mouse;
	}
	


	//Ű����, �����, ���콺 ������ ����ϴ� computerInfo() �޼��带 �����ϼ���
	public void computerInfo(){
		
		keyboard.info();
		monitor.info();
		mouse.info();
		
	}
	

	//Ű����, �����, ���콺�� ���� getter/setter�� �����ϼ���	(�ڵ��ϼ�)
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
	
	
		
	
	//���θ޼��忡�� getter�� �����Ͽ� ����Ϳ� ���� ������ Ȯ���ϼ���
	
	
	
	
}
