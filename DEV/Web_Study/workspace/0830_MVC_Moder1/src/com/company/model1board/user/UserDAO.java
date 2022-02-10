package com.company.model1board.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.model1board.common.JDBCUtil;


/**
 * 
 * 
 * DAO(Data Access Object) 의 약자 '데이터 접근 객체'를 의미한다.
 * 
 * 이클래스에는 DB를  연동하여 insert,update,delete,select 관련작업
 * 메소드 구현이 들어간다.
 *
 */

public class UserDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs =null;
	
	//SQL 문장
	private final String USER_GET
	= "select id, password from users where id=? and password=?";
	//로그인 사용자 조회(select)메소드 구현
	public UserDO getUser(UserDO userObj) {
		//[중요] 이즈에 '성공' 하면 user 객체 생성,'실패'하면  null되겠금하기 위해서
		UserDO user = null;
		
		try {
			System.out.println("===>JDBC로 getUser()로 기능처리");
			
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, userObj.getId());
			pstmt.setString(2, userObj.getPassword());
			rs = pstmt.executeQuery(); //결과는 하나이다.
			
			if(rs.next()) {
				user = new UserDO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
			
		}
		return user;
	}
	
	

}
