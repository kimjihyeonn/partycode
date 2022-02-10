package com.company.model1board.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	//H2 데이터 베이스 연동에 관련된..
	
	static final String driver = "org.h2.Driver";
	static final String url = "jdbc:h2:tcp://localhost/~/test";
	
	public static Connection getConnection() throws Exception{
		Connection con =null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"sa","");
			return con;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//DML(insert, update, delete) 작업 종료 시 자원 해제 메소드 구현
	public static void close(PreparedStatement pstmt,Connection conn) {
		if(pstmt != null) {
			try {
				if(!pstmt.isClosed()) pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				pstmt =null;
			}
				
			
		}if(conn != null) {
			try {
				if(!conn.isClosed()) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				conn =null;
			}
	    }
	}
	//select 작업 종료 시 자ㅜ언 해제 메소드 구현
	public static void close(ResultSet rs, PreparedStatement pstmt,Connection conn) {
		if(rs != null) {
			try {
				if(!rs.isClosed()) rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				rs =null;
			}
				
		}
		
		
		if(pstmt != null) {
			try {
				if(!pstmt.isClosed()) pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				pstmt =null;
			}
				
			
		}if(conn != null) {
			try {
				if(!conn.isClosed()) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				conn =null;
			}
	    }
	}
}

