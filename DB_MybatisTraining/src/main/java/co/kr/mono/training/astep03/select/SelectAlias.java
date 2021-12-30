package co.kr.mono.training.astep03.select;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
	
	
	  @Test 
	  public void selectTestOne() throws IOException{
	
	  try(SqlSession session =sqlSessionFactory.openSession()){
		AreaSaleNVO areaSaleVO = session.selectOne("SelectNVOMapper.findAreaSales","10");
		logger.info("Sale cnt:{}" , areaSaleVO);
		
	  }
	  
	 }
	  @Ignore
	  @Test
	  public void selectList() throws IOException{
		  try(SqlSession session =sqlSessionFactory.openSession()){
			  List<MsalesNVO> sale = session.selectList("SelectNVOMapper.findMsale");
			
			  sale.forEach(row->{
				  logger.info("----------------");
				  logger.info("Data : {} | {} | {}" , row.getProdId(), row.getProdNm(), row.getSaleCnt());
			  });
			  logger.info("---------------------");
		  }
	  }
	  

	 

}
