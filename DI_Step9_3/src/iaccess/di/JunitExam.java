package iaccess.di;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iaccess.di.entity.Hello;
import iaccess.di.ui.Printer;

public class JunitExam {
	
	static ApplicationContext context;
    
	
	
	@BeforeClass
	public static void init() {
		context = new ClassPathXmlApplicationContext("iaccess/di/config.xml");
	 System.out.println("@BeforeClass:"+context);
	}
	
	@Test
	public void bean1() {
	    
		System.out.println("================");
		System.out.println("bean1 객체 : "+this);
		System.out.println("컨테이너 객체:" +context);
		System.out.println("bean1:"+this);
		System.out.println("================");
		//2.getBean() 호출
		Hello hello =context.getBean(Hello.class);
		
		System.out.println(JunitExam.this);
		
		
		//3.Hello 의 getName() 호출.
		assertEquals("SPRING", hello.getName());
		//3.Hello의 printer() 호출
		hello.print("hello");
	}
	
	

	

	@Test
	public void bean2() {
		
		System.out.println("================");
		System.out.println("bean2 객체 : " + this);
		System.out.println("bean2 contest:" +context);
		System.out.println("================");
	    
		
	
		Printer printer=(Printer)context.getBean("printer");
		
		Printer printer2 = context.getBean(Printer.class);
		
		assertSame(printer, printer2);
			
		
		
		
		
	}
}
