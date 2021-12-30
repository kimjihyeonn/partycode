package iaccess.di.entity;

import iaccess.di.ui.Babi;
import iaccess.di.ui.Printer;


public class Hello {

	private Printer printer;
	private Babi babi;
	
	public Hello() {
		
	}
	public Hello(Printer p,Babi babi) {
		super();
		this.printer = p;
		this.babi = babi;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
		this.printer.print("hello");
		
		
		
	}

	
	@Override
	public String toString() {
		
		return "Hello [printer=" + printer + ", babi=" + babi + "]";
	}
	
	public void print(String s) {
		printer.print(s);
	}
	
	public void act(String s) {
		babi.act(s);
	}
	public Babi getBabi() {
		return babi;
	}
	public void setBabi(Babi babi) {
		this.babi = babi;
	}
	
	
	
	
}
