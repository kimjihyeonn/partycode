package iaccess.di.ui;

import org.springframework.stereotype.Component;

@Component
public class ColorPrinter implements Printer {

	@Override
	public void print(String msg) {
		System.out.println("---color-----");
		
		System.out.println(msg);
		
		System.out.println("-----color-end----");
		
	}

	

}
