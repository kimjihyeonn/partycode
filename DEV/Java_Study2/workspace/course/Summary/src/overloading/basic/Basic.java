package overloading.basic;

public class Basic {
	
	
	
////	int input(int a) {
//		
//		return 0;
//	}
//	
	void input(int i) {
		System.out.println("���� 1�� �Է�");
	}
  
	void input(String s) {
		System.out.println("���ڿ� 1�� �Է�");
	}
	void input(String s, int a) {
		System.out.println("���ڿ� 1��,���� 1�� �Է�");
	}
	void input(int a, String s) {
		System.out.println("����1��, ���ڿ�1�� �Է�");
	}
}
