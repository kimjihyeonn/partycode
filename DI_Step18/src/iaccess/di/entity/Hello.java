package iaccess.di.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import iaccess.di.ui.Printer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@NoArgsConstructor
@Component("hello")
public class Hello {
    
	@Autowired
	@Qualifier("colorPrinter")
	private Printer printer;
	
	
	@Value("#['SPRING+' EL '")
	String name;

	
	
	public Hello(Printer printer) {
		System.out.println("생성자인젝션");
		this.printer = printer;
	}
	public void print(String s) {
		if (name == null) {
			printer.print(s);
			
		}else {
			printer.print(name+" " +s);
		}
	}
	
	public void setPrinter(Printer printer) {
		System.out.println("세터인젝션");
		this.printer = printer;
	}
	
	
	
	
}
