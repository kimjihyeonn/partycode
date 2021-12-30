package iaccess.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import iaccess.di.entity.Hello;
import iaccess.di.ui.ColorPrinter;
import iaccess.di.ui.MonoPrinter;
import iaccess.di.ui.Printer;

public class DiExam {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("iaccess/di/test/config.xml");
		
		
		//Hello hello = (Hello)ctx.getBean("hello");
		Hello hello = ctx.getBean(Hello.class);
		//Hello hello = ctx.getBean("hello",Hello.class);
		
		Printer printer = ctx.getBean(MonoPrinter.class);
		String a= "안녕";
		String b= "안녕";
		
		Printer p = new ColorPrinter();
		Printer p2 = new ColorPrinter();
		System.out.println(a==b);
		System.out.println(a);
		
		System.out.println(p==p2);
		System.out.println(p);
		
		String c = new String("안녕");
		System.out.println(c);
		System.out.println(a==c);
		c=c.intern();
		System.out.println(a==c);
	    Integer d = new Integer(3);
	    int f= 3;
	    System.out.println(d);
	    System.out.println(d==f);
		
		System.out.println(ctx.getBean("mprinter").getClass());
		hello.print("안녕하세요");
		
		System.out.println(hello);
		
		
		String[] beans = ctx.getBeanDefinitionNames();
		
		for(String sadas :beans) {
			System.out.println(sadas);
		}

	}

	private static char[] typeof(Printer printer) {
		// TODO Auto-generated method stub
		return null;
	}

}
