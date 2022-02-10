package method.basic;

public class MethodEx03 {
	
	public static void main(String[] args) {
		
		
		int result = calSum(5,4);
		System.out.println(result);
		
		//반환이 있는 메서드는 메서드의 호출문이 하나의 값이 되기대문에 중첩이 가능하다.
		
	System.out.println(calSum(calSum(1,2),calSum(3,4)));	
	
	multi(5,6);
		
	
	//보이드형 메소드는 메소드 호출만 가능합니다.
	//int result2 = multi(2,3);
	//System.out.println(multi(2,3));
	}
	
	//정수 2개를 받아서 두정수의 합을 반환.
	
	
	static int calSum(int a,int b) {
		
		
		
		return a+b;
	}

	
	static void multi(int a, int b) {
		
		
		
		System.out.println("두수의곱: " + a*b);
		
		
	}
}
