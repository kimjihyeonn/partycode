package ����;
/*
 *HashSet�� ��ü�� �߰�(����)�ϱ� ����
 *���� ��ü�� hashCode() �޼ҵ带 ȣ���ؼ� �ؽ��ڵ带 ���´�.
 *�׸��� �̹� ����Ǿ��ִ� ��ü���� �ؽ��ڵ�� ���Ѵ�.
 *���� ������ �ؽ��ڵ尡 �ִٸ� equals()�޼ҵ�� �ΰ�ü�� ���ؼ� true�� ������ ������ ��ü��
 *�Ǵ��ϰ� �ߺ������� ���� �ʴ´�.
 */

import java.util.HashSet;
import java.util.Set;


public class HashSetEx2 {

	public static void main(String[] args) {
		Set<prac1> member_set=new HashSet<prac1>();
		
		prac1 member1= new prac1("������",22,"11111111");

				prac1 member2= new prac1("������",22,"11111111");
				
				
				member_set.add(member1);
				member_set.add(member2);
				
				System.out.println(member_set.size());
		
		

	}

}
