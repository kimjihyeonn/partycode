package quiz3;


import java.util.Scanner;



public class Test03 {


	public static void main(String[] args)  {
		
		//2정수를 받아서, 2정수의 합을 출력합니다.
		//입력받는 값이 문자여서 에러를 발생시키면 다시 입력받으세요.
		//입력한 값이 옳은 값이라면 출력하고 종료합니다.
		
		try{
			
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String cal = sc.next();
				
	    int num2 = sc.nextInt();
	    
	   
	    
	    int sum = 0;
	    
	    if(cal.equals("+")) {
	    	 sum = num+num2;
	    	 
	    	 System.out.println(sum);
	    	
	    }
	  
	    }
	    catch(Exception e) {
	    	System.out.println("잘못입력하셨습니다.");
	    }
	    
	}
}
		
	   
	    
	    
		
	


