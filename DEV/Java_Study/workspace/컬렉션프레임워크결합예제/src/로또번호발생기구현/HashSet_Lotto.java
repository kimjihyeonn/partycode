package �ζǹ�ȣ�߻��ⱸ��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSet_Lotto {

	public static void main(String[] args) {
		Set set =new HashSet();
		/*
		 * �ζǹ�ȣ ����: 1~45����
		 * 6�ڸ��� �ʿ��ϴ�
		 */
		for(int i=0; set.size()<6;i++) {
			Random rnd = new Random();
			int number = rnd.nextInt(45)+1;//1~45������ ������ ���� �߻���Ų��
			set.add(new Integer(number)); //������ ��üȭ��Ŵ!!
			
		}
           
		
		
           
           List list=new ArrayList(set); 
           Collections.sort(list);
           
           System.out.println("<<�ζǹ�ȣ�����>>");
           System.out.println(list.get(1));
	}

	

}
