package poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
		Child c = new Child();
		
		c.method01();
		c.method02();
		//������ ���� -Parent�� ���ǵ� ��ɸ� ����� �� �ְ�, �������̵� �� �޼���� ���� ����ȴ�.
         Parent p = c;
           p.method01();
           
           p.method02();
           //p.method03();
           
           
           //Ŭ���� ĳ����
           
          Child cc= (Child)p;
          
          cc.method01();
          cc.method02();
          cc.method03();
          
          
          int i =1;
          
          double d = i;
         int a = (int)d;
          
          
         

	}

}
