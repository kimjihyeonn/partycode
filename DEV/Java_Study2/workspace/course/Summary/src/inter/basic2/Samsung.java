package inter.basic2;

public class Samsung implements Printed{
	
	private String name = "***Samsung***";

	@Override
	public void turnOn() {
		System.out.println(name);
		System.out.println("�����͸� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
	    System.out.println(name);
	    System.out.println("�����͸� ���ϴ�.");
		
	}

	@Override
	public void print(String document) {
		 System.out.println(name);
		 System.out.println("��³���:"+document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(name);
		
		System.out.println(color+"�������"+document);
		
	}

	@Override
	public int copy(int n) {
		for(int i =1; i<=n ; i++) {
			System.out.println("����:" + i);
		}
		System.out.println("��¿Ϸ�");
		
		return n;
	}

}
