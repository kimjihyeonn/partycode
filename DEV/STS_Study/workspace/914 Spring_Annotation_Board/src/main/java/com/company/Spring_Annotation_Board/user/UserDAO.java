package com.company.Spring_Annotation_Board.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import com.company.Spring_Annotation_Board.common.JDBCUtil;
import com.company.Spring_Annotation_Board.common.PasswordEncryptUtil;

public class UserDAO {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;

	//회원 가입 시  패스워드를 암호화시킨 데이터를 저장할 객체 참조 변수 선언
	
	String pwEncrypt;
	
	
	private final String USER_GET =
			"select * from user where id=? and password=?";
	
	private final String USER_INSERT
	= "insert into user values(?,?,?,?,?)";
	
	public UserDO getUser(UserDO userDO) {
		UserDO user = null;
		try {
			System.out.println("===>getUser()처리됨!");
			
			conn = JDBCUtil.getConnection();
			pstmt =conn.prepareStatement(USER_GET);
			pstmt.setString(1, userDO.getId());
			pstmt.setString(2, userDO.getPassword());
			
			rs=pstmt.executeQuery();
			
			
			if(rs.next()) {
				user = new UserDO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
				user.setPwencrypt(rs.getString("PWENCRYPT"));
			
				
				
				
			}
			
			
		}catch(Exception e) {
			System.out.println("===>getUser()" +e);
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return user;
	} //getUser()메소드가 끝나는 부분
	
	public void insertUser(UserDO userDO) {
		System.out.println("=>>> insertUseR() 기능처리됨!");
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt=conn.prepareStatement(USER_INSERT);
			pstmt.setString(1, userDO.getId());
			pstmt.setString(2, userDO.getPassword());
			//입력받은 패스워드를 암호화시켜 세번째 물음표값으로 지정
			String plainText = userDO.getPassword();
			pwEncrypt = PasswordEncryptUtil.encryptSHA256(plainText);
			pstmt.setString(3,pwEncrypt);
		
			
			pstmt.setString(4, userDO.getName());
			pstmt.setString(5, userDO.getRole());
			
			
			pstmt.executeUpdate();
			
		
		}catch(Exception e) {
			System.out.println("insertUser()" + e);
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}

}
