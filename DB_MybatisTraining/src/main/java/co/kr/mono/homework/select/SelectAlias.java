package co.kr.mono.homework.select;

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

import co.kr.mono.homework.dto.SaleCdDTO;
import co.kr.mono.training.dto.AreaSaleDTO;



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
	  public void selectSaleCnt() throws IOException{
		  try(SqlSession session =sqlSessionFactory.openSession()){
			  List<SaleCdDTO> sale = session.selectList("SelectNVOMapper.saleCnt");
			
			  sale.forEach(row->{
				  logger.info("----------------");
				  logger.info("Data : {} | {} | {} | {} | {} | {} | {} | {} | {} | {} | {} | {} | {}" , row.getAreaCd(), row.getCdNm(), row.getRegionArea(), row.getCol1()
						  ,row.getCol2(), row.getCol3(), row.getCol4(), row.getCol5(), row.getCol6(), row.getCol7(), row.getCol8(), row.getCol9(), row.getTot());
			  });
			  logger.info("---------------------");
		  }
	  }
	  

	 

}
