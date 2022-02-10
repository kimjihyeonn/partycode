package JTable만들기;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame{
	//전역 클래스 객체 참조변수 선언
	JTable 			table;
	JScrollPane		scroll;
	
	//컬럼의 제목 배열 객체 생성 및 초기화
	String[] title = {"번호", "이름", "성별", "핸드폰 번호", "이메일"};
	
	//String 2차원 배열 객체 생성 및 초기화
	//데이터를 2차원 배열로 구현함
	String[][] data 
	= {{"1", "박태호", "남자", "010-2315-1234", "park1234@naver.com"},
	   {"2", "김은진", "여자", "010-6523-1256", "kim77@naver.com"},
	   {"3", "손유일", "남자", "010-3425-6512", "son123@gmail.com"},
       {"4", "오수철", "남자", "010-6523-3537", "oh12345@hanmail.net"},
	};

	//생성자 구현
	public JTableTest() {
		setTitle("JTable 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//[중요] 어떤 생성자를 선택하여 객체를 생성을 생성할 것인지 판단
		table = new JTable(data, title); //JTable 객체 생성
		scroll = new JScrollPane(table); //스크롤바 생성
		
		add(scroll);
		
		//[추가] 셀의 크기를 조절하기
		table.getColumnModel().getColumn(0).setPreferredWidth(50); //번호
		table.getColumnModel().getColumn(1).setPreferredWidth(70); //이름
		table.getColumnModel().getColumn(2).setPreferredWidth(120); //성별
		table.getColumnModel().getColumn(3).setPreferredWidth(170); //핸드폰번호
		table.getColumnModel().getColumn(4).setPreferredWidth(200); //이메일
		
		//      너비      높이
		setSize(450, 100);
		setLocation(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JTableTest jtableTest = new JTableTest();

	}

}
