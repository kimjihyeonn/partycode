package com.ma.test;

import com.ma.ui.ColorPrinter;
import com.ma.ui.Monoprinter;
import com.ma.ui.Printer;

public class UiTest {
	
	public static void main(String[] args) {
		Printer p = new Monoprinter();
		p.print("hello");
	}

}
