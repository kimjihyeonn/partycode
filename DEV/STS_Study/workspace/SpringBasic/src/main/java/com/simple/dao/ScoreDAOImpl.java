package com.simple.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;


@Repository("aaa")
public class ScoreDAOImpl implements ScoreDAO{
	@Autowired
    private DataSource ds;
	
	
	
	
	@Override
	public void regist(ScoreVO vo) {
		
		String sql = "insert into score values(score_seq.nextval,?,?,?,?)";
		try {
			Connection conn = ds.getConnection();
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKor());
			pstmt.setInt(3, vo.getEng());
			pstmt.setInt(4, vo.getMath());
			
		    
			pstmt.executeUpdate(); // 성공시 1반환, 실패시0반환
			conn.close();
		    pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<ScoreVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}
//	
//	ArrayList<ScoreVO> list = new ArrayList<>();
//
//	@Override
//	public void regist(ScoreVO vo) {
//		
//		list.add(vo);
//		System.out.println(11);
//		
//	}
//
//	@Override
//	public ArrayList<ScoreVO> getList() {
//		
//		return list;
//	}
//
//	@Override
//	public void delete(int num) {
//		list.remove(num);
//		
//	}
   
}
