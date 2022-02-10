package api.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		//list - ���� o , �ߺ��� o
		
		//ArrayList<String> list = new ArrayList<>();
		List<String> list=new ArrayList<>();
		
		//add()�߰�
		
		list.add("�Ұ��");
		list.add("�������");
		list.add("�߰��");
		list.add("�����");
		
		//size() ũ��Ȯ��
		System.out.println("����Ʈũ��:"+list.size());
		//toString()
		
		System.out.println(list.toString());
		
		//add(�ε���,��) 
		list.add(3, "����");
		System.out.println(list.toString());
		//get()
		String name=list.get(3);
		System.out.println(name);
		
		//remove() ����
		list.remove(4);
		
		System.out.println(list.toString());
		
		//contains() ���� ����
		if(list.contains("����")) {
			System.out.println("���� �����մϴ�.");
		}
		System.out.println("----------------------------------------");
		 //�迭�� ����Ʈ�� ��ȯ Arrays. asList
		String[] arr = {"ȫ�浿2" , "�̼���2"};
		List<String> list2=Arrays.asList(arr);
		
		list.addAll(list2);
		
		System.out.println(list.toString());
		
	}

}
