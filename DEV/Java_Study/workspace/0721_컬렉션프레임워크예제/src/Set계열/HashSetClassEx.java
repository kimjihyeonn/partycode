package Set�迭;

import java.util.HashSet;
import java.util.Set;


/*
 * HashSet�� ��ü�� �߰�(����)�ϱ� ����
 * ���� ��ü�� hashCode() �޼ҵ带 ȣ���ؼ� �ؽ��ڵ带 ���´�.
 * �׸��� �̹� ����Ǿ��ִ� ��ü���� �ؽ��ڵ�� ���Ѵ�.
 * ���� ������ �ؽ��ڵ尡 �ִٸ� equals()�޼ҵ�� �ΰ�ü�� ���ؼ� true�� ������
 * ������ ��ü�� �Ǵ��ϰ� �ߺ������� ���� �ʴ´�.
 */
public class HashSetClassEx {

	public static void main(String[] args) {
	  Set<Member> member_set = new HashSet<Member>();
	  
	  System.out.println(member_set);
	  
	  /**
	   * HashSet�̶�� �ڷᱸ���� �ߺ��� ������� �ʴ� �ڷḦ ������ �� �����ϰ� ���ȴ�.
	   */
	  //������ ���
	  Member member1 = new Member("�����",29,"11111-1111111");
	  Member member2 = new Member("����ö",29,"11111-1111111");
	  Member member3 = new Member("�����",29,"11111-1111111");
	 
	  member_set.add(member1);
	  member_set.add(member2);
	  member_set.add(member3);
	  
	  System.out.println(member_set);
	}


	}


