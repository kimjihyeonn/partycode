package co.kr.mono.training.astep01.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	
      static Logger logger = LoggerFactory.getLogger(LogTest.class); 
	
	public static void main(String[] args) {
		
		logger.info("로그메세지:{}","hello world");
		
		int result = sum(2,2);
		
		System.err.println("2+2=" +result);
		
		
	}

	private static int sum(int i, int j) {
		
		return i+j;
	}

}
