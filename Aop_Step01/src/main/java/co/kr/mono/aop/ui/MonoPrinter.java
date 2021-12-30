package co.kr.mono.aop.ui;

public class MonoPrinter implements Printer {

	public void print(String msg) {
		System.out.println("====(monoprint)");
		System.out.println(msg);
		System.out.println("=====mono-end===");
		
	}

	
  



}
