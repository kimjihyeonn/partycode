package iaccess.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import iaccess.di.entity.Hello;

public class DiExam {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("iaccess/di/test/config.xml");
		
		Hello hello = ctx.getBean(Hello.class);
		
		
		hello.print("hello");
		
		String[] beans = ctx.getBeanDefinitionNames();
		
		for(String s :beans) {
			System.out.println(s);
		}

	}

}
