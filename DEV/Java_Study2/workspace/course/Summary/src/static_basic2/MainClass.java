package static_basic2;

public class MainClass {

	public static void main(String[] args) {

          //static 메서드의 호출방법.
		
		Count.b++;
		Count.method02();
		
		
	  MainClass m = new MainClass();
	  
	  m.c = 1;
	  
	  System.out.println(Calculator.circle(7));
	  
		
	}
	
	int c =1;
	
	

}
