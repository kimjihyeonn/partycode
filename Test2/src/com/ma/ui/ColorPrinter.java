package com.ma.ui;

public class ColorPrinter implements Printer {

	@Override
	public void print(String msg) {
		System.out.println("---color-----");
		
		System.out.println(msg);
		
		System.out.println("---------");
		
	}

	

}
