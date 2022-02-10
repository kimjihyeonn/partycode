package quiz16;

public class MainClass {

	public static void main(String[] args) {
		Computer com = new Computer();
		
		
		com.setMonitor(new Monitor());
		com.setKeyboard(new KeyBoard());
		com.setMouse(new Mouse());
		com.getMonitor().info();

		
	}

}
