package com.iaccess.test;

import com.iaccess.entity.Hello;
import com.iaccess.ui.ColorPrinter;
import com.iaccess.ui.MonoPrinter;

public class HelloTest {

	public static void main(String[] args) {
		
		
		Hello hel = new Hello(new ColorPrinter());
		
		hel.print("hello");
       
	}

}
