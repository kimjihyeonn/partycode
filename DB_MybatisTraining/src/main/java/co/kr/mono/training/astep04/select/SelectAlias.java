package co.kr.mono.training.astep04.select;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
	
	 
	  @Test 
	  public void selectMapTest() throws IOException{
	
	  try(SqlSession session =sqlSessionFactory.openSession()){
		List<Map<String, Object>> sale = session.selectList("SelectVOMapper.findMsaleMap");
	    
		
		sale.forEach(row->{
			logger.info("--------------");
			row.forEach((key,val) -> {
				logger.info("* {} : {}" , key, val);
			});
		});
		logger.info("-----------------------");
	  }
	  
	 }
	  @Ignore
	  @Test
	  public void selectOneParam() throws IOException{
		  try(SqlSession session =sqlSessionFactory.openSession()){
			  List<MsalesDTO> sale = session.selectList("SelectVOMapper.findMsale","00005");
			
			  sale.forEach(row->{
				  logger.info("----------------");
				  logger.info("Data : {} | {} | {}" , row.getProdId(), row.getProdNm(), row.getSaleCnt());
			  });
			  logger.info("---------------------");
		  }
	  }
	  @Ignore
	  @Test
	  /* 파라미터n개 => vo객체*/
	  public void selectMultiParam() throws IOException{
		  try(SqlSession session =sqlSessionFactory.openSession()){
			 MsalesDTO msale =  new MsalesDTO("00005","김치냉장고","  ");
			  List<MsalesDTO> sale = session.selectList("SelectVOMapper.findMsaleByMultiParm", msale);
			
			  sale.forEach(row->{
				  logger.info("----------------");
				  logger.info("Data : {} | {} | {}" , row.getProdId(), row.getProdNm(), row.getSaleCnt());
			  });
			  logger.info("---------------------");
		  }
	  }
	  @Ignore
	  @Test
	  /* 파라미터n개 => vo객체*/
	  public void selectMultiParamMap() throws IOException{
		   Map<String, Object> param  =new HashMap<>();
		   param.put("prodId", "00005");
		   param.put("prodNm", "김치냉장고");
		  try(SqlSession session =sqlSessionFactory.openSession()){
		
			  List<MsalesDTO> sale = session.selectList("SelectVOMapper.findMsaleByMultiParm", param);
			
			  sale.forEach(row->{
				  logger.info("----------------");
				  logger.info("Data : {} | {} | {}" , row.getProdId(), row.getProdNm(), row.getSaleCnt());
			  });
			  logger.info("---------------------");
		  }
	  }
	  

	 

}
