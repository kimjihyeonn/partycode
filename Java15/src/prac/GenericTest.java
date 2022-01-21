package prac;

import java.util.ArrayList;

public class GenericTest {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		
		list.add(10);
		list.add(20);
		
		
		Integer i = (Integer)list.get(1);
		
		System.out.println(list);
	}

}
