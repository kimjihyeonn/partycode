package co.kr.mono.training.astep15.mapping;

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

	  @Test 
	  public void selectMapTest1() throws IOException{
	
	  try(SqlSession session =sqlSessionFactory.openSession()){
	Artist artist	=session.selectOne("SelectObjectMapper.selectArtistByPrimaryKey","BTS");
		logger.info("Artist 매핑 : {} " + artist);
	    
		
	    }
	  }
	  @Ignore
	  @Test
	  public void selectAlbum() throws IOException{
			
		  try(SqlSession session =sqlSessionFactory.openSession()){
		Album album	=session.selectOne("SelectObjectMapper.selectAlbumByPrimaryKey","BS1");
			logger.info("Artist 매핑: {}", album.getArtist());
			
			logger.info("album 매핑: {}" , album);
			for(Song song : album.getSongs()) {
				logger.info(" |- song 매핑 : {}", song);
			}
		    
			
		    }
		  }
	 @Ignore
	  @Test
	  public void selectSong() throws IOException{
		  
		  try(SqlSession session =sqlSessionFactory.openSession()){
			  
			List<Song> songList = session.selectList("SelectObjectMapper.selectSongByAlbumKey","BS1");
			
			for(Song song: songList) {
				logger.info("song 매핑 : {}", song);
				logger.info("|-ALbum 매핑 : {}",song.getAlbum().getAlbumTitle());
			}
			
		  }
		  
	  }
	
	  
	 


	 

}
