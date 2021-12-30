package co.kr.mono.training.astep06.select;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.kr.mono.training.dto.AreaSaleDTO;
import co.kr.mono.training.dto.MsalesDTO;
import co.kr.mono.training.nvo.AreaSaleNVO;
import co.kr.mono.training.nvo.MsalesNVO;

public class SelectAlias {
	
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	private SqlSessionFactory sqlSessionFactory;
	
	
	@Before
	public void setUp() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
	sqlSessionFactory =	new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	  @Ignore
	  @Test 
	  public void selectMapTest() throws IOException{
	
	  try(SqlSession session =sqlSessionFactory.openSession()){
		int saleCnt = session.selectOne("SelectDepRtypeMapper.examCount");
		logger.info("출력건수 : {} " + saleCnt);
	    
		
	    }
	  }
	 @Test
	 public void selectMapDate() throws IOException{
		 try(SqlSession session =sqlSessionFactory.openSession()){
			 			                                                            
			 Date saleDate = session.selectOne("SelectDepRtypeMapper.examDate");
			 logger.info("java.util.date를 이용한 현재시간 org:{}",saleDate);	                                                                              
			 logger.info("ms total:{}",saleDate.getTime()); 
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			 String decodeSdf = sdf.format(saleDate);
			 logger.info("SimpleDateFormat 을 이용한 현재시간 convert: {}" , decodeSdf );
			 		                                                              	 			 
		 }
	 }
	  
	 


	 

}
