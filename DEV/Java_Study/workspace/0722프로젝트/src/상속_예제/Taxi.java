package ���_����;


/*
 * �ڽ�Ŭ����
 * =>main()�޼ҵ� ���� =>����Ŭ����
 */

public class Taxi extends Car2{
   
   //�޼ҵ� �������̵� ����;
	//�������ϰڴ�.
   public void speedUp(int velocity) {
	   speed= speed+ velocity;
	   
	   if(speed >110) {//�ߺ� ��ӵ��ζ�� ����
		   speed = 100;
	   }
   }

	public static void main(String[] args) {
		Taxi myTaxi=new Taxi();
		
		myTaxi.speedUp(150);
		System.out.println("Taxi speed is"+myTaxi.speed);

	}

}
