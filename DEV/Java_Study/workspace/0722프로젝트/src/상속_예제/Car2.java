package ���_����;
/*
 * �θ�Ŭ���� => main()�޼ҵ� ����x
 * (����Ŭ����)
 */

public class Car2 {
	//�ʵ� ����
		protected int speed;  //����ӵ�
		protected int wheelNum; // ������ ����
		protected String carName; //�ڵ��� �̸�
		//������ ����
		//����Ʈ ������ ���� => ���ڰ��� ���� ,���೻�뵵 ����
		public Car2() {
			
		}
		public Car2(String name) {
			carName = name;
		}
		public Car2(int velocity) {
			speed = velocity;
		}
		public Car2(String name, int velocity) {
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

}
