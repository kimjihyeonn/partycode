package super���ýǽ�;

class Man{   //�θ�(����)Ŭ����
	String name; //�̸�
	//����Ʈ ������
	public Man() {
		
	};
	
	//�Ű������� �ִ� ������
	public Man(String name) {
		this.name=name;
	}
	//�޼ҵ� ����
	//���������� ����Ÿ�� 
	public void tellYourName() {
		System.out.println("My name is" + name);
		
	}
}
/*
 * super: �θ� Ŭ���� �ʵ�(�������)�� �����ϰ��� �Ҷ�
 * super():�θ� Ŭ������ �����ڸ� �䱸�� �� ���[��������] �ݵ�� ù��° ���忡 �;���!
 */
class BusinessMan extends Man{//�ڽ� Ŭ����
	//�ʵ� ����
	String company;  //�ٹ� ȸ���̸�
	String position; //����
	
	
	public BusinessMan(String name, String company, String position)
	{ super(name);
	this.company = company;
	this.position = position;
	}
	//�޼ҵ� ����
	public void tellYourInfo() {
		System.out.println("My company is" + company);
		System.out.println("My position is" + position);
		
	}
};
public class SuperEx {

	public static void main(String[] args) {
		//��ü ����
		BusinessMan man1= new BusinessMan("����ȣ", "LG���÷���", "����");
		BusinessMan man2= new BusinessMan("����ȣ", "LG���÷���", "����");
		System.out.println("First man info =>");
		man1.tellYourInfo();
		man1.tellYourName();
		
		
		System.out.println("Second man info =>");
		man2.tellYourInfo();
		man2.tellYourName();
		
		
	}

}
