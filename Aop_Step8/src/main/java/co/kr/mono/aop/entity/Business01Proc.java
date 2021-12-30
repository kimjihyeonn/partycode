package co.kr.mono.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class Business01Proc {
	
	public Business01Proc(){
		
	}
	
	public String cmdCoponent01() {
		
		return "Business01Proc:cmdCoponent01 =>"+"NO VALUE";
		
	}
	
	public String cmdCoponent02(String str) {
		return "Business01Proc:cmdComponent01=>"+str;
	}

}
