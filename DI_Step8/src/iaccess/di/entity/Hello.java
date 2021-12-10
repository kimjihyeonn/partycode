package iaccess.di.entity;

import iaccess.di.ui.Printer;


public class Hello {

	private Printer printer;
	private String name="";
	
	public Hello() {
		
	}
	public Hello(Printer p) {
		System.out.println("constructor 1 parameter");
		this.printer = p;
	}
	
	public Hello(Printer p, String name) {
		System.out.println("constructor 2 parameter");
		this.printer = p;
		this.name =name;
	}


	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hello [printer=" + printer + "]";
	}
	
	public void print(String s) {
		
		if(this.name ==null)
			printer.print(s);
		else
			printer.print(this.name+" "+s);
		
	}
	
	
	
	
}
