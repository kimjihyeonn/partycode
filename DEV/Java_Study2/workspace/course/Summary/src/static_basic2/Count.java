package static_basic2;

public class Count {

	
	   public int a;
	   public static int b;
	   
	   //일반메서드- 일반변수와 정적변수 둘다 사용이 가능합니다.
	   
	   public int method01() {
		   a=10;
		   method02();
		   return b++;
		   
	   }
	   //정적메서드 = 정적변수, 정적메서드만 사용가능합니다.
	   
	   //단 - 객체를 생성해서 사용할 수 있습니다.
	   public static int method02() {
		   //a=10;
		   Count c = new Count();
		   c.a = 10;
		 //method01();
		   return b++;
		   
	   }
	   
}
