package 예외처리실습;

public class ExceptionEx02 {

	public static void main(String[] args) {
		//배열 객체 생성
		//index가 0,1,2,3 까지만 접근할 수 있다.
		
		
		try {
		
	        int[] number = new int[4]; //공간 4개를 만들고 0으로 자동 초기화한다.
	        number[5] = 30;
	        System.out.println(number[5]);
	        }catch(Exception e) {
	        	System.out.println("ㅁㄴㅇㄴㅁㅇ"+e);
	        }
		
	}
	
}


