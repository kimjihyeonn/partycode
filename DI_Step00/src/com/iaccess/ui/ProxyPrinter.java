package com.iaccess.ui;

public class ProxyPrinter implements Printer {

	
	Printer printer;
	
	public ProxyPrinter(Printer printer) {
		super();
		this.printer = printer;
	}
	@Override
	public void print(String s) {
          
		System.out.println("----1.Proxy @Before 먼저작업----");
	   System.out.println("---2.proxy @around 작업----");
        printer.print(s);
        System.out.println("---2. proxy@around 작업끝");
        System.out.println("------2.proxy @after 나중작업-------");
		
	}
	
	

}
