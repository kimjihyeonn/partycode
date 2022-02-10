package 샘플2방식약한결합;

import java.beans.beancontext.BeanContext;

public class HelloApp {
	
	public static void main(String[] args) {
	
	//인터페이스명  객체 참조변수  = new 구현클래스
	  MessageBean bean =null;
		bean=	  new MessageBeanEn();
	
	  bean.sayHello("Son heung min");
	  
	  
	  
	  
	  bean = new MessageBeanKr();
	  
	  bean.sayHello("손흥민");
 }
}