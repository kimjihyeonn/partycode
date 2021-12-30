package co.kr.mono.aop.test;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.mono.aop.entity.Person;
import co.kr.mono.aop.ui.ColorPrinter;
import co.kr.mono.aop.ui.MonoPrinter;
import co.kr.mono.aop.ui.Printer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:co/kr/mono/aop/test/config.xml")
public class AopTest {
	
	@Autowired
	ApplicationContext context;
	
	public static String loginName="강감찬";
	
	@Test
	public void bean1() {
		
		System.out.println(context.toString());
		
		Person p = new Person();
		
		Person person = context.getBean(Person.class);
		Map<String, Float> map = person.getTot();
		person.getTot("2");
		
		
		
		System.out.println("Client Test 결과 출력");
		for(Map.Entry<String, Float> entry: map.entrySet()) {
			System.out.println("학년:"+entry.getKey());
			System.out.println(",평균" + String.format("%.1f", entry.getValue()));
			
		}
		
	
	
	
	}


}
