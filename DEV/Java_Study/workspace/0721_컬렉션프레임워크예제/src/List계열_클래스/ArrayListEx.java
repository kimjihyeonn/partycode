package List�迭_Ŭ����;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//��ü���� => �⺻10���� ���� �迭 Ȯ��
		//Integer Ŭ������ ������ "��üȭ"��Ű�� Ŭ�����̴�.
		//�� 10 => "10"
		ArrayList<Integer> list = new ArrayList<Integer>();
         list.add(new Integer(90));
         list.add(new Integer(85));
         list.add(new Integer(100));
         list.add(new Integer(70));
         list.add(new Integer(95));
         
         System.out.println(list);
         
         list.add(new Integer(80));
         System.out.println(list);
         
         list.add(2,120);
         
         System.out.println(list);
         
         list.set(1, 150);
         System.out.println(list);
         /*
          * �÷��� �����ӿ�ũ(Collection Framework)�̶�
          * �ڹ� �÷����� ��ü�� �����ؼ� �����ϴ� ������ �Ѵ�.
          * Framework�̶� ������� �̸� ���� ������ ���̺귯���� ���Ѵ�.
          */
         
	}

}
