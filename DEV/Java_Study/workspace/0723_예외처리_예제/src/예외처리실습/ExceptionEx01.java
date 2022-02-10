package 예외처리실습;
/*
 * 예외처리는 프로그램이 실행될 때 갑자기 중단되지 않고
 * 정상적으로 실행시키고 문제의 원인을 개발자에게 제시시키는 개념
 * 심리적으로 안정된 상태에서 개발을 진행할 수 있다.
 */
public class ExceptionEx01 {
	
	public static void ExceptionEx() throws Exception{
	
	 int number =50/0;
	}

	public static void main(String[] args) {
	   
           try {
        	   ExceptionEx();
        	   
           }catch(Exception r){
        	   System.out.println("Error 발생!!" +r);
        	   
           }finally {
        	  System.out.println("안녕하세요");
        	   
           }
	}

}
