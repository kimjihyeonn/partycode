package inter.basic;

//인터페이스는 여러 인터페이스를 동시에 구현 (상속) 할 수 있습니다.

public class Basic /*extends Object*/ implements Inter1,Inter2 {

	@Override
	public void method01() {
	System.out.println("오버라이딩된 1번 메서드");
	}

	@Override
	public void method02() {
		System.out.println("오버라이딩된 2번 메서드");
		
	}
	
	public void mehtod03() {
		System.out.println("basic의 메서드");
	}
	

	
}
