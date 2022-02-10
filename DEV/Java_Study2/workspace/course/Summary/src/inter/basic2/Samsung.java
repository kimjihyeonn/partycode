package inter.basic2;

public class Samsung implements Printed{
	
	private String name = "***Samsung***";

	@Override
	public void turnOn() {
		System.out.println(name);
		System.out.println("프린터를 켭니다.");
		
	}

	@Override
	public void turnOff() {
	    System.out.println(name);
	    System.out.println("프린터를 끕니다.");
		
	}

	@Override
	public void print(String document) {
		 System.out.println(name);
		 System.out.println("출력내용:"+document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(name);
		
		System.out.println(color+"색상출력"+document);
		
	}

	@Override
	public int copy(int n) {
		for(int i =1; i<=n ; i++) {
			System.out.println("복사:" + i);
		}
		System.out.println("출력완료");
		
		return n;
	}

}
