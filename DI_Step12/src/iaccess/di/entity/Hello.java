package iaccess.di.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import iaccess.di.ui.Printer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hello {

	private Printer printer;	
	private List<Person> persons;

	
	
	public void print(String s) {
		printer.print(s);
	}
	
	
}
