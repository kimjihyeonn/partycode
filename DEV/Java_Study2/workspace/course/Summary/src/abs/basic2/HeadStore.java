package abs.basic2;

public abstract class HeadStore {

	
	/*
	 * �ݵ�� �������̵��ؾ��ϴ� �޼ҵ忡�� abstract �߻�޼ҵ�
	 */
	
	//1. �߻�޼���� ��ü�� ���� �޼����� �����Դϴ�.
	//2. �߻�޼���� �ڽ�Ŭ�������� �������̵��� ����ȭ �˴ϴ�.
	//3. �߻�Ŭ������ �Ϲݸ޼���, �Ϲ� ����, ������ ��� ���˴ϴ�.
	
	

	
	
	public String name;
	
	
	public abstract void melon();
	public abstract void orange();
	public abstract void peach();

     public void grape() {
    	 System.out.println("���������� �Ĵ� ������ ������ 700��");
     }
}
