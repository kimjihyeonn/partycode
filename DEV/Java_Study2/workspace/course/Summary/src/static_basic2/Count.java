package static_basic2;

public class Count {

	
	   public int a;
	   public static int b;
	   
	   //�Ϲݸ޼���- �Ϲݺ����� �������� �Ѵ� ����� �����մϴ�.
	   
	   public int method01() {
		   a=10;
		   method02();
		   return b++;
		   
	   }
	   //�����޼��� = ��������, �����޼��常 ��밡���մϴ�.
	   
	   //�� - ��ü�� �����ؼ� ����� �� �ֽ��ϴ�.
	   public static int method02() {
		   //a=10;
		   Count c = new Count();
		   c.a = 10;
		 //method01();
		   return b++;
		   
	   }
	   
}
