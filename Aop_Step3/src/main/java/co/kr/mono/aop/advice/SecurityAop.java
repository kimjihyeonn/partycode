package co.kr.mono.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.test.util.AopTestUtils;

import co.kr.mono.aop.test.AopTest;
import co.kr.mono.aop.util.UtilLib;

public class SecurityAop {
	
	public void displayLine() {
		System.out.println(UtilLib.lpad("*", 50, "*"));
	}
	
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
	 
		System.out.println("### 조회:" +AopTest.loginName);
		System.out.println("### 날짜:" +UtilLib.currentDateTime());
		displayLine();
		
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println("### : "+ signatureStr + "시작.");
		
		long start = System.currentTimeMillis();
		
		try {
			Object result = joinPoint.proceed();
			return result;
			
		} finally {
			
			long finish = System.currentTimeMillis();
			System.out.println("###:"+signatureStr+"종료.");
			System.out.println("###:"+signatureStr+"실행시간"+(finish -start)+"ms");
		}
	
	}

}
