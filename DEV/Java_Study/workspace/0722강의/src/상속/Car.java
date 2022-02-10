package »ó¼Ó;

public class Car {
	private int speed;
	private String carName;
	
	
	
	public void speedUp(int velocity) {
		speed = speed + velocity;
	}
	
	public void speedDown(int velocity) {
		speed = speed -velocity;
		if(speed <0)
			speed =0;
	}
	public Car() {}
	
	public Car(String carName){
		this.carName=carName;
		
	}
	public Car(int speed,String carName) {
		this.carName=carName;
		this.speed = speed;
	}

}
