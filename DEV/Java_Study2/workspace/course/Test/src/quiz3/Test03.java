package quiz3;


import java.util.Scanner;



public class Test03 {


	public static void main(String[] args)  {
		
		//2������ �޾Ƽ�, 2������ ���� ����մϴ�.
		//�Է¹޴� ���� ���ڿ��� ������ �߻���Ű�� �ٽ� �Է¹�������.
		//�Է��� ���� ���� ���̶�� ����ϰ� �����մϴ�.
		
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
	    	System.out.println("�߸��Է��ϼ̽��ϴ�.");
	    }
	    
	}
}
		
	   
	    
	    
		
	


