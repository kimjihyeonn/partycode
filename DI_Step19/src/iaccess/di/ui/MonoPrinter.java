package iaccess.di.ui;

import org.springframework.stereotype.Component;

@Component("monoPrinter")
public class MonoPrinter implements Printer {

	@Override
	public void print(String msg) {
		System.out.println("====(monoprint)");
		System.out.println(msg);
		System.out.println("=====mono-end===");
	
	}

}
