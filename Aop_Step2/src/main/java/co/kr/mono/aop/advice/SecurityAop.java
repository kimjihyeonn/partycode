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
	
	public void logAfterReturning(JoinPoint joinPoint,Object retVal) {
		displayLine();
		System.out.println("### 조회:" +AopTest.loginName);
		System.out.println("### 날짜:" +UtilLib.currentDateTime());
		displayLine();
		
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println("After Returning 내부 결과 출력 ");
		System.out.println("### : "+ signatureStr + "\n###: 실행 결과 [" +retVal+"]");
		
		
	}

}
