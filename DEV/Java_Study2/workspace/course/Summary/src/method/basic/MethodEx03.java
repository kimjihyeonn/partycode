package method.basic;

public class MethodEx03 {
	
	public static void main(String[] args) {
		
		
		int result = calSum(5,4);
		System.out.println(result);
		
		//��ȯ�� �ִ� �޼���� �޼����� ȣ�⹮�� �ϳ��� ���� �Ǳ�빮�� ��ø�� �����ϴ�.
		
	System.out.println(calSum(calSum(1,2),calSum(3,4)));	
	
	multi(5,6);
		
	
	//���̵��� �޼ҵ�� �޼ҵ� ȣ�⸸ �����մϴ�.
	//int result2 = multi(2,3);
	//System.out.println(multi(2,3));
	}
	
	//���� 2���� �޾Ƽ� �������� ���� ��ȯ.
	
	
	static int calSum(int a,int b) {
		
		
		
		return a+b;
	}

	
	static void multi(int a, int b) {
		
		
		
		System.out.println("�μ��ǰ�: " + a*b);
		
		
	}
}
