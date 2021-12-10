package iaccess.di;

import org.springframework.context.annotation.Configuration;

import iaccess.di.entity.Hello;
import iaccess.di.ui.ColorPrinter;
import iaccess.di.ui.MonoPrinter;


@Configuration
public class Iass_di_config {
	
	public Hello hello() {
	 return	new Hello(colorPrinter());
	}
	
	public ColorPrinter colorPrinter() {
		return new ColorPrinter();
	}
	public MonoPrinter monoPrinter() {
		return new MonoPrinter();
	}

}
