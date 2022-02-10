package overloading.basic;

public class Basic {
	
	
	
////	int input(int a) {
//		
//		return 0;
//	}
//	
	void input(int i) {
		System.out.println("정수 1개 입력");
	}
  
	void input(String s) {
		System.out.println("문자열 1개 입력");
	}
	void input(String s, int a) {
		System.out.println("문자열 1개,정수 1개 입력");
	}
	void input(int a, String s) {
		System.out.println("정수1개, 문자열1개 입력");
	}
}
