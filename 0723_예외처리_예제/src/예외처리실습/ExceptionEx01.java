package ����ó���ǽ�;
/*
 * ����ó���� ���α׷��� ����� �� ���ڱ� �ߴܵ��� �ʰ�
 * ���������� �����Ű�� ������ ������ �����ڿ��� ���ý�Ű�� ����
 * �ɸ������� ������ ���¿��� ������ ������ �� �ִ�.
 */
public class ExceptionEx01 {
	
	public static void ExceptionEx() throws Exception{
	
	 int number =50/0;
	}

	public static void main(String[] args) {
	   
           try {
        	   ExceptionEx();
        	   
           }catch(Exception r){
        	   System.out.println("Error �߻�!!" +r);
        	   
           }finally {
        	  System.out.println("�ȳ��ϼ���");
        	   
           }
	}

}
