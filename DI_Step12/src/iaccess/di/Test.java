package iaccess.di;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {


	    Person p = new Doctor();
	    
	    p.hello3();
	    
	    
	    Collection<Integer> c = new ArrayList<Integer>();
	    
	    c.add(3);
	    System.out.println(c);
	    c.add(6);
	    System.out.println(c);
	    System.out.println(c.size());
	    

     
          
		
	  
	    
	    
	 
	    
	    
	
		
	
		List<Integer> i = new LinkedList<Integer>();

			
			
			
		
		
		 
			Collections.sort(i);
			System.out.println(i);
			
			
		String[] t = {"안녕","하세요","반갑습니다"};
		
		System.out.println(t[0]);
		

	}

}
