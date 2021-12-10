package iaccess.di.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import iaccess.di.ui.Printer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@NoArgsConstructor
public class Hello {
    
	@Autowired(required=false)
	private Printer printer;
	
	String name;

	
	//@Autowired
	public Hello(Printer printer) {
		System.out.println("생성자인젝션");
		this.printer = printer;
	}
	public void print(String s) {
		printer.print(s);
	}
	//@Autowired
	public void setPrinter(Printer printer) {
		System.out.println("세터인젝션");
		this.printer = printer;
	}
	//@Autowired
	public void xasdasdPrinter(Printer printer) {
		System.out.println("세터인젝션");
		this.printer = printer;
	}
	
	
}
