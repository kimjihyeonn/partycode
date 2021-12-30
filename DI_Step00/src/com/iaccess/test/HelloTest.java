package com.iaccess.test;

import com.iaccess.entity.Hello;
import com.iaccess.ui.ColorPrinter;
import com.iaccess.ui.MonoPrinter;
import com.iaccess.ui.Printer;
import com.iaccess.ui.ProxyPrinter;

public class HelloTest {

	public static void main(String[] args) {
		
		
		Printer printer =new ProxyPrinter(new ColorPrinter());
		
		Hello hello =new Hello(printer);
		
		hello.print("hello");
	}

}
