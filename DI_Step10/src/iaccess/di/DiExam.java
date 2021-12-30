package iaccess.di;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import iaccess.di.entity.Hello;


public class DiExam {
	 
	public static void main(String[] args) throws ClassNotFoundException {
		
	  
	
		ApplicationContext ctx = new GenericXmlApplicationContext("iaccess/di/config.xml");
		
		//Hello hello = (Hello)ctx.getBean("hello");
	     Hello hello = ctx.getBean("hello",Hello.class);
	     hello.print("안녕");
		//Hello hello = ctx.getBean("hello",Hello.class);
	
		
		
		

	}

}
