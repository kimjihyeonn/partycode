package method.basic;

public class MethodEx02 {
	
	public static void main(String[] args) {
		
		
		
		
		int data=calSum(100);
		System.out.println(data);
		
		String dta = calSum2(20,"가");
		
		System.out.println(dta);
				
	}
		
	
	//매개변수를 전달받는 유형
	   static int calSum(int a) {
		
			
			int sum = (a+1)*(a/2);			
			
			return sum;
		}
		
  //매개변수로 정수, 문자열을 받는 유형(정수의 개수만큼 문자열을 합쳐서 반환)
	   
	  static String calSum2(int a,String s) {
		  String str = "";
		 
		  for(int i = 1; i<=a; i++) {
			  str += s;
					  
		  }
		  
		  
		  return str;
		   
		  
		  
	   }

}
