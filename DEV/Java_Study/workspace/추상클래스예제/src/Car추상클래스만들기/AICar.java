package Car�߻�Ŭ���������;
/*
 * ��ä Ŭ����
 */

public class AICar extends Car {
	@Override //������̼�
	public void drive() { //'���'�� ���Ѵ޶�!=>�ڽ� Ŭ���� �뵵�� �°� �������ؼ� ���
		System.out.println("���� �����մϴ�.");
		System.out.println("�������� �ڵ����� ������ ������ ��ȯ�Ѵ�.");
		
		
	}

	@Override
	public void stop() { //'���'�� ���Ѵ޶�=> �ڽ� Ŭ���� �뵵�� �°� �������ؼ� ���
		System.out.println("������ �����.");
		
		
	}


}
