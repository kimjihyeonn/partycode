package object.basic;

//���赵�� main�� �����ϴ�.
public class Pen {
	//�������
	
	String ink;
	int price;
	
	//������ = ���������� �����ڸ� ����� �ڵ����� �����ڸ� �������� �ʴ´�.
	
	Pen(){
          ink="�Ķ�";
          price=3000;
          
          
	}
	
	Pen(String ink, int price){
		this.ink = ink;
		this.price =price;
	}
	//�޼���
	
	void write() {
		
		System.out.println(ink + " �� �۾��� ���ϴ�.");
	}
	void info() {
		
		System.out.println("===��������===");
		System.out.println("���ǻ���:" +ink);
		System.out.println("���ǰ���:"+price);
	}
	
	

}
