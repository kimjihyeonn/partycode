package com.company.model2board.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import com.company.model2board.common.JDBCUtil;

public class BoardDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs =null;
	
	
	public List<BoardDO> getBoardList(String searchField, String searchText){
		System.out.println("===> getBoardList() ���ó��");
		
		List<BoardDO> boardList =new ArrayList<BoardDO>();
		try {
			conn=JDBCUtil.getConnection();
			String where ="";
			if(searchField != null && searchText !=null) {
				where = "where " + searchField+" like '%" + searchText+"%'";
				
			}
			
			String Condition_SQL = "select * from board "+where+" order by seq desc";
			
			pstmt = conn.prepareStatement(Condition_SQL);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//BoardDO ��ü ����
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
 //�Խñ� �󼼺��� �޼ҵ� ����
	
	 public BoardDO getBoard(BoardDO boardDO) {
		 System.out.println("===> JDBC�� getBoard()�޼ҵ� ��� ó����");
		 
		 BoardDO board =null;
		 try {
			 
			 conn=JDBCUtil.getConnection();
			 //[�߿�] select �۾��� �ϱ� ���� ���� �ش� �Խñ��� '��ȸ��'�� ���� ���Ѿ��Ѵ�.
			 //��ȸ�� �����ϱ� 
			 String UPDATE_CNT = "update board set cnt=cnt+1 where seq=?";
			 pstmt= conn.prepareStatement(UPDATE_CNT);
			 pstmt.setInt(1, boardDO.getSeq());
			 pstmt.executeUpdate(); //DML�۾���ȸ�� 1����
			 //�׷� ���� �ش� �Խñ� ��������
			 String BOARD_GET = "select * from board where seq=?";
			 pstmt = conn.prepareStatement(BOARD_GET);
			 pstmt.setInt(1, boardDO.getSeq());
			 
			 //��� ���ڵ�� �ϳ��̴�.
			 rs = pstmt.executeQuery(); // select �۾��� �޼ҵ� ȣ����
			 if(rs.next()) {
				 board = new BoardDO();
				 board.setSeq(rs.getInt("SEQ"));
			     board.setTitle(rs.getString("TITLE"));
				 board.setWriter(rs.getString("WRITER"));
				 board.setContent(rs.getString("CONTENT"));
				 board.setRegdate(rs.getDate("REGDATE"));
				 board.setCnt(rs.getInt("CNT"));
				 
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 JDBCUtil.close(rs, pstmt, conn);
		 }
		 return board;
	 } //end getBoard()========================================
	
	//�Խñ� '����' �޼ҵ�
	 
 public void updateBoard(BoardDO boardDO) {
	 System.out.println("===>JDBC�� updateBoard() ��� ó����");
	 	 
	 
	 try {
		 conn=JDBCUtil.getConnection();
		 
		 String BOARD_UPDATE = "update board set title=?,content=? where seq=?";
		 pstmt = conn.prepareStatement(BOARD_UPDATE);
		 pstmt.setString(1, boardDO.getTitle());
		 pstmt.setString(2, boardDO.getContent());
		 pstmt.setInt(3, boardDO.getSeq());
		 pstmt.executeUpdate();
		 
		 
	 }catch(Exception e) {
		 e.printStackTrace();
	 }finally {
		 JDBCUtil.close(pstmt, conn);
	 }
 } //end updateBoard()=======================================================================
 
 
public void insertBoard(BoardDO boardDO) {
	System.out.println("===>JDBC�� insertBoard() ���ó����");
	
	
	
	try {conn = JDBCUtil.getConnection();
		 String BOARD_INSERT = "insert into board(seq,title,writer,content) values((select nvl(max(seq),0)+1 from board),?,?,?)";
		 pstmt = conn.prepareStatement(BOARD_INSERT);
		 pstmt.setString(1, boardDO.getTitle());
		 pstmt.setString(2, boardDO.getWriter());
		 pstmt.setString(3, boardDO.getContent());
		 pstmt.executeUpdate();
		 
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		JDBCUtil.close(pstmt, conn);
	}
} //end insertBoard() ==========================


public void deleteBoard(BoardDO boardDO) {
	System.out.println("===>JDBC�� deleteBoard() ��� ó����");
	 
	 
	 try {
		 conn=JDBCUtil.getConnection();
		 
		 String BOARD_DELETE = "delete from board where seq=?";
		 pstmt = conn.prepareStatement(BOARD_DELETE);
		 pstmt.setInt(1, boardDO.getSeq());
		 
		 pstmt.executeUpdate();
		 
		 
	 }catch(Exception e) {
		 e.printStackTrace();
	 }finally {
		 JDBCUtil.close(pstmt, conn);
	 }
	
}
	
	
}
