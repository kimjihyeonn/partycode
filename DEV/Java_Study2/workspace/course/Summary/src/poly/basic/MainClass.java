package poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
		Child c = new Child();
		
		c.method01();
		c.method02();
		//다형성 적용 -Parent의 정의된 기능만 사용할 수 있고, 오버라이딩 된 메서드는 먼저 실행된다.
         Parent p = c;
           p.method01();
           
           p.method02();
           //p.method03();
           
           
           //클래스 캐스팅
           
          Child cc= (Child)p;
          
          cc.method01();
          cc.method02();
          cc.method03();
          
          
          int i =1;
          
          double d = i;
         int a = (int)d;
          
          
         

	}

}
