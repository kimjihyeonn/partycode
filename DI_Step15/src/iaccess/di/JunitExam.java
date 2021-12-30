package iaccess.di;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import iaccess.di.entity.Person;
import iaccess.di.ui.ColorPrinter;
import iaccess.di.ui.Printer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:iaccess/di/config.xml")
public class JunitExam {


	@Autowired
	ApplicationContext context;



	@Test
	public void bean1() {


		Hello hello =context.getBean(Hello.class);
		
		
		hello.print("HELLO");
		System.out.println(hello.toString());


	}





	@Ignore
	@Test
	public void bean2() {

		System.out.println("================");
		System.out.println("bean2 객체 : " + this);
		System.out.println("bean2 contest:" +context);
		System.out.println("================");



		Hello hello1 = context.getBean("hello",Hello.class);


		Hello hello2 = context.getBean("hello1",Hello.class);

	





	}
}
