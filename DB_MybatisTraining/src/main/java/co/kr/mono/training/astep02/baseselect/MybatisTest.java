package co.kr.mono.training.astep02.baseselect;

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

public class MybatisTest {
	
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
	  public void selectTestOne() throws IOException{
	
	  try(SqlSession session =sqlSessionFactory.openSession()){
		AreaSaleDTO areaSaleDTO = session.selectOne("SelectBaseMapper.findAreaSales","10");
		logger.info("Sale cnt:{}" , areaSaleDTO);
		
	  }
	  
	 }
	  @Ignore
	  @Test
	  public void selectOneDTO() throws IOException{
		  try(SqlSession session =sqlSessionFactory.openSession()){
			  MsalesDTO sale = session.selectOne("SelectBaseMapper.findMsale");
			 //List<MsalesDTO> sale =session.selectList("SelectBaseMapper.findMsale");
			//Map<MsalesDTO,MsalesDTO> sale2 =session.selectMap("SelectBaseMapper.findMsale", "prodNm");
			  logger.info("Sale Cnt:{}",sale);
		  }
	  }
	  
	  
	  @Test
	  public void selectTestList() throws IOException{
		  try(SqlSession session =sqlSessionFactory.openSession()){
		
			 List<MsalesDTO> sale =session.selectList("SelectBaseMapper.findMsale");
			
			 sale.forEach( r ->logger.info("Data: {} | {} | {} ",
					 r.getProdId(),r.getProdNm(),r.getSaleCnt()));
		  }
	  }
	  
	 

}
