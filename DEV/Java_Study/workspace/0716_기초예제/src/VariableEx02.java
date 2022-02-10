
public class VariableEx02 {

	public static void main(String[] args) {
		long var1= 10;
		long var2 = 20;
		
		//long 타입의 변수를 초기화할 때에는 정수값 뒤에 대문자'L'을붙인다.
		//정수의 기본타입은 int
		long var3 =10000000000L;//1조
		
	
		
		System.out.println(var1);

		System.out.println(var2);

		System.out.println(var3);
		//================================
		/**
		 * 자바는 실수 리터럴 기본타입을 double로 간주한다.
		 * 이 말은 실수 리터널을 float 타입변수에 그냥 저정할 수 없다.
		 * 실수 리터널을 float 타입변수에 저장하려면 리터널 뒤에 소문자'f'
		 * 나 대문자'F를 붙여야 한다.
		 */
		double var4 = 3.14;
		//float var5= 3.14;
		float var5= 3.14f;
		
		System.out.println(var4);
		System.out.println(var5);
		

	}

}
