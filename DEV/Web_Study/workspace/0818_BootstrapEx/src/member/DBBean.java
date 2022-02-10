package member;
import java.sql.*;
import java.util.*;

/** DBBean���������� ����Ŭ ������ �����Ѵ�.
DBBean Ŭ������ ȸ��(member)���̺�� ���õǾ� �ִ� Ŭ�����̴�. */
public class DBBean {
	//1. �������( = ������Ƽ��� �Ѵ�. �߰������ ��� �Ѵ�. �������, ������Ƽ, �߰������ �� �������� ����ؼ� ���)	
	//2. ������� �ʵ� �ۼ��� �̸��� Member_Form�� ��ü�̸��� �Ȱ��� �ִ°� ����. �ٸ��� �൵ ����� ����.
	//3. �ʵ��� ������ �� 18�� ���;� �Ѵ�	
	private String mem_id;
	private String mem_passwd;
	private String mem_name;
	private String mem_nickname;
	
	private String mem_email_id;		//�̸��� ���̵�
	private String mem_email_domain;	//�̸��� ������ 
	
	private String mem_num1;			//�ֹι�ȣ �� 6�ڸ�
	private String mem_num2;			//�ֹι�ȣ �� 7�ڸ�
	
	private String mem_phone;			//�ڵ�����ȣ
	private String mem_gender;			//����
	
	private int mem_Birthday1;			//����⵵
	private int mem_Birthday2;			//�����
	private int mem_Birthday3;			//�����
	
	private String mem_job;				//����
	
	private String zipCode;				//�����ȣ
	
	private String userAddr1;			//�ּ�
	private String userAddr2;			//���ּ�
	private String userAddr3;			//�����׸� �ּ�
	
	
	//5. ����Ŭ  DB������ ���õ� ���� ����.
	Connection conn		    = null; // ������ �����Ұ� �������� NULL���ش�.
	PreparedStatement pstmt = null;	// ����Ŭ ���ᰴü
	ResultSet			 rs = null;	//DB�� ������ �����
	
	//6. ����Ŭ JDBC ������ ���� driver, url ����
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url	   = "jdbc:oracle:thin:@localhost:1521:xe";

	
	
	//7. ����Ŭ ���� �޼ҵ� ���� => �ݵ�� ����ó�� �ʿ�, ������ ������ ���� �Լ�ó�� �س���.
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			conn  = DriverManager.getConnection(jdbc_url, "testdb", "testdb1234");
		} catch (Exception e) {
			System.out.println(" ����Ŭ connect ���ῡ ���� ���� " + e);
		}

	}
	
	
	//8. ����Ŭ JDBC ���� �����ϴ� �޼ҵ� ���� (�ڿ������ϱ�, �۾�����Ǹ� ����Ŭ ���ᵵ �����Ű��)
	public void disconnect() {
		try {
			pstmt.close();	//�ڿ�����
			conn.close();	//�ڿ�����
			rs.close();		//�ڿ�����
			
		} catch (Exception e) {
			System.out.println("disconnect �ڿ����� ���� �߻�: " + e);
		}
	}
	
	
	//9. ID�ߺ�Ȯ�� �޼ҵ� ����
	public int confirmId(String mem_id) {
		connect(); //����Ŭ ���� �޼ҵ� ȣ��
		
		int idDupulication = 0;	//id�ߺ� ���� üũ ����
		
		try {
			//����ǥ�� �ִ°� prparestatement ����̶�� �Ѵ�. ���ȿ� �� ���Ƽ� sql������ ����� ����Ѵ�.
			//����ǥ�� �Ѿ�� ���̰�, ���߿� �� ���� ���ؼ� �ڵ带 ó���ؾ� �Ѵ�. 
			String confirmed_SELECT = "select mem_id from member where mem_id=?";
			
			//Ŀ�ؼ� ��ü�� ���ؼ� pstmt�� �����. 
			//preparestatement()�� ���������� �ָ� ���������� ���� preparestatement�� ���������.
			pstmt = conn.prepareStatement(confirmed_SELECT);
			
			//����ǥ ���� �������ִ� ���.
			pstmt.setString(1, mem_id);//ù��° �Ѿ�� ���� mem_id�� �ϰڴ�?   �� �̰Ź����̾� 
			
			//executeQuery�� ��������޼ҵ��. ����� rs�� �־��ֱ�.
			//�� ������ "select mem_id from member where mem_id=test"; �� �Ǿ� ����ȴ�.
			rs = pstmt.executeQuery();
			
			
			//�����κ�.
			//next()�� ����� �Ѿ�°� ������ �ֳ� ���ĸ� �����Ѵ�. ���ϰ��� boolean
			//DB��ȸ�� ����� �ߺ��Ȱ� �ճ� ���ĸ� �ǹ�, ���⼭�� ��ȸ�� id�� ��ġ�Ѱ� �ִ��� �������� �����ϱ� ���� next()�� ����Ѵ�.
			if(rs.next()) {
				idDupulication = 1;	//ID�� �ߺ��� ��� 1�༭ ó��
			}else{
				idDupulication = -1; //ID�� �ߺ��ƴҶ�, ��밡���Ҷ� -1 �ֱ� 
			}
		} catch (Exception e) {
			System.out.println("confirmId() �޼ҵ忡�� �����߻� : " + e);
		} finally {
			disconnect(); //�ڿ�����
		}	
		
		//�ߺ��̸� 1��, ��밡���ϸ� -1�� �����ϰ� �ȴ�.
		return idDupulication;
	}
	//end confirmId()=============================================================================
	
	
	//10. ȸ������ ������ �Է��� �����͸� ���̺� INSERT �ϴ� �޼ҵ� ����
	public boolean insertDB() {
		connect();	//����Ŭ ���� �޼ҵ� ȣ��
		
		try {
			//preparestatement���.. ����ǥ�� ���̺��� �÷� ������ŭ �ֱ� ������ �� 17�� ����.(�ʵ������ �ƴ� ���̺� �÷������̿��� ��)
			String MEMBER_INSERT = "insert into member values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			//�����ϱ�.
			pstmt = conn.prepareStatement(MEMBER_INSERT);
			
			//���� �̸��� �ּ� ���ս�Ű��
			String mem_email = mem_email_id + "@" + mem_email_domain;
			
			
			//����ǥ�� ������ �ֱ�, ù��° ���ڴ� ����ǥ�� �ڸ�, �ι�° ���ڴ� ����� ���� �Է�
			pstmt.setString(1, mem_id);
			pstmt.setString(2, mem_passwd);
			pstmt.setString(3, mem_name);
			pstmt.setString(4, mem_nickname);
			pstmt.setString(5, mem_email);
			pstmt.setString(6, mem_num1);
			pstmt.setString(7, mem_num2);
			pstmt.setString(8, mem_phone);
			pstmt.setString(9, mem_gender);
			pstmt.setInt(10, mem_Birthday1);	//int �ʵ������� setInt()���
			pstmt.setInt(11, mem_Birthday2);
			pstmt.setInt(12, mem_Birthday3);
			pstmt.setString(13, mem_job);
			pstmt.setString(14, zipCode);
			pstmt.setString(15, userAddr1);
			pstmt.setString(16, userAddr2);
			pstmt.setString(17, userAddr3);
			
			pstmt.executeUpdate();	//DML�۾��� �� �� ȣ��Ǵ� �޼ҵ� DML: ���������۾��(insert, update, delete �� ���Ѵ�. )
			
		} catch (Exception e) {
			System.out.println("insertDB() �޼ҵ� ���� : " + e);
		} finally {
			disconnect();
		}
		
		return true;	//���������� insert�۾��� �̷������ 
	}
	//end insertDB()=============================================================================
	
	
	
	//4. Getter, Setter �޼ҵ尡 �ݵ�� �����ؾ߸� �Ѵ�.	
	public String getMem_id() {
		return mem_id;
	}
	public String getMem_passwd() {
		return mem_passwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public String getMem_nickname() {
		return mem_nickname;
	}
	public String getMem_email_id() {
		return mem_email_id;
	}
	public String getMem_email_domain() {
		return mem_email_domain;
	}
	public String getMem_num1() {
		return mem_num1;
	}
	public String getMem_num2() {
		return mem_num2;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public String getMem_gender() {
		return mem_gender;
	}
	public int getMem_Birthday1() {
		return mem_Birthday1;
	}
	public int getMem_Birthday2() {
		return mem_Birthday2;
	}
	public int getMem_Birthday3() {
		return mem_Birthday3;
	}
	public String getMem_job() {
		return mem_job;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getUserAddr1() {
		return userAddr1;
	}
	public String getUserAddr2() {
		return userAddr2;
	}
	public String getUserAddr3() {
		return userAddr3;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public void setMem_passwd(String mem_passwd) {
		this.mem_passwd = mem_passwd;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}
	public void setMem_email_id(String mem_email_id) {
		this.mem_email_id = mem_email_id;
	}
	public void setMem_email_domain(String mem_email_domain) {
		this.mem_email_domain = mem_email_domain;
	}
	public void setMem_num1(String mem_num1) {
		this.mem_num1 = mem_num1;
	}
	public void setMem_num2(String mem_num2) {
		this.mem_num2 = mem_num2;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}
	public void setMem_Birthday1(int mem_Birthday1) {
		this.mem_Birthday1 = mem_Birthday1;
	}
	public void setMem_Birthday2(int mem_Birthday2) {
		this.mem_Birthday2 = mem_Birthday2;
	}
	public void setMem_Birthday3(int mem_Birthday3) {
		this.mem_Birthday3 = mem_Birthday3;
	}
	public void setMem_job(String mem_job) {
		this.mem_job = mem_job;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}
	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}
	public void setUserAddr3(String userAddr3) {
		this.userAddr3 = userAddr3;
	}

	
	
}
