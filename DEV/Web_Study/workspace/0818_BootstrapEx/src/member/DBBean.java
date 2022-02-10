package member;
import java.sql.*;
import java.util.*;

/** DBBean페이지에서 오라클 연동을 진행한다.
DBBean 클래스는 회원(member)테이블과 관련되어 있는 클래스이다. */
public class DBBean {
	//1. 멤버변수( = 프로퍼티라고도 한다. 중간저장소 라고도 한다. 멤버변수, 프로퍼티, 중간저장소 다 같은말로 통용해서 사용)	
	//2. 멤버변수 필드 작성시 이름은 Member_Form의 객체이름과 똑같이 주는게 좋다. 다르게 줘도 상관은 없음.
	//3. 필드의 개수가 총 18개 나와야 한다	
	private String mem_id;
	private String mem_passwd;
	private String mem_name;
	private String mem_nickname;
	
	private String mem_email_id;		//이메일 아이디
	private String mem_email_domain;	//이메일 도메인 
	
	private String mem_num1;			//주민번호 앞 6자리
	private String mem_num2;			//주민번호 뒷 7자리
	
	private String mem_phone;			//핸드폰번호
	private String mem_gender;			//성별
	
	private int mem_Birthday1;			//출생년도
	private int mem_Birthday2;			//출생월
	private int mem_Birthday3;			//출생일
	
	private String mem_job;				//직업
	
	private String zipCode;				//우편번호
	
	private String userAddr1;			//주소
	private String userAddr2;			//상세주소
	private String userAddr3;			//참고항목 주소
	
	
	//5. 오라클  DB연동에 관련된 변수 선언.
	Connection conn		    = null; // 당장은 연결할게 없음으로 NULL을준다.
	PreparedStatement pstmt = null;	// 오라클 연결객체
	ResultSet			 rs = null;	//DB서 쿼리한 결과값
	
	//6. 오라클 JDBC 연동을 위한 driver, url 설정
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url	   = "jdbc:oracle:thin:@localhost:1521:xe";

	
	
	//7. 오라클 연동 메소드 구현 => 반드시 예외처리 필요, 여러번 재사용을 위해 함수처리 해놓음.
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			conn  = DriverManager.getConnection(jdbc_url, "testdb", "testdb1234");
		} catch (Exception e) {
			System.out.println(" 오라클 connect 연결에 대한 에러 " + e);
		}

	}
	
	
	//8. 오라클 JDBC 연동 종료하는 메소드 구현 (자원해제하기, 작업종료되면 오라클 연결도 종료시키기)
	public void disconnect() {
		try {
			pstmt.close();	//자원해제
			conn.close();	//자원해제
			rs.close();		//자원해제
			
		} catch (Exception e) {
			System.out.println("disconnect 자원해제 에러 발생: " + e);
		}
	}
	
	
	//9. ID중복확인 메소드 구현
	public int confirmId(String mem_id) {
		connect(); //오라클 연동 메소드 호출
		
		int idDupulication = 0;	//id중복 여부 체크 변수
		
		try {
			//물음표를 주는걸 prparestatement 방식이라고 한다. 보안에 더 좋아서 sql문장을 만들어 사용한다.
			//물음표는 넘어온 값이고, 나중에 이 값을 비교해서 코드를 처리해야 한다. 
			String confirmed_SELECT = "select mem_id from member where mem_id=?";
			
			//커넥션 객체를 통해서 pstmt를 만든다. 
			//preparestatement()에 참조변수를 주면 참조변수를 가진 preparestatement가 만들어진다.
			pstmt = conn.prepareStatement(confirmed_SELECT);
			
			//물음표 값을 결정해주는 방법.
			pstmt.setString(1, mem_id);//첫번째 넘어온 값을 mem_id로 하겠다?   아 이거뭔말이야 
			
			//executeQuery는 쿼리실행메소드다. 결과를 rs에 넣어주기.
			//이 문장은 "select mem_id from member where mem_id=test"; 가 되어 실행된다.
			rs = pstmt.executeQuery();
			
			
			//로직부분.
			//next()는 결과로 넘어온게 여러개 있냐 없냐를 구분한다. 리턴값은 boolean
			//DB조회한 결과가 중복된게 잇냐 없냐를 의미, 여기서는 조회한 id가 일치한게 있는지 없는지를 구분하기 위해 next()를 사용한다.
			if(rs.next()) {
				idDupulication = 1;	//ID가 중복인 경우 1줘서 처리
			}else{
				idDupulication = -1; //ID가 중복아닐때, 사용가능할때 -1 주기 
			}
		} catch (Exception e) {
			System.out.println("confirmId() 메소드에서 에러발생 : " + e);
		} finally {
			disconnect(); //자원해제
		}	
		
		//중복이면 1을, 사용가능하면 -1을 리턴하게 된다.
		return idDupulication;
	}
	//end confirmId()=============================================================================
	
	
	//10. 회원가입 폼에서 입력한 데이터를 테이블에 INSERT 하는 메소드 구현
	public boolean insertDB() {
		connect();	//오라클 연동 메소드 호출
		
		try {
			//preparestatement방식.. 물음표를 테이블의 컬럼 개수만큼 넣기 ㅋㅋㅋ 총 17개 였음.(필드기준이 아닌 테이블 컬럼기준이여야 함)
			String MEMBER_INSERT = "insert into member values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			//연결하기.
			pstmt = conn.prepareStatement(MEMBER_INSERT);
			
			//먼저 이메일 주소 결합시키기
			String mem_email = mem_email_id + "@" + mem_email_domain;
			
			
			//물음표값 설정해 주기, 첫번째 인자는 물음표의 자리, 두번째 인자는 사용할 값을 입력
			pstmt.setString(1, mem_id);
			pstmt.setString(2, mem_passwd);
			pstmt.setString(3, mem_name);
			pstmt.setString(4, mem_nickname);
			pstmt.setString(5, mem_email);
			pstmt.setString(6, mem_num1);
			pstmt.setString(7, mem_num2);
			pstmt.setString(8, mem_phone);
			pstmt.setString(9, mem_gender);
			pstmt.setInt(10, mem_Birthday1);	//int 필드임으로 setInt()사용
			pstmt.setInt(11, mem_Birthday2);
			pstmt.setInt(12, mem_Birthday3);
			pstmt.setString(13, mem_job);
			pstmt.setString(14, zipCode);
			pstmt.setString(15, userAddr1);
			pstmt.setString(16, userAddr2);
			pstmt.setString(17, userAddr3);
			
			pstmt.executeUpdate();	//DML작업이 할 때 호출되는 메소드 DML: 데이터조작언어(insert, update, delete 가 속한다. )
			
		} catch (Exception e) {
			System.out.println("insertDB() 메소드 에러 : " + e);
		} finally {
			disconnect();
		}
		
		return true;	//정상적으로 insert작업이 이루어지면 
	}
	//end insertDB()=============================================================================
	
	
	
	//4. Getter, Setter 메소드가 반드시 존재해야만 한다.	
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
