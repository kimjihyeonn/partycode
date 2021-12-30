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

	public void logAfterThrowing(JoinPoint joinPoint , Exception ex) {
		displayLine();

		System.out.println("### 날짜:" +UtilLib.currentDateTime());


		String signatureStr = joinPoint.getSignature().toString();
		System.out.println("### : "+ signatureStr + "실행.");


		System.out.println("###=> 공통코드 실행중");
		System.out.println("### 예외발생 :"+ex.toString());
		displayLine();
	}
	public void logAfter(JoinPoint joinpoint) {
		displayLine();
		
		System.out.println("### 날짜:" +UtilLib.currentDateTime());
		System.out.println("###:after 실행");
		String signatureStr = joinpoint.getSignature().toShortString();		
		System.out.println("###:after" + signatureStr + "완료.");
		
		displayLine();
	}

}
