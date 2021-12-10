package iaccess.di;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import iaccess.di.entity.Hello;
import iaccess.di.ui.ColorPrinter;
import iaccess.di.ui.Printer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:iaccess/di/config.xml")
public class JunitExam {
	
	
	@Autowired
	ApplicationContext context;
    
	
	
	
	
	@Test
	public void bean1() {
	    
		System.out.println("================");
		System.out.println("bean1 객체 : "+this);
		System.out.println("컨테이너 객체:" +context);
		System.out.println("bean1:"+this);
		System.out.println("================");
		//2.getBean() 호출
		Hello hello =context.getBean("hello",Hello.class);
		
		
		
		
		//3.Hello 의 getName() 호출.
		assertEquals("SPRING", hello.getName());
		//3.Hello의 printer() 호출
		hello.print("hello");
		
		String [] beanNames = context.getBeanDefinitionNames();
		
		for(String beanName : beanNames) {
			System.out.println(beanName);
			
		}
		System.out.println("----------------");
		
		//Hello Java->
		Class<?> clazz = Hello.class;
		
		Field[] fields =clazz.getDeclaredFields();
		
		for(Field field : fields) {
			
			System.out.println(field.getName());
		}
	}
	
	

	
    
	@Test
	public void bean2() {
		
		System.out.println("================");
		System.out.println("bean2 객체 : " + this);
		System.out.println("bean2 contest:" +context);
		System.out.println("================");
	    
		
	
		Hello hello1 = context.getBean("hello",Hello.class);
		
		
		Hello hello2 = context.getBean("hello1",Hello.class);
		
		//assertSame(printer, printer2);
		assertEquals(hello1.getName(), hello2.getName());
			
		
		
		
		
	}
}
