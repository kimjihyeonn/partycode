package static_basic;

public class MainClass {

	
	public static void main(String[] args) {
		
		Count c1 = new Count();
//		//1.�����Ѵ�
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
		
		//2. ����ƽ������ ���������� ��ü�� ����ٷ� Ŭ�����̸����� ������ ���ٰ����ϴ�.
		
		Count.b++;
		
		//b ==4
				
	}
}
