package Phone�߻�Ŭ���������;
/*
 * ���� Ŭ����
 */

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		TelePhone telePhone = new TelePhone("����ȣ");
		
		System.out.println(smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.internectSearch();
		smartPhone.turnOff();
		
		System.out.println(); //�ٹٲ�
		
		System.out.println(telePhone.owner);
		telePhone.turnOn();
		telePhone.autoAnswering();
		telePhone.turnOff();
				
	}

}


