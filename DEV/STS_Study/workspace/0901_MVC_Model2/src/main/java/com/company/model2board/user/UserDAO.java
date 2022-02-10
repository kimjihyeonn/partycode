package com.company.model2board.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.model2board.common.JDBCUtil;

public class UserDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs =null;
	
	//SQL ����
	private final String USER_GET
	= "select id, password from users where id=? and password=?";
	//�α��� ����� ��ȸ(select)�޼ҵ� ����
	public UserDO getUser(UserDO userObj) {
		//[�߿�] ��� '����' �ϸ� user ��ü ����,'����'�ϸ�  null�ǰڱ��ϱ� ���ؼ�
		UserDO user = null;
		
		try {
			System.out.println("===>JDBC�� getUser()�� ���ó��");
			
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, userObj.getId());
			pstmt.setString(2, userObj.getPassword());
			rs = pstmt.executeQuery(); //����� �ϳ��̴�.
			
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
