package com.company.Spring_MVC_Board.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.Spring_MVC_Board.common.JDBCUtil;


public class UserDAO {
	
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	
	private final String USER_GET=
			"select * from users where id=? and password=?";
	public UserDO getUser(UserDO userDO) {
		
		UserDO user=null;
		
		try {System.out.println("===>JDBC로 getUser()로 기능처리");
		
		conn=JDBCUtil.getConnection();
		pstmt = conn.prepareStatement(USER_GET);
		pstmt.setString(1, userDO.getId());
		pstmt.setString(2, userDO.getPassword());
		
		rs=pstmt.executeQuery();
		
		if(rs.next()) {
		  user=new UserDO();
		  user.setId(rs.getString("ID"));
		  user.setPasswd(rs.getString("PASSWORD"));
		  user.setName(rs.getString("NAME"));
		  user.setRole(rs.getString("ROLE"));
			
		}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
	
		
	
	return user;
  }  
}
