package object.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
		//���� ����� ���� �ʹٸ� Pen�� �����ؾ� �մϴ�.
		
		Pen pen= new Pen();
		
		pen.ink="�ʷϻ�";
		pen.price=2000;
		pen.write();
		pen.info();
		
		Pen pen2 = new Pen();
		
		pen2.ink="������";
		pen2.price=3000;
		pen.write();
		pen.info();
				

		System.out.println("--------");
		
		Pen p3 = new Pen();
		p3.write();
		p3.info();
		
		
	   System.out.println("---------------");
	   
	    Pen p4 = new Pen("������",5000);
	    p4.write();
	    p4.info();
	    
	    
	    int a= 1;
	    String s= "ȫ�浿";
	    Pen p5 = new Pen();
	    
	    System.out.println(a);
	    System.out.println(s);
	    System.out.println(p5);
	    
	}

}
