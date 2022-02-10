package JTable만들기;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {
	//전역 클래스 객체 참조변수 선언
	JTable            table;
	JScrollPane       scroll;
	//컬럼의 제목 배열 객체 생성 및 초기화
	String[] title = {"번호","이름","성별","핸드폰번호","이메일"};
	
	//String 2차원 배열 객체 생성 및 초기화
	String[][] data 
	     = {{"1","박태호","남자","010-2315-1234","park1234@naver.com"},
			{"2","김은진","여자","010-6523-1256","kim77@naver.com"},
		    {"3","손유일","남자","010-3425-6512","son123@gmail.com"},
			{"4","오수철","남자","010-6523-3537","oh12345@hanmail.net"}
	};
	
	
	//생성자 구현
	public JTableTest() {
		setTitle("JTable 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//[중요]
		table = new JTable(data, title);
		scroll = new JScrollPane(table);
		
		add(scroll);
		
		//[추가] 셀의 크기를 조절하는방법
		table.getColumnModel().getColumn(0).setPreferredWidth(50);//번호
		table.getColumnModel().getColumn(1).setPreferredWidth(70);//번호
		table.getColumnModel().getColumn(2).setPreferredWidth(120);//번호
		table.getColumnModel().getColumn(3).setPreferredWidth(170);//번호
		table.getColumnModel().getColumn(4).setPreferredWidth(200);//번호
		setSize(450, 200);
		setLocation(500, 300);
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		JTableTest jtable = new JTableTest();

	}

}
