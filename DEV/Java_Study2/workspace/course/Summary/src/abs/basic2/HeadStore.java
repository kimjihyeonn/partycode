package abs.basic2;

public abstract class HeadStore {

	
	/*
	 * 반드시 오버라이딩해야하는 메소드에겐 abstract 추상메소드
	 */
	
	//1. 추상메서드는 몸체가 없는 메서드의 선언입니다.
	//2. 추상메서드는 자식클래스에서 오버라이딩이 강제화 됩니다.
	//3. 추상클래스는 일반메서드, 일반 변수, 생성자 모두 사용됩니다.
	
	

	
	
	public String name;
	
	
	public abstract void melon();
	public abstract void orange();
	public abstract void peach();

     public void grape() {
    	 System.out.println("본점에서만 파는 포도의 가격은 700원");
     }
}
