package inter.basic;

public class MainClass {
  public static void main(String[] args) {
	  //�������̽� �����1
	 Basic b =new Basic();
	 b.method01();
	 b.method02();
	
	b.mehtod03();
	System.out.println(Basic.ABC);
	System.out.println(Basic.pi);
	//�������̽��� �θ�Ÿ������ ����� �� �ֽ��ϴ�.
	
	Inter1 i1 = b;
	
	i1.method01();
//	i1.method02();
//	il.method03();  2,3�� ����� ������. 
	System.out.println(Inter1.ABC);
	
	Inter2 i2 = b;
//	i2.method01();
	i2.method02();
//	i2.method03();
	
	//�������̽��� Ŭ���� ĳ������ �����մϴ�.
	
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(b);
	
	Basic bb=(Basic)i1;
	
	Inter2 ii2 = (Inter2)i1;
	
	
	
	
	System.out.println(bb);
	
	
	
}
}
