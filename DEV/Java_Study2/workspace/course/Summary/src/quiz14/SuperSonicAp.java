package quiz14;

public class SuperSonicAp extends Airplane  {
   int flyMode;
	SuperSonicAp(String name) {
		super(name);
	}

	
	 @Override
		void fly() {
			if(flyMode==1) {
				System.out.println(name +"�� ��� ���� �����մϴ�.");
			}
			else {
				super.fly();
			}
		}
	/*
	 * 1. Airplane�� ��ӹ޽��ϴ�. �����ڴ� �̸��� �޾Ƽ� �ʱ�ȭ �ϵ��� �����ϼ���
	 * 2. flyMode int�� ������ �����ϼ���
	 * 3. fly() �޼��带 ��������մϴ�
	 * 	  fly() �޼��� �ȿ����� flyMode�� 1�̶�� "��� ���� �����մϴ�" ���
	 *          flyMode 0�̶��, super�� ���� �θ���� �޼��带 ȣ��
	 */
	
	 
	
	
	
	
	
	
}






