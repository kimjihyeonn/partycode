package ���ٽ�_���ʿ���;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class LamdaEx01 {

	public static void main(String[] args) {
	   List<Integer> list= Arrays.asList(10,20,30,40,50);
	   
	   /*[���1]
	   //�ܺιݺ��� Iterator
	   
	   Iterator<Integer> iterator = list.iterator();
	   
	   
	   
	   while(iterator.hasNext()) {
		   Integer value = iterator.next();
		   System.out.println(value);
	   }*/
	   //[���2] => ���ٽ� �����ϴ� ���
	   //�ݺ��� Stream ���� �ݺ���
	   /*�÷������� ���� 
	    * ��Ʈ�����=>List �÷����� ���������� ���ؼ�
	    */
	   Stream<Integer> stream=list.stream();
	   
	             //consumer(�Һ���)
	   stream.forEach(aadsa->System.out.print(aadsa
			 ));
	   
	
	   
	}

}
