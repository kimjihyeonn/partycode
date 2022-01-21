package prac;

public class Ramda {

	public static void main(String[] args) {
		  //Object obj  = (a,b) -> a > b ? a : b
//		Object obj =	  new Object() {
//		  int max(int a, int b) {
//			  return a>b? a:b; 
//		  }
	//  };
	//  int value = obj.max(3,5); // 함수형 인터페이스
	  
	//  
	//  (name,i)-> System.out.prinln(name+"="+i)
	//  
	//  x -> x*x
	//  ()->(int)(Math.random()*6)
		/*
		 * MyFunction obj = new MyFunction() { public int max(int a, int b) { return
		 * a>b? a:b; };
		 */
		//람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스
		MyFunction f = (a,b) -> a > b ? a : b ;

	int value = f.max(3, 5);
	System.out.println(value);
	
	MyFunction2 f1 = ()->System.out.println("f1.run");
	
	MyFunction2 f2 = getMyFunction();
	
	f1.run();
	f2.run();
	execute(f1);
	
 
}


@FunctionalInterface
interface MyFunction {
	int max(int a, int b);
}

static void execute(MyFunction2 f) {
	f.run();
}

static MyFunction2 getMyFunction() {
	return () -> System.out.print("f3.run");
}

@FunctionalInterface
interface MyFunction2{
	void run();
}

}