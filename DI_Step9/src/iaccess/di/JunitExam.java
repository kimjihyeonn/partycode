package iaccess.di;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iaccess.di.entity.Hello;
import iaccess.di.ui.Printer;

public class JunitExam {
	
	ApplicationContext context;
    String arr="후에에";
	
	
	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("iaccess/di/config.xml");
		System.out.println("컨테이너생성");
		System.out.println("컨테이너 객체:" +this);
		System.out.println("컨테이너 객체:" +this.context);
	}
	
	@Test
	public void bean1() {
	    
		System.out.println("================");
		System.out.println("bean1 객체 : "+this);
		System.out.println("컨테이너 객체:" +this.context);
		System.out.println("================");
		//2.getBean() 호출
		Hello hello =context.getBean(Hello.class);
		
		System.out.println(JunitExam.this);
		
		this.setArr("안녕하세요");
		System.out.println(this.getArr());
		//3.Hello 의 getName() 호출.
		assertEquals("SPRING", hello.getName());
		//3.Hello의 printer() 호출
		hello.print("hello");
	}
	
	public String getArr() {
		return arr;
	}

	public void setArr(String arr) {
		this.arr = arr;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	@Test
	public void bean2() {
		
		System.out.println("================");
		System.out.println("bean2 객체 : " + this);
		System.out.println("컨테이너 객체:" +context);
		System.out.println("================");
	    
		
		System.out.println(JunitExam.this.getArr());
		Printer printer=(Printer)context.getBean("printer");
		
		Printer printer2 = context.getBean(Printer.class);
		
		assertSame(printer, printer2);
			
		
		
		
		
	}
}
