package ����ó���ǽ�;

public class ExceptionEx02 {

	public static void main(String[] args) {
		//�迭 ��ü ����
		//index�� 0,1,2,3 ������ ������ �� �ִ�.
		
		
		try {
		
	        int[] number = new int[4]; //���� 4���� ����� 0���� �ڵ� �ʱ�ȭ�Ѵ�.
	        number[5] = 30;
	        System.out.println(number[5]);
	        }catch(Exception e) {
	        	System.out.println("������������"+e);
	        }
		
	}
	
}


