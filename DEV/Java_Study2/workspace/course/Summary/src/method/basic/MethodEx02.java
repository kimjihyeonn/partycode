package method.basic;

public class MethodEx02 {
	
	public static void main(String[] args) {
		
		
		
		
		int data=calSum(100);
		System.out.println(data);
		
		String dta = calSum2(20,"��");
		
		System.out.println(dta);
				
	}
		
	
	//�Ű������� ���޹޴� ����
	   static int calSum(int a) {
		
			
			int sum = (a+1)*(a/2);			
			
			return sum;
		}
		
  //�Ű������� ����, ���ڿ��� �޴� ����(������ ������ŭ ���ڿ��� ���ļ� ��ȯ)
	   
	  static String calSum2(int a,String s) {
		  String str = "";
		 
		  for(int i = 1; i<=a; i++) {
			  str += s;
					  
		  }
		  
		  
		  return str;
		   
		  
		  
	   }

}
