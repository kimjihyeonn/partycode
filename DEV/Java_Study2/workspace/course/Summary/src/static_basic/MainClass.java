package static_basic;

public class MainClass {

	
	public static void main(String[] args) {
		
		Count c1 = new Count();
//		//1.공유한다
		c1.a++;
		c1.b++;
//		
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		Count c2 = new Count();
		
		c2.a++;
		c2.b++;
		
		System.out.println(c2.a);
		System.out.println(c2.b);
		
		Count c3 = new Count();
		
		c3.a++;
		c3.b++;
		
		System.out.println(c3.a);
		System.out.println(c3.b);
		
		//2. 스태틱변수는 정적변수는 객체가 없어다로 클래스이름으로 빠르게 접근가능하다.
		
		Count.b++;
		
		//b ==4
				
	}
}
