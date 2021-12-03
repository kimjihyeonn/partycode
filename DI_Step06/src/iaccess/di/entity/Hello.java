package iaccess.di.entity;

import iaccess.di.ui.Printer;


public class Hello {

	private Printer printer;
	
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
