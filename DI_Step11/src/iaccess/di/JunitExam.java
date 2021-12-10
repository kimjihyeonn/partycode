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


		//2.getBean() 호출
		Hello hello =context.getBean(Hello.class);
		hello.print("HELLO");




		List<String> list = hello.getNames();

		list.forEach(s -> System.out.println(s));

		System.out.println("------------------");;

		for(String value : list) {
			System.out.println(value);

		}
		System.out.println("----------------");

		Iterator<String> lst = list.iterator();
          
		while(lst.hasNext()) {
			System.out.println(lst.next());
		}
		System.out.println("-----------------");
		
		/* Map */
		
		Map<String,Integer> ages = hello.getAges();
		for(Map.Entry<String, Integer> entry : ages.entrySet()) {
			System.out.println("KEY:" +entry.getKey()+", VALUE :" + entry.getValue());
		}
		
		Iterator<String> keys = ages.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(("key:" +key +", value: " + ages.get(key)));
		}
		
		ages.forEach((key, value) -> System.out.println("key:"+key+"| value:" +value));
	    ages.entrySet().forEach(entry-> System.out.println("key :"+entry.getKey()+" | value:"+entry.getValue()));
	    ages.keySet().forEach(key -> System.out.println("key :" +key));
	    ages.values().forEach(value -> System.out.println("value:" +value));
	    
	    System.out.println("-------------------------------");
	    
	    Set<String> hs = hello.getEmails();
	    Iterator<String> hi = hs.iterator();
	    
	    
	    /* lamda */
	    hs.forEach(s -> System.out.println(s));
	    
	    System.out.println("----------------------");
	    
	    while (hi.hasNext()) {
	    	System.out.println(hi.next());
	    }
	    System.out.println("-----------------------");
	    
	    for(String s : hs) {
	    	System.out.println(s);
	    }
	    
	    System.out.println("-----------------");
	    
	    List<Person> persons = hello.getPersons();
	    System.out.println("----------------person name sort before");
	    
	    persons.forEach(row-> System.out.println(row.getName()+":"+row.getAge()));
	    
	    Collections.sort(persons);
	   
	    System.out.println("------person name sort after-----------");
	    
	    persons.forEach(row->System.out.println(row.getName() +":" + row.getAge()));
	    
	    System.out.println("----------------------");
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
