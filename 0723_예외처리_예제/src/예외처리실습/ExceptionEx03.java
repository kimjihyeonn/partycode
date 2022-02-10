package 예외처리실습;

public class ExceptionEx03 {

	public static void main(String[] args) {
	try {String[] str = {"10","20","30"};
	 
	 int data = Integer.parseInt(str[1]); //"20" =>20 변환
	 System.out.println(data);}
	catch(Exception e){
		System.out.println( "오류났어요" + e);
		
	}
	 
	 

	}

}
