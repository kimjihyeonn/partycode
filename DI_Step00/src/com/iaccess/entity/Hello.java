package com.iaccess.entity;

import com.iaccess.ui.Printer;


public class Hello {

	private Printer printer;
	private String pp;
	
	public Hello() {
		
	}

	public Hello(Printer p) {
		super();
		this.printer = p;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public String toString() {
		return "Hello [printer=" + printer + "]";
	}
	
	public void print(String s) {
		printer.print(s);
	}
	
	
	
	
}
