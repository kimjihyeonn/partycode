package List�迭_Ŭ����;
/*
 * Vector Ŭ���� => ������ ��ü=>�ڷᱸ��
 */

import java.util.Vector;

public class VectorClassEx {

	public static void main(String[] args) {
		String[] arr= {"������","����ȣ","������","�ڰ渮","�����"};
		
		/*
		 * Vector Ŭ���� ��ü�� ���� �迭�̴�.
		 */
		
		Vector<String> vec = new  Vector<String>(4, 3);
		
		System.out.println("���Ϳ� ����� ����� ������ :" + vec.size());//0
		System.out.println("������ �뷮�� : "+vec.capacity()+"\n");//4
		
		for(int i=0; i<arr.length;i++) {
			vec.add(arr[i]);
			
		}
		System.out.println("���Ϳ� ����� ����� ������ :" + vec.size());//0
		System.out.println("������ �뷮�� : "+vec.capacity()+"\n");//4
		
		System.out.println(vec);
          //[������, ����ȣ, ������, �ڰ渮, �����]
		/**
		 *[�߿�] ��ü �������� ������  method overloading
		 */
		vec.add("�����");
		System.out.println(vec);
		//[������, ����ȣ, ������, �ڰ渮, �����, �����]
		vec.add(2, "ȫ�浿");
		System.out.println(vec);
		//[������, ����ȣ, ȫ�浿, ������, �ڰ渮, �����, �����]
		//"����ȣ"��"������" ���̿� "ȫ�浿"�߰�
		
		vec.remove(1);
		System.out.println(vec);
		//[������, ȫ�浿, ������, �ڰ渮, �����, �����]
		//"��ȫ��"����
		vec.remove("�����");
		System.out.println(vec);
		
	}

}
