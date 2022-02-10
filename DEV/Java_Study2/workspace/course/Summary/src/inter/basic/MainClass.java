package inter.basic;

public class MainClass {
  public static void main(String[] args) {
	  //인터페이스 사용방법1
	 Basic b =new Basic();
	 b.method01();
	 b.method02();
	
	b.mehtod03();
	System.out.println(Basic.ABC);
	System.out.println(Basic.pi);
	//인터페이스도 부모타입으로 사용할 수 있습니다.
	
	Inter1 i1 = b;
	
	i1.method01();
//	i1.method02();
//	il.method03();  2,3은 사용할 수없다. 
	System.out.println(Inter1.ABC);
	
	Inter2 i2 = b;
//	i2.method01();
	i2.method02();
//	i2.method03();
	
	//인터페이스도 클래스 캐스팅이 가능합니다.
	
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(b);
	
	Basic bb=(Basic)i1;
	
	Inter2 ii2 = (Inter2)i1;
	
	
	
	
	System.out.println(bb);
	
	
	
}
}
