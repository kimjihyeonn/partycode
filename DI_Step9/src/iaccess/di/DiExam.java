package iaccess.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import iaccess.di.entity.Hello;

public class DiExam {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("iaccess/di/config.xml");
		
		
		//Hello hello = (Hello)ctx.getBean("hello");
		Hello hello = ctx.getBean(Hello.class);
		//Hello hello = ctx.getBean("hello",Hello.class);
		
		
		hello.print("hello");
		
		String[] beans = ctx.getBeanDefinitionNames();
		System.out.println(ctx.getBeanDefinitionCount());
		for(String sadas :beans) {
			System.out.println(sadas);
		}

	}

}
