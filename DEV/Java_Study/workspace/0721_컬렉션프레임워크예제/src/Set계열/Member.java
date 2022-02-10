package Set�迭;

/**
 * 
 * Ŭ������ ���� ��Ҵ� 
 * 1.�ʵ�(field)
 * 2.������: ��ü ����, ��ü�� �ʵ带 �ʱ�ȭ ��Ų��.
 * 3.�޼ҵ�: ��ü�� ���,����,����
 */

/**
 * 
 * �ڹ� �����ڰ� Ŭ������ �����ϸ� extends Ű����� �ٸ�Ŭ������ �������������
 * �Ͻ������� java.lang��Ű����  ���Ե� Object Ŭ������ ����ϰԵȴ�.
 * 
 * Object Ŭ������ �߿�޼ҵ�
 * equals()
 * hashCode()
 * toString() �� �ִ�.
 *
 */
            //�ڽ�ũ������ extends �θ� Ŭ�����̸�
public class Member{//"ȸ��"Ŭ������ ���赵�̴�.
	//�ʵ�(��������) ����
	//���������� Ÿ��  ������
	private String name; // �̸�  private=����������
	private int age; //����
	private String juminNum; //�ֹι�ȣ
	
	//������ ����� ��Ģ        ����������
	public Member(String name,int age,String juminNum) {
		this.name= name;
		this.age=age;
		this.juminNum = juminNum;
	
	}
	//�޼ҵ� ����� ���

	@Override //������̼�
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
		
		return member.name.equals(name)&& (member.age == age)
				&& member.juminNum.equals(juminNum);
	}else {
		return false;
	}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age + juminNum.hashCode();
	}
   
}
