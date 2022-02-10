package object.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
		//펜의 기능을 쓰고 싶다면 Pen을 생성해야 합니다.
		
		Pen pen= new Pen();
		
		pen.ink="초록색";
		pen.price=2000;
		pen.write();
		pen.info();
		
		Pen pen2 = new Pen();
		
		pen2.ink="빨간색";
		pen2.price=3000;
		pen.write();
		pen.info();
				

		System.out.println("--------");
		
		Pen p3 = new Pen();
		p3.write();
		p3.info();
		
		
	   System.out.println("---------------");
	   
	    Pen p4 = new Pen("검정색",5000);
	    p4.write();
	    p4.info();
	    
	    
	    int a= 1;
	    String s= "홍길동";
	    Pen p5 = new Pen();
	    
	    System.out.println(a);
	    System.out.println(s);
	    System.out.println(p5);
	    
	}

}
