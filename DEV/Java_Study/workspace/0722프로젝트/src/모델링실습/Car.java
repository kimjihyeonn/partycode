package �𵨸��ǽ�;

public class Car {
	//�ʵ� ����
	private int speed;  //����ӵ�
	private int wheelNum; // ������ ����
	private String carName; //�ڵ��� �̸�
	//������ ����
	
	public Car(String name) {
		carName = name;
	}
	public Car(int velocity) {
		speed = velocity;
	}
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;
	}
	//�޼ҵ�
	public void speedUp() {//�ӵ��� �ø��� ���
		speed = speed+1;
	}
	public void speedUp(int velocity) {
		speed = speed + velocity;
	}
		
		
	

	public static void main(String[] args) {
		//Car ��ü ����
		Car myCar = new Car("���ʽý�");
		//��ü���
		
		System.out.println("����ī��"+myCar.carName);
		//����ī�����ʽý�
		Car yourCar = new Car(120);
		
		System.out.println("����ī�Ǽӵ�"+yourCar.speed);
        //����ī�Ǽӵ�120
		Car hisCar= new Car("����",150);
		
		System.out.println("����ī��"+hisCar.carName+"�ӵ���"+
		hisCar.speed);

	}

}
