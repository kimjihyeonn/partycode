package Car�߻�Ŭ���������;

/*
 * 
 * �߻� Ŭ����
 */

public abstract class Car {
	
	//�߻�޼ҵ�
	
	public abstract void drive();// {}�� ���� �޼ҵ带 �߻�޼ҵ����!!
	public abstract void stop();
	
	//�Ϲ� �޼ҵ�
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
    public void turnOff() {
    	System.out.println("�õ������ϴ�.");
    }
	//[�߿�]���ø� �޼ҵ� => ������ �������� �ϳ���.
	//run() ���ø� �޼ҵ�� Car�� ��� �޷��� �ϴ����� �����ؾ� �Ѵ�.
	//�� '�������'�� '�ó�����' ���� �� �� ����
	 //final �ó����� ��������� �����̾���.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
