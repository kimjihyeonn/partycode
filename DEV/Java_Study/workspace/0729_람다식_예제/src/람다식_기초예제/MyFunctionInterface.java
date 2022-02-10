package 람다식_기초예제;
@FunctionalInterface  //어노테이션
/*
 * 매개변수와 리턴값이 없는 추상메소드를 가진 함수적 인터페이스
 */

/*
public interface MyFunctionInterface {
   //추상 메소드
	public void method();
	
}*/
//=========================================================

/*
 * 매개변수는 있고,리턴값이 없는 추상메소드를 가진 추상메소드를 가진 함수적 인터페이스
 */

/*
public interface MyFunctionInterface {
   //추상 메소드
	public void method(int x);
	
}*/
//==========================================================

/*
 * 매개변수는 있고,리턴값이 있는 추상메소드를 가진  함수적 인터페이스
 */


public interface MyFunctionInterface {
   //추상 메소드
	public int method(int x,int y);
	
	
}