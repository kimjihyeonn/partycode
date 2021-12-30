package co.kr.mono.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.springframework.test.util.AopTestUtils;

import co.kr.mono.aop.test.AopTest;
import co.kr.mono.aop.util.UtilLib;

public class SecurityAop {
	
	public void displayLine() {
		System.out.println(UtilLib.lpad("*", 50, "*"));
	}
	
	public void logBefore(JoinPoint joinPoint) {
		displayLine();
		
		System.out.println("### 조회:"+AopTest.loginName);
		System.out.println("### 날짜:"+UtilLib.currentDateTime());
		System.out.println("### Before ["+joinPoint+"] 메서드 실행 전처리 수행");
		
		for(Object arg:joinPoint.getArgs()) {
			System.out.println("Before ["+joinPoint+"]아규먼트 :"+arg);
			
			
		}
		displayLine();
	
	}

}
