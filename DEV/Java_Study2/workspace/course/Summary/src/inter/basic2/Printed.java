package inter.basic2;

//클래스의 사용방법을 추상메서드 정의
public interface Printed {
	
	public void turnOn();
	public void turnOff();
	public void print(String document); //출력
	public void colorPrint(String document,String color);//컬러출력기능
	public int copy(int n);//복사기능
	
	

}
