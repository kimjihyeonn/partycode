package 람다식_기초예제;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class LamdaEx01 {

	public static void main(String[] args) {
	   List<Integer> list= Arrays.asList(10,20,30,40,50);
	   
	   /*[방법1]
	   //외부반복자 Iterator
	   
	   Iterator<Integer> iterator = list.iterator();
	   
	   
	   
	   while(iterator.hasNext()) {
		   Integer value = iterator.next();
		   System.out.println(value);
	   }*/
	   //[방법2] => 람다식 적용하는 방법
	   //반복자 Stream 내부 반복자
	   /*컬렉션으로 부터 
	    * 스트림얻기=>List 컬렉션의 참조변수를 통해서
	    */
	   Stream<Integer> stream=list.stream();
	   
	             //consumer(소비자)
	   stream.forEach(aadsa->System.out.print(aadsa
			 ));
	   
	
	   
	}

}
