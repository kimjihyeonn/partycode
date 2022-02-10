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

	//ȸ�� ���� ��  �н����带 ��ȣȭ��Ų �����͸� ������ ��ü ���� ���� ����
	
	String pwEncrypt;
	
	
	private final String USER_GET =
			"select * from user where id=? and password=?";
	
	private final String USER_INSERT
	= "insert into user values(?,?,?,?,?)";
	
	public UserDO getUser(UserDO userDO) {
		UserDO user = null;
		try {
			System.out.println("===>getUser()ó����!");
			
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
	} //getUser()�޼ҵ尡 ������ �κ�
	
	public void insertUser(UserDO userDO) {
		System.out.println("=>>> insertUseR() ���ó����!");
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt=conn.prepareStatement(USER_INSERT);
			pstmt.setString(1, userDO.getId());
			pstmt.setString(2, userDO.getPassword());
			//�Է¹��� �н����带 ��ȣȭ���� ����° ����ǥ������ ����
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
