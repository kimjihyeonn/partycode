package exception.trycatch;

public class TrycatchEx {
	
	public static void main(String[] args) {
		//run�� => run configuration-> argument��;
		
		try {
			//${string_prompt}  10 20
//			System.out.println(args[0]);
//			System.out.println(args[1]);
			
			String data1 = args[0];
			String data2 = args[1];
			
			int n1=Integer.parseInt(data1);
			int n2=Integer.parseInt(data2);
			
			System.out.println("�μ��� ��:"+(n1+n2));
			
			
			String str =null;
			str.charAt(0);
			
			
			
		} catch (ArrayIndexOutOfBoundsException e) { //������ ����(���� Ŭ����)
			System.out.println("���ڰ��� 2�� �����ϼ���");
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
			
		}catch(Exception e) {//Execption�� ��� ���ܸ� ó���մϴ�.
			System.out.println("��Ÿ�����Դϴ�.");
			e.printStackTrace(); //������ �߻��� ��ġ�� �˷��ִ� ���
		} finally {
			System.out.println("���ܰ� �߻��ϴ�,�߻������ʴ� ������ ����Ǵ� ����");
		}
		
		
		System.out.println("���α׷� ��������");
	}

}
