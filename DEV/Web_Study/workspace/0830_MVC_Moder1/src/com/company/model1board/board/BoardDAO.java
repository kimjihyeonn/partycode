package com.company.model1board.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.company.model1board.common.JDBCUtil;

public class BoardDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs =null;
	
	
	public List<BoardDO> getBoardList(String searchField, String searchText){
		System.out.println("===> getBoardList() 扁瓷贸府");
		
		List<BoardDO> boardList =new ArrayList<BoardDO>();
		try {
			conn=JDBCUtil.getConnection();
			String where ="";
			if(searchField != null && searchText != null) {
				where = "where " + searchField+" like '%" + searchText+"%'";
				
			}
			
			String Condition_SQL = "select * from board "+where+" order by seq desc";
			
			pstmt = conn.prepareStatement(Condition_SQL);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//BoardDO 按眉 积己
				BoardDO board = new BoardDO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setRegdate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				
				boardList.add(board);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return boardList;
	}

}
